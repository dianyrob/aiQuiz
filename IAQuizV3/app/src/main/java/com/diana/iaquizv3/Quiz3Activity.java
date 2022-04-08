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

public class Quiz3Activity extends AppCompatActivity {
    ScrollView sv;
    TextView Quest;
    Button a,b,c,d;
    ImageView sig,ter;
    int calificacion=0;
    int ra=0,rb=0,rc=0,rd=0;
    int questions=0,totalQuestions=129;
    int questionsLimit=40;
    Intent i;
    int[] quest={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    long startTime=0,endTime=0;
    Questions3 q3 = new Questions3();
    QuestionSettings qSet = new QuestionSettings();
    DataStorage da = new DataStorage();
    public String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        name = da.getUsername();
        if(name==null)
            qSet.requestName(Quiz3Activity.this);

        i=new Intent(Quiz3Activity.this, ScoreActivity.class);
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
                i=new Intent(Quiz3Activity.this, ScoreActivity.class);
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
        q3.fillQuestion(Quest, a, b, c, d, noQuest, quest);
    }

    public void correctQuestion(int question, String opt){
        AlertDialog.Builder builder = new AlertDialog.Builder(Quiz3Activity.this);
        AlertDialog alert;
        WindowManager.LayoutParams wmlp;
        switch (question){
            case 1:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 2:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
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
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 7:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 8:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 9:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 10:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 11:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 12:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
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
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
                break;
            case 16:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 17:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 18:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 19:
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
                break;
            case 20:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 21:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
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
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 26:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 27:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 28:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 29:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 30:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 31:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 32:
                qSet.correctC(a,b,c,d,sv);
                addCountC(opt);
                break;
            case 33:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 34:
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
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
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
                break;
            case 38:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 39:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 40:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 41:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 42:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 43:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 44:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 45:
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
                break;
            case 46:
                qSet.correctC(a,b,c,d,sv);
                addCountC(opt);
                break;
            case 47:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 48:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 49:
                qSet.correctC(a,b,c,d,sv);
                addCountC(opt);
                break;
            case 50:
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
                break;
            case 51:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 52:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 53:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 54:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 55:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 56:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 57:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 58:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 59:
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
                break;
            case 60:
                qSet.correctC(a,b,c,d,sv);
                addCountC(opt);
                break;
            case 61:
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
                break;
            case 62:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 63:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 64:
                qSet.correctC(a,b,c,d,sv);
                addCountC(opt);
                break;
            case 65:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 66:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 67:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 68:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 69:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 70:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 71:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 72:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 73:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 74:
                qSet.correctC(a,b,c,d,sv);
                addCountC(opt);
                break;
            case 75:
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
                break;
            case 76:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 77:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 78:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 79:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 80:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 81:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 82:
                qSet.correctC(a,b,c,d,sv);
                addCountC(opt);
                break;
            case 83:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 84:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 85:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 86:
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
                break;
            case 87:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 88:
                qSet.correctC(a,b,c,d,sv);
                addCountC(opt);
                break;
            case 89:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 90:
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
                break;
            case 91:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 92:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 93:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 94:
                qSet.correctC(a,b,c,d,sv);
                addCountC(opt);
                break;
            case 95:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 96:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 97:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 98:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 99:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 100:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 101:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 102:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 103:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 104:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 105:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 106:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 107:
                qSet.correctC(a,b,c,d,sv);
                addCountC(opt);
                break;
            case 108:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 109:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 110:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 111:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 112:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 113:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 114:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 115:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 116:
                qSet.correctC(a,b,c,d,sv);
                addCountC(opt);
                break;
            case 117:
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
                break;
            case 118:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 119:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 120:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 121:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 122:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 123:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 124:
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
                break;
            case 125:
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
                break;
            case 126:
                qSet.correctA(a,b,c,d,sv);
                addCountA(opt);
                break;
            case 127:
                qSet.correctB(a,b,c,d,sv);
                addCountB(opt);
                break;
            case 128:
                qSet.correctC(a,b,c,d,sv);
                addCountC(opt);
                break;
            case 129:
                qSet.correctD(a,b,c,d,sv);
                addCountD(opt);
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