package com.diana.iaquizv3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Random;

public class Quiz6Activity extends AppCompatActivity {
    ScrollView sv;
    TextView Quest;
    Button a,b,c,d;
    ImageView sig,ter;
    int calificacion=0;
    int ra=0,rb=0,rc=0,rd=0;
    int questions=0,totalQuestions=41;
    int questionsLimit=40;
    Intent i;
    int[] quest=new int[41];
    long startTime=0,endTime=0;
    Questions6 q6 = new Questions6();
    QuestionSettings qSet = new QuestionSettings();
    DataStorage da = new DataStorage();
    public String name;
    String correct = null,selected = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz6);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        name = da.getUsername();
        if(name==null)
            qSet.requestName(Quiz6Activity.this);

        i=new Intent(Quiz6Activity.this, ScoreActivity.class);
        Quest=(TextView) findViewById(R.id.Respuestas);
        a=(Button)findViewById(R.id.a1);
        b=(Button)findViewById(R.id.b1);
        c=(Button)findViewById(R.id.c1);
        d=(Button)findViewById(R.id.d1);
        sv = (ScrollView) findViewById(R.id.scrollviewquiz);
        sig=(ImageView)findViewById(R.id.sig1);
        ter=(ImageView)findViewById(R.id.ter);
        orderQeustions();
        getQuestion(quest[questions]);
        sig.setEnabled(false);
        qSet.clearColor(a,b,c,d);
        startTime = System.currentTimeMillis()/1000;
    }

    @Override
    public void onBackPressed () { }

    public void responder(View v) {
        switch(v.getId()){
            case R.id.a1:
                qSet.deshabilitar(a,b,c,d,sig);
                selected = "a";
                setCorrect(correct,selected);
                setInorrect(correct,selected);
                break;
            case R.id.b1:
                qSet.deshabilitar(a,b,c,d,sig);
                selected = "b";
                setCorrect(correct,selected);
                setInorrect(correct,selected);
                break;
            case R.id.c1:
                qSet.deshabilitar(a,b,c,d,sig);
                selected = "c";
                setCorrect(correct,selected);
                setInorrect(correct,selected);
                break;
            case R.id.d1:
                qSet.deshabilitar(a,b,c,d,sig);
                selected = "d";
                setCorrect(correct,selected);
                setInorrect(correct,selected);
                break;
            case R.id.sig1:
                questions+=1;
                if(questions<questionsLimit){
                    getQuestion(quest[questions]);;
                    qSet.clearColor(a,b,c,d);
                    qSet.habilitar(a,b,c,d,sig,sv);
                }else{
                    endTime = (System.currentTimeMillis()/1000) - startTime;
                    calificacion=ra+rb+rc+rd;
                    i.putExtra("calificacion",calificacion);
                    i.putExtra("total",questionsLimit);
                    i.putExtra("dur",endTime);
                    startActivity(i);
                    finish();
                }
                break;
            case R.id.ter:
                endTime = (System.currentTimeMillis()/1000) - startTime;
                calificacion=ra+rb+rc+rd;
                i=new Intent(Quiz6Activity.this, ScoreActivity.class);
                i.putExtra("dur",endTime);
                i.putExtra("calificacion",calificacion);
                i.putExtra("total",questionsLimit);
                startActivity(i);
                finish();
                break;
            default:
                break;
        }
    }



    public void orderQeustions(){
        Boolean ban=true;
        Random rnd = new Random();
        int rndNum=0,pos=0;
        for(int i=1;i<=totalQuestions;i++){
            rndNum=(rnd.nextInt(totalQuestions-1+1)+1);
            while(ban==true){
                pos=rndNum-1;
                if(quest[pos]==0){
                    quest[pos]=i;
                    ban=false;
                }else{
                    if(rndNum==totalQuestions){
                        rndNum=1;
                    }else{
                        rndNum+=1;
                    }
                }
            };
            ban=true;
        }
    }

    public void getQuestion(int question){
        int quest = question;
        int noQuest = questions + 1;
        correct = q6.fillQuestion(Quest, a, b, c, d, noQuest, quest);
    }

    public void setCorrect(String opt, String selected){
        switch (opt){
            case "a":
                qSet.correctA(a,b,c,d,sv);
                if(opt.equals(selected))
                    ra+=1;
                break;
            case "b":
                qSet.correctB(a,b,c,d,sv);
                if(opt.equals(selected))
                    rb += 1;
                break;
            case "c":
                qSet.correctC(a,b,c,d,sv);
                if(opt.equals(selected))
                    rc += 1;
                break;
            case "d":
                qSet.correctD(a,b,c,d,sv);
                if(opt.equals(selected))
                    rd += 1;
                break;
        }
    }
    public void setInorrect(String opt, String selected){
        switch (selected){
            case "a":
                if(!opt.equals(selected))
                    qSet.incorrectBtn(a,sv);
                break;
            case "b":
                if(!opt.equals(selected))
                    qSet.incorrectBtn(b,sv);
                break;
            case "c":
                if(!opt.equals(selected))
                    qSet.incorrectBtn(c,sv);
                break;
            case "d":
                if(!opt.equals(selected))
                    qSet.incorrectBtn(d,sv);
                break;
        }
    }
}