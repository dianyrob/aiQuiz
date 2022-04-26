package com.diana.iaquizv3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Random;

public class RandomQuizActivity extends AppCompatActivity {

    ScrollView sv;
    TextView Quest,qNum;
    Button a,b,c,d;
    ImageView sig,ter;
    int calificacion=0, populate = 0;
    int ra=0,rb=0,rc=0,rd=0;
    int questions=0,totalQuestions=40;
    int questionsLimit=70;
    Intent i;
    String correct = null,selected = null;
    long startTime=0,endTime=0;
    int[] quest=new int[70];
    int[] t1 = new int[63];
    int[] t2 = new int[59];
    int[] t3 = new int[129];
    int[] t4 = new int[129];//missing
    int[] t5 = new int[38];
    int[] t6 = new int[41];
    int[] t7 = new int[41];
    Questions1 q1 = new Questions1();
    Questions2 q2 = new Questions2();
    Questions3 q3 = new Questions3();
    Questions5 q5 = new Questions5();
    Questions6 q6 = new Questions6();
    Questions7 q7 = new Questions7();
    QuestionSettings qSet = new QuestionSettings();
    DataStorage da = new DataStorage();
    public String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_quiz);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        name = da.getUsername();
        if(name==null)
            qSet.requestName(RandomQuizActivity.this);

        i=new Intent(RandomQuizActivity.this, ScoreActivity.class);
        Quest=(TextView) findViewById(R.id.Respuestas);
        //qNum=(TextView) findViewById();
        a=(Button)findViewById(R.id.a1);
        b=(Button)findViewById(R.id.b1);
        c=(Button)findViewById(R.id.c1);
        d=(Button)findViewById(R.id.d1);
        sv = (ScrollView) findViewById(R.id.scrollviewquiz);
        sig=(ImageView) findViewById(R.id.sig1);
        ter=(ImageView) findViewById(R.id.ter);
        t1 = orderQeustions(t1.length,t1);
        t2 = orderQeustions(t2.length,t2);
        t3 = orderQeustions(t3.length,t3);
        t4 = orderQeustions(t4.length,t4);
        t5 = orderQeustions(t5.length,t5);
        t6 = orderQeustions(t6.length,t6);
        t7 = orderQeustions(t7.length,t7);
        fillQuest(0,t1);
        fillQuest(10,t2);
        fillQuest(20,t3);
        fillQuest(30,t4);
        fillQuest(40,t5);
        fillQuest(50,t6);
        fillQuest(60,t7);

        getQuestion(quest[questions]);
        sig.setEnabled(false);
        qSet.clearColor(a,b,c,d);
        startTime = System.currentTimeMillis()/1000;
    }
    public void fillQuest(int startVal, int[] testQuestion){
        for(int i=0;i<10;i++){
            quest[startVal]=testQuestion[i];
            startVal++;
        }
    }

    @Override
    public void onBackPressed () {
        Intent intent = new Intent(RandomQuizActivity.this, ModulosActivity.class);
        startActivity(intent);
        finish();
    }

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
                i=new Intent(RandomQuizActivity.this, ScoreActivity.class);
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

    public int[] orderQeustions(int totalQ, int[] test){
        int[] quest = test;
        Boolean ban=true;
        Random rnd = new Random();
        int rndNum=0,pos=0;
        for(int i=1;i<=totalQ;i++){
            rndNum=(rnd.nextInt(totalQ-1+1)+1);
            while(ban==true){
                pos=rndNum-1;
                if(quest[pos]==0){
                    quest[pos]=i;
                    ban=false;
                }else{
                    if(rndNum==totalQ){
                        rndNum=1;
                    }else{
                        rndNum+=1;
                    }
                }
            };
            ban=true;
        }
        return quest;
    }

    public void getQuestion(int question){
        int quest = question;
        int noQuest = questions + 1;
        switch (noQuest){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                correct = q1.fillQuestion(Quest, a, b, c, d, noQuest, quest);
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                correct = q2.fillQuestion(Quest, a, b, c, d, noQuest, quest);
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                correct = q3.fillQuestion(Quest, a, b, c, d, noQuest, quest);
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                qNum.setText(questions+".");
                Quest.setText(questions+". In this stage deployed solution may be replaced due to concept, as better algorithms become available, or because of some major failures in performance. ");
                a.setText("A) Evaluation");
                b.setText("B) Deployment");
                c.setText("C) Operations");
                d.setText("D) Optimization");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                correct = q5.fillQuestion(Quest, a, b, c, d, noQuest, quest);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                correct = q6.fillQuestion(Quest, a, b, c, d, noQuest, quest);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
                correct = q7.fillQuestion(Quest, a, b, c, d, noQuest, quest);
                break;
        }
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
