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

public class Quiz2Activity extends AppCompatActivity {

    ScrollView sv;
    TextView Quest,qNum;
    Button a,b,c,d;
    ImageView sig,ter;
    int calificacion=0;
    int ra=0,rb=0,rc=0,rd=0;
    int questions=1,totalQuestions=59;
    Intent i;
    int[] quest={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    long startTime=0,endTime=0;
    Questions2 q2 = new Questions2();
    QuestionSettings qSet = new QuestionSettings();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        i=new Intent(Quiz2Activity.this, ScoreActivity.class);
        Quest=(TextView) findViewById(R.id.Respuestas);
        //qNum=(TextView) findViewById();
        qNum=(TextView) findViewById(R.id.question);
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
                if(questions<totalQuestions){
                    getQuestion(quest[questions]);;
                    qSet.clearColor(a,b,c,d);
                    qSet.habilitar(a,b,c,d,sig,sv);
                }else{
                    endTime = (System.currentTimeMillis()/1000) - startTime;
                    calificacion=ra+rb+rc+rd;
                    i.putExtra("calificacion",calificacion);
                    i.putExtra("total",totalQuestions);
                    i.putExtra("dur",endTime);
                    startActivity(i);
                    finish();
                }
                break;
            case R.id.ter:
                endTime = (System.currentTimeMillis()/1000) - startTime;
                calificacion=ra+rb+rc+rd;
                i=new Intent(Quiz2Activity.this, ScoreActivity.class);
                i.putExtra("dur",endTime);
                i.putExtra("calificacion",calificacion);
                i.putExtra("total",totalQuestions);
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
        switch (question){
            case 1:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 2:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 3:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 4:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 5:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 6:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 7:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 8:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 9:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 10:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 11:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 12:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 13:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 14:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 15:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 16:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 17:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 18:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 19:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 20:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 21:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 22:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 23:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 24:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 25:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 26:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 27:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 28:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 29:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 30:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 31:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 32:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 33:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 34:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 35:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 36:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 37:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 38:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);;
                break;
            case 39:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 40:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 41:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 42:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 43:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 44:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 45:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 46:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 47:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 48:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 49:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 50:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 51:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 52:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 53:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 54:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 55:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 56:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 57:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 58:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
            case 59:
                q2.fillQuestion(Quest, qNum, a, b, c, d, questions, question);
                break;
        }
    }

    public void correctQuestion(int question, String opt){
        AlertDialog.Builder builder = new AlertDialog.Builder(Quiz2Activity.this);
        AlertDialog alert;
        WindowManager.LayoutParams wmlp;
        switch (question){
            case 1:
                qSet.correctA(a,b,c,d);
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 2:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 3:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 4:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 5:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 6:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 7:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 8:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 9:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 10:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 11:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 12:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 13:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 14:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 15:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 16:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 17:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 18:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 19:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 20:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 21:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 22:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 23:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 24:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 25:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 26:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 27:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 28:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 29:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 30:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 31:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 32:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 33:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 34:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 35:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 36:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 37:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 38:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 39:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 40:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 41:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 42:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 43:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 44:
                qSet.correctA(a,b,c,d);
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 45:
                qSet.correctA(a,b,c,d);
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 46:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 47:
                qSet.correctA(a,b,c,d);
                if(opt.equals("c")){
                    rc+=1;
                }
                break;
            case 48:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 49:
                qSet.correctA(a,b,c,d);
                if(opt.equals("c")){
                    rc+=1;
                }
                break;
            case 50:
                qSet.correctA(a,b,c,d);
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 51:
                qSet.correctA(a,b,c,d);
                if(opt.equals("c")){
                    rc+=1;
                }
                break;
            case 52:
                qSet.correctA(a,b,c,d);
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 53:
                qSet.correctB(a,b,c,d);
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 54:
                qSet.correctA(a,b,c,d);
                if(opt.equals("c")){
                    rc+=1;
                }
                break;
            case 55:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 56:
                qSet.correctA(a,b,c,d);
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 57:
                qSet.correctA(a,b,c,d);
                if(opt.equals("c")){
                    rc+=1;
                }
                break;
            case 58:
                qSet.correctA(a,b,c,d);
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 59:
                qSet.correctA(a,b,c,d);
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
        }
    }
    
}