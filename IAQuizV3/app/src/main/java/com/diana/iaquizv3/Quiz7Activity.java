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
    TextView Quest,qNum;
    Button a,b,c,d;
    ImageView sig,ter;
    int calificacion=0;
    int ra=0,rb=0,rc=0,rd=0;
    int questions=1,totalQuestions=41;
    Intent i;
    int[] quest={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    long startTime=0,endTime=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz7);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        i=new Intent(Quiz7Activity.this, ScoreActivity.class);
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
        clearColor();
        startTime = System.currentTimeMillis()/1000;
    }
    public void responder(View v) {
        switch(v.getId()){
            case R.id.a1:
                deshabilitar();
                correctQuestion(quest[questions],"a");
                break;
            case R.id.b1:
                deshabilitar();
                correctQuestion(quest[questions],"b");
                calificacion=0;
                break;
            case R.id.c1:
                deshabilitar();
                correctQuestion(quest[questions],"c");
                calificacion=0;
                break;
            case R.id.d1:
                deshabilitar();
                correctQuestion(quest[questions],"d");
                calificacion=1;
                break;
            case R.id.sig1:
                questions+=1;
                if(questions<totalQuestions){
                    getQuestion(quest[questions]);;
                    clearColor();
                    habilitar();
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
                i=new Intent(Quiz7Activity.this, ScoreActivity.class);
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
                qNum.setText(questions+".");
                Quest.setText("AI can assist and support various activities of the testing and development process such as:");
                a.setText("A) Test planning, creating tests and test data");
                b.setText("B) Impact analysis and selection of test for regression");
                c.setText("C) Test result analysis and defect prediction");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 2:
                qNum.setText(questions+".");
                Quest.setText("AI can assist and support various activities of the testing and development process such as:");
                a.setText("A) Predicting the component causing the bug");
                b.setText("B) Defect assignment");
                c.setText("C) Test automation");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 3:
                qNum.setText(questions+".");
                Quest.setText("AI can assist and support various activities of the testing and development process such as:");
                a.setText("A) Definition of requirements");
                b.setText("B) UX design");
                c.setText("C) User experience design");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 4:
                qNum.setText(questions+".");
                Quest.setText("Is the activity of the test planning where the AI can help doing estimation of resources and time needed for a project");
                a.setText("A) Test planning");
                b.setText("B) Test estimation");
                c.setText("C) Test execution");
                d.setText("D) Risk analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 5:
                qNum.setText(questions+".");
                Quest.setText("Is the activity of the test planning where the AI can help with contribution factors, likelihood and impact");
                a.setText("A) Test planning");
                b.setText("B) Test estimation");
                c.setText("C) Test execution");
                d.setText("D) Risk analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 6:
                qNum.setText(questions+".");
                Quest.setText("AI can help in the test planning to prioritize risks, obtain more accurate metrics associated with schedule adherence, and help identifying the performance metrics of applications more accurately");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 7:
                qNum.setText(questions+".");
                Quest.setText("AI can’t help in the test planning to prioritize risks, can’t obtain more accurate metrics associated with schedule adherence, and can’t help identifying the performance metrics of applications more accurately");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 8:
                qNum.setText(questions+".");
                Quest.setText("In the context of test planning and estimation, overall software project cost can be approximated, taking into account different inputs related to the AI projects, including data size, effort involved, platform choice, application type, data preparation time, training time, and testing time");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 9:
                qNum.setText(questions+".");
                Quest.setText("In the context of test planning and estimation, overall software project cost can be calculated in exact way, taking into account different inputs related to the AI projects, including data size, effort involved, platform choice, application type, data preparation time, training time, and testing time");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 10:
                qNum.setText(questions+".");
                Quest.setText("Having some historical data from different inputs, ML models can be prepared to give more accurate estimations ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 11:
                Quest.setText("Without historical data from different inputs, ML models can be prepared to give more accurate estimations ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 12:
                qNum.setText(questions+".");
                Quest.setText("What can help to determine: Factors contributing to the risk: Possible probabilities of the risk becoming a reality: Ability to meet the goals and milestones: Performance analysis of teams, individuals?");
                a.setText("A) Testing cycle");
                b.setText("B) Neuronal networks");
                c.setText("C) Artificial intelligence");
                d.setText("D) Risk Analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 13:
                qNum.setText(questions+".");
                Quest.setText("Generating realistic test data is one of the critical problems in testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 14:
                qNum.setText(questions+".");
                Quest.setText("Generating realistic test data is one of the easy tasks in testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 15:
                qNum.setText(questions+".");
                Quest.setText("Production data anonymization/masking has its own challenges; Synthetic data may miss many nuances of real-world data; Image data is harder to produce, are:");
                a.setText("A) Ways to get data for AI testing");
                b.setText("B) Problems defining the requirements");
                c.setText("C) Way to generate data for AI testing");
                d.setText("D) Problems in AI testing");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 16:
                qNum.setText(questions+".");
                Quest.setText("For test design, using AI technologies, like natural language processing (NLP) and text mining, can help the automated test case generation from textual requirements documents ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 17:
                qNum.setText(questions+".");
                Quest.setText("For test design, using AI technologies, like natural language processing (NLP) and text mining, doesn’t help the automated test case generation from textual requirements documents ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 18:
                qNum.setText(questions+".");
                Quest.setText("AI applied on code analysis (both static and dynamic), along with the analysis of the data collected from tests, can flag potential issues of performance and other non-functional requirements ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 19:
                qNum.setText(questions+".");
                Quest.setText("AI applied on code analysis (both static and dynamic), along with the analysis of the data collected from tests, is not useful to detect issues of performance and other non-functional requirements ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 20:
                qNum.setText(questions+".");
                Quest.setText("Running ML on past data can help identifying test data patterns and helps generating automated test data for both component tests and system tests. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 21:
                qNum.setText(questions+".");
                Quest.setText("Running ML on past data doesn’t help identifying test data patterns and helps generating automated test data for both component tests and system tests. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 22:
                qNum.setText(questions+".");
                Quest.setText("For image data and GUI elements, AI can help identify incorrectly rendered elements automatically. Additionally, by an ML based data centric analysis of different possible flows, the right flows of data can be automated. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 23:
                qNum.setText(questions+".");
                Quest.setText("For image data and GUI elements, AI doesn’t help identify incorrectly rendered elements automatically. Additionally, by an ML based data centric analysis of different possible flows, the right flows of data can be automated. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 24:
                qNum.setText(questions+".");
                Quest.setText("Is done using the classification technique (e.g. Logistic Regression) to predict faults");
                a.setText("A) AI Machine Learning");
                b.setText("B) AI Defect Prediction");
                c.setText("C) AI-Based Machine Learning ");
                d.setText("D) AI-Based Defect Prediction ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 25:
                qNum.setText(questions+".");
                Quest.setText("For automated defect prediction, models using ML can predict defect based on code quality metrics");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 26:
                qNum.setText(questions+".");
                Quest.setText("For automated defect prediction, models using ML can’t predict defect based on code quality metrics");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 27:
                qNum.setText(questions+".");
                Quest.setText("Impact analysis using ML on code can help automate the identification of impacted modules and files based on change");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 28:
                qNum.setText(questions+".");
                Quest.setText("Impact analysis using Augmented Reality on code can help automate the identification of impacted modules and files based on change");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 29:
                qNum.setText(questions+".");
                Quest.setText("In terms of coverage analysis using AI can help achieve comprehensive test and code coverage via the analysis of the data flows captured");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 30:
                qNum.setText(questions+".");
                Quest.setText("In terms of coverage analysis using AR can help achieve comprehensive test and code coverage via the analysis of the data flows captured ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 31:
                qNum.setText(questions+".");
                Quest.setText("Dashboards can be made dynamic and smart by using AI");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 32:
                qNum.setText(questions+".");
                Quest.setText("Dashboards can’t be made dynamic and smart by using AI ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 33:
                qNum.setText(questions+".");
                Quest.setText("Data driven ML algorithms extract intelligence by crunching input data and produce smart outputs");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 34:
                qNum.setText(questions+".");
                Quest.setText("Data driven ML algorithms extract intelligence by crunching input data but don’t produce smart outputs ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 35:
                qNum.setText(questions+".");
                Quest.setText("Some of automation tools use AI for making automation easier or more maintainable.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 36:
                qNum.setText(questions+".");
                Quest.setText("None of automation tools use AI for making automation easier or more maintainable.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 37:
                qNum.setText(questions+".");
                Quest.setText("AI tools could use GUI Spiders which traverse the complete GUI and record the app. Over iterations, they are able to learn, compare and identify bugs");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 38:
                qNum.setText(questions+".");
                Quest.setText("AI tools could use GUI Spiders which traverse the complete GUI and record the app. Over iterations, they need something else to learn, compare and identify bugs");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 39:
                qNum.setText(questions+".");
                Quest.setText("This type of tool uses image processing technology instead of pixel comparison, can check various UI attributes such as color, positioning, size, etc., can find differences that are likely to be missed by testers.");
                a.setText("A) Visual, automated UI testing tools");
                b.setText("B) GUI Spiders tools");
                c.setText("C) API testing tools");
                d.setText("D) AI-Based Test Automation tools");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 40:
                qNum.setText(questions+".");
                Quest.setText("This type of tool uses ML and traverses the complete GUI and records the app, over iterations, it is able to learn, compare and identify bugs, may analyze GUI, DOM, performance, etc.");
                a.setText("A) Visual, automated UI testing tools");
                b.setText("B) GUI Spiders tools");
                c.setText("C) API testing tools");
                d.setText("D) AI-Based Test Automation tools");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 41:
                qNum.setText(questions+".");
                Quest.setText("This type of tool learn the APIs, the parameter variation and also sequences, etc., especially when there is no GUI to be tested.");
                a.setText("A) Visual, automated UI testing tools");
                b.setText("B) GUI Spiders tools");
                c.setText("C) API testing tools");
                d.setText("D) AI-Based Test Automation tools");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
        }
    }

    public void correctQuestion(int question, String opt){
        AlertDialog.Builder builder = new AlertDialog.Builder(Quiz7Activity.this);
        AlertDialog alert;
        WindowManager.LayoutParams wmlp;
        switch (question){
            case 1:
                correctD();
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 2:
                correctD();
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 3:
                correctD();
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 4:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 5:
                correctD();
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 6:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 7:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 8:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 9:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 10:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 11:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 12:
                correctC();
                if(opt.equals("c")){
                    rc+=1;
                }
                break;
            case 13:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 14:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 15:
                correctD();
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 16:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 17:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 18:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 19:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 20:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 21:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 22:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 23:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 24:
                correctD();
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 25:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 26:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 27:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 28:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 29:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 30:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 31:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 32:
                correctB();
                if(opt.equals("B")){
                    rb+=1;
                }
                break;
            case 33:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 34:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 35:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 36:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 37:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 38:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 39:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 40:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 41:
                correctC();
                if(opt.equals("c")){
                    rc+=1;
                }
                break;
        }
    }
    public void correctA(){
        setColorAg();
        setColorBr();
        setColorCr();
        setColorDr();
    }
    public void correctB(){
        setColorAr();
        setColorBg();
        setColorCr();
        setColorDr();
    }
    public void correctC(){
        setColorAr();
        setColorBr();
        setColorCg();
        setColorDr();
    }
    public void correctD(){
        setColorAr();
        setColorBr();
        setColorCr();
        setColorDg();
    }

    public void deshabilitar(){
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        sig.setEnabled(true);

    }
    public void habilitar(){
        a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        sig.setEnabled(false);
        sv.fullScroll(ScrollView.FOCUS_UP);
    }

    public void setColorAr(){
        a.setBackgroundColor(Color.RED);
    }
    public void setColorBr(){
        b.setBackgroundColor(Color.RED);
    }
    public void setColorCr(){
        c.setBackgroundColor(Color.RED);
    }
    public void setColorDr(){
        d.setBackgroundColor(Color.RED);
    }
    public void setColorAg(){
        a.setBackgroundColor(Color.GREEN);
    }
    public void setColorBg(){
        b.setBackgroundColor(Color.GREEN);
    }
    public void setColorCg(){
        c.setBackgroundColor(Color.GREEN);
    }
    public void setColorDg(){
        d.setBackgroundColor(Color.GREEN);
    }

    public void clearColor(){
        a.setBackgroundColor(Color.LTGRAY);
        b.setBackgroundColor(Color.LTGRAY);
        c.setBackgroundColor(Color.LTGRAY);
        d.setBackgroundColor(Color.LTGRAY);
        //sig.setBackgroundColor(Color.LTGRAY);
    }

    public void salir(View view) {
        finish();
    }
}