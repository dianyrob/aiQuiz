package com.diana.iaquizv3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Random;

public class Quiz7Activity extends AppCompatActivity {
    ScrollView sv;
    TextView Quest;
    Button a,b,c,d;
    ImageView sig,ter;
    int calificacion=0;
    int ra=0,rb=0,rc=0,rd=0;
    int questions=0,totalQuestions=41;
    int questionsLimit=40;
    Intent i;
    int[] quest={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    long startTime=0,endTime=0;
    Questions7 q7 = new Questions7();
    QuestionSettings qSet = new QuestionSettings();
    DataStorage da = new DataStorage();
    public String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz7);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        name = da.getUsername();
        if(name==null)
            qSet.requestName(Quiz7Activity.this);

        i=new Intent(Quiz7Activity.this, ScoreActivity.class);
        Quest=(TextView) findViewById(R.id.Respuestas);
        //qNum=(TextView) findViewById();
        //qNum=(TextView) findViewById(R.id.question);
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
    public void onBackPressed () {

    }
    public void responder(View v) {
        switch(v.getId()){
            case R.id.a1:
                qSet.deshabilitar(a,b,c,d,sig);
                correctQuestion(quest[questions],"a");
                break;
            case R.id.b1:
                qSet.deshabilitar(a,b,c,d,sig);
                correctQuestion(quest[questions],"b");
                calificacion=0;
                break;
            case R.id.c1:
                qSet.deshabilitar(a,b,c,d,sig);
                correctQuestion(quest[questions],"c");
                calificacion=0;
                break;
            case R.id.d1:
                qSet.deshabilitar(a,b,c,d,sig);
                correctQuestion(quest[questions],"d");
                calificacion=1;
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
                i=new Intent(Quiz7Activity.this, ScoreActivity.class);
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
        q7.fillQuestion(Quest, a, b, c, d, noQuest, quest);
    }

    public void correctQuestion(int question, String opt){
        AlertDialog.Builder builder = new AlertDialog.Builder(Quiz7Activity.this);
        AlertDialog alert;
        WindowManager.LayoutParams wmlp;
        switch (question){
            case 1:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 2:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 3:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 4:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 5:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 6:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 7:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 8:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 9:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 10:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 11:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 12:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 13:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 14:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 15:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 16:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 17:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 18:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 19:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 20:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 21:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 22:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 23:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 24:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 25:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 26:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 27:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 28:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 29:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 30:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 31:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 32:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 33:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 34:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 35:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 36:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 37:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 38:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 39:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 40:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 41:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
        }
    }
    public void addCountD(String opt) {
        if (opt.equals("d")) {
            rd += 1;
        }
    }
    public void addCountC(String opt) {
        if (opt.equals("c")) {
            rc += 1;
        }
    }
    public void addCountB(String opt) {
        if (opt.equals("b")) {
            rb += 1;
        }
    }
    public void addCountA(String opt){
        if(opt.equals("a")){
            ra+=1;
        }
    }
}