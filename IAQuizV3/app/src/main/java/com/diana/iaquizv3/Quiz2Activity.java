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
                qNum.setText(questions+".");
                Quest.setText("How can be performed the testing of AI Systems?");
                a.setText("A) At the stage of training the algorithm");
                b.setText("B) As in the design cycle");
                c.setText("C) As part of the system testing");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 2:
                qNum.setText(questions+".");
                Quest.setText("While testing AI Systems we will treat the algorithm as a black box and look at testing as part of system testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 3:
                qNum.setText(questions+".");
                Quest.setText("While testing AI Systems we won’t treat the algorithm as a black box and look at testing as part of system testing ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 4:
                qNum.setText(questions+".");
                Quest.setText("Testing AI systems is a two-stage process: Testing the trained model and Testing the integrated system.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 5:
                qNum.setText(questions+".");
                Quest.setText("Testing AI systems is a four-stage process: Testing the trained model, Testing the integrated system, Testing the AI and Testing the non-AI system components.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 6:
                qNum.setText(questions+".");
                Quest.setText("What kind of testing is done in a trained model?");
                a.setText("A) Online testing");
                b.setText("B) Offline testing");
                c.setText("C) Functional testing");
                d.setText("D) Regression testing");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 7:
                qNum.setText(questions+".");
                Quest.setText("What kind of testing is done in integrated system");
                a.setText("A) Online testing");
                b.setText("B) Offline testing");
                c.setText("C) Functional testing");
                d.setText("D) Regression testing");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 8:
                qNum.setText(questions+".");
                Quest.setText("In this phase, the trained model is tested. Various metrics are used for evaluation parameters for a trained model to verify how far it has achieved the objectives.");
                a.setText("A) Online testing");
                b.setText("B) Offline testing");
                c.setText("C) Functional testing");
                d.setText("D) Regression testing");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 9:
                qNum.setText(questions+".");
                Quest.setText("In this phase, the integration of the trained model with the rest of the system, including all other AI and non-AI components, is tested. Both functional and non-functional tests such as performance tests can be performed");
                a.setText("A) Online testing");
                b.setText("B) Offline testing");
                c.setText("C) Functional testing");
                d.setText("D) Regression testing");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 10:
                qNum.setText(questions+".");
                Quest.setText("Since the inputs to the system can be non-textual, unstructured inputs, as well automation support for some of the tests related to the ML part, may be limited, based on the tool being used.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 11:
                qNum.setText(questions+".");
                Quest.setText("Since the inputs to the system can be non-textual, unstructured inputs, as well automation support for some of the tests related to the ML part, won’t be limited, based on the tool being used.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("C) ");
                d.setText("D) ");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 12:
                qNum.setText(questions+".");
                Quest.setText("Testing AI Systems is not deterministic. The results of the test are probabilities");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 13:
                qNum.setText(questions+".");
                Quest.setText("Testing AI Systems is deterministic. The results of the test are well defined");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 14:
                qNum.setText(questions+".");
                Quest.setText("Test oracles for AI systems are not easily available");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 15:
                qNum.setText(questions+".");
                Quest.setText("Test oracles for AI systems are easily available");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("C) ");
                d.setText("D) ");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 16:
                qNum.setText(questions+".");
                Quest.setText("Data are the test cases for the AI");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 17:
                qNum.setText(questions+".");
                Quest.setText("Data are the test cases for the neuronal networks");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 18:
                qNum.setText(questions+".");
                Quest.setText("Data pre-processing and clean up constitute a vital part of AI system testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 19:
                qNum.setText(questions+".");
                Quest.setText("Data pre-processing and clean up constitute is not considered as part of AI system testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 20:
                qNum.setText(questions+".");
                Quest.setText("The internals of learning systems are generally not easy to understand");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 21:
                qNum.setText(questions+".");
                Quest.setText("The internals of learning systems are very easy to understand");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 22:
                qNum.setText(questions+".");
                Quest.setText("The explainability of the results is difficult for ML and nearly impossible for DL systems");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 23:
                qNum.setText(questions+".");
                Quest.setText("The explainability of the results is easy for ML and very possible for DL systems");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 24:
                qNum.setText(questions+".");
                Quest.setText("AI systems logic is generated based on the data used to train the model");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 25:
                qNum.setText(questions+".");
                Quest.setText("AI Systems logic is not generated based on the data used to train the model");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 26:
                qNum.setText(questions+".");
                Quest.setText("AI Systems logic is not available for examination, especially neural nets. This makes it difficult to understand why a particular output was produced. A correct or desired answer doesn’t guarantee correct functioning.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 27:
                qNum.setText(questions+".");
                Quest.setText("AI Systems logic is always available for examination, especially neural nets. This makes it difficult to understand why a particular output was produced. A correct or desired answer doesn’t guarantee correct functioning.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 28:
                qNum.setText(questions+".");
                Quest.setText("Testing in the offline phase is an additional step which requires specialized skills and techniques for testing the trained model");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 29:
                qNum.setText(questions+".");
                Quest.setText("Testing in the offline phase is an step which anyone can do without specialized skills and techniques for testing the trained model");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 30:
                qNum.setText(questions+".");
                Quest.setText("Testing in the online phase requires a deep understanding of how AI systems work and how to integrate these with other AI and non-AI systems. As a consequence, it calls for an increased for diverse test design techniques.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 31:
                qNum.setText(questions+".");
                Quest.setText("Testing in the online phase requires a deep understanding of how AI systems work and how to integrate these with other AI and non-AI systems. As a consequence, it calls for a decreased for test design techniques.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 32:
                qNum.setText(questions+".");
                Quest.setText("Black-box testing methods and conventional testing are also applicable to AI based systems testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 33:
                qNum.setText(questions+".");
                Quest.setText("Black-box testing methods and conventional testing are not applicable to AI based systems testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 34:
                qNum.setText(questions+".");
                Quest.setText("Similar to non-AI systems, both functional and non-functional tests need to be executed for AI systems");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 35:
                qNum.setText(questions+".");
                Quest.setText("Functional and non-functional tests are not required to be executed for AI systems ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 36:
                qNum.setText(questions+".");
                Quest.setText("Online phase testing can be performed as normal black-box system and system integration testing without worrying whether there are one or more AI components in the mix.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 37:
                qNum.setText(questions+".");
                Quest.setText("Online phase testing cannot be performed as normal black-box system and system integration testing without worrying whether there are one or more AI components in the mix.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 38:
                qNum.setText(questions+".");
                Quest.setText("The behaviors of Learning Systems depend on the input data");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 39:
                qNum.setText(questions+".");
                Quest.setText("The behaviors of Learning Systems depend on the tester experience");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 40:
                qNum.setText(questions+".");
                Quest.setText("Different data used in the testing will lead to potentially different behaviors");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 41:
                qNum.setText(questions+".");
                Quest.setText("Different data used in the testing will lead to the same behaviors ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 42:
                qNum.setText(questions+".");
                Quest.setText("For AI systems, test data = test cases");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 43:
                qNum.setText(questions+".");
                Quest.setText("For AI systems, test data = the user requirements ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 44:
                qNum.setText(questions+".");
                Quest.setText("Some of the important characteristics from the AI testing perspective are:");
                a.setText("A) Functional suitability, Reliability, Performance efficiency");
                b.setText("B) Maintainability, Complexity, Scalability, Continuous learning ");
                c.setText("C) None of the above");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 45:
                qNum.setText(questions+".");
                Quest.setText("While evaluating AI Systems, this characteristic is one of the most important parameters for accepting a solution.");
                a.setText("A) Maintainability ");
                b.setText("B) Performance efficiency ");
                c.setText("C) Reliability ");
                d.setText("D) Functional suitability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 46:
                qNum.setText(questions+".");
                Quest.setText("While evaluating AI Systems, this characteristic includes functional correctness, completeness and appropriateness are expected with some sort of error estimation to quantitatively measure the system");
                a.setText("A) Functional suitability ");
                b.setText("B) Performance efficiency ");
                c.setText("C) Reliability ");
                d.setText("D) Maintainability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 47:
                qNum.setText(questions+".");
                Quest.setText("While evaluating AI Systems, this characteristic is the availability of the system during normal operations");
                a.setText("A) Functional suitability ");
                b.setText("B) Performance efficiency ");
                c.setText("C) Reliability ");
                d.setText("D) Maintainability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 48:
                qNum.setText(questions+".");
                Quest.setText("While evaluating AI Systems, this characteristic where the fault tolerance of the system should be high enough to handle corrupt data, incomplete, or irrelevant data without breaking down ");
                a. setText("A) Functional suitability ");
                b. setText("B) Reliability ");
                c. setText("C) Performance efficiency ");
                d. setText("D) Maintainability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 49:
                qNum.setText(questions+".");
                Quest.setText("While evaluating AI Systems, this characteristic includes the Time behavior and the Resource utilization");
                a.setText("A) Functional suitability ");
                b.setText("B) Reliability ");
                c.setText("C) Performance efficiency ");
                d.setText("D) Maintainability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 50:
                qNum.setText(questions+".");
                Quest.setText("Is how quickly the system responds to the demands made from it?");
                a.setText("A) Functional suitability ");
                b.setText("B) Reliability ");
                c.setText("C) Resource utilization");
                d.setText("D) Time behavior");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 51:
                qNum.setText(questions+".");
                Quest.setText("Is which and how many resources are used by the system to perform a function?");
                a.setText("A) Functional suitability ");
                b.setText("B) Reliability ");
                c.setText("C) Resource utilization");
                d.setText("D) Time behavior");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 52:
                qNum.setText(questions+".");
                Quest.setText("While evaluating AI Systems, this characteristic includes the Analyzability and Testability");
                a.setText("A) Functional suitability ");
                b.setText("B) Reliability ");
                c.setText("C) Performance efficiency ");
                d.setText("D) Maintainability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 53:
                qNum.setText(questions+".");
                Quest.setText("Refers to the ability to be able to understand why the system took the decision that it took.");
                a.setText("A) Functional suitability ");
                b.setText("B) Analyzability ");
                c.setText("C) Performance efficiency ");
                d.setText("D) Maintainability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 54:
                qNum.setText(questions+".");
                Quest.setText("Time and space complexity");
                a.setText("A) Functional suitability ");
                b.setText("B) Analyzability ");
                c.setText("C) Complexity ");
                d.setText("D) Testability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 55:
                qNum.setText(questions+".");
                Quest.setText("The ability of the system to handle more load by adding additional resources to it");
                a.setText("A) Scalability");
                b.setText("B) Analyzability ");
                c.setText("C) Complexity ");
                d.setText("D) Testability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 56:
                qNum.setText(questions+".");
                Quest.setText("The ability of the system to continuously learn from new data, especially from real time environment data");
                a.setText("A) Scalability");
                b.setText("B) Analyzability ");
                c.setText("C) Complexity ");
                d.setText("D) Continuous learning ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 57:
                qNum.setText(questions+".");
                Quest.setText("This characteristic Is the ability to comprehend or understand. It is basically a combination of reasoning, memory, imagination, and judgment; each of these faculties relies upon the others.");
                a.setText("A) Scalability");
                b.setText("B) Analyzability ");
                c.setText("C) Intelligent behavior ");
                d.setText("D) Continuous learning ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 58:
                qNum.setText(questions+".");
                Quest.setText("This characteristic is about the principles concerning the distinction between right and wrong or good and bad behavior. The sub-characteristics are: ethics, privacy and human friendliness.");
                a.setText("A) Morality");
                b.setText("B) Analyzability ");
                c.setText("C) Intelligent behavior ");
                d.setText("D) Continuous learning ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 59:
                qNum.setText(questions+".");
                Quest.setText("This characteristic is the combination of characteristics or qualities that perform an individual’s distinctive character. The sub-characteristics are: mood, empathy, humor and charisma");
                a.setText("A) Morality");
                b.setText("B) Analyzability ");
                c.setText("C) Intelligent behavior ");
                d.setText("D) Personality");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
        }
    }

    public void correctQuestion(int question, String opt){
        AlertDialog.Builder builder = new AlertDialog.Builder(Quiz2Activity.this);
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
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 3:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 4:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 5:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 6:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 7:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
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
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 13:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 14:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 15:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
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
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 25:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 26:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 27:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 28:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 29:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 30:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 31:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 32:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 33:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 34:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 35:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 36:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 37:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 38:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 39:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 40:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 41:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 42:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 43:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 44:
                correctD();
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 45:
                correctD();
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 46:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 47:
                correctC();
                if(opt.equals("c")){
                    rc+=1;
                }
                break;
            case 48:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 49:
                correctC();
                if(opt.equals("c")){
                    rc+=1;
                }
                break;
            case 50:
                correctD();
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 51:
                correctC();
                if(opt.equals("c")){
                    rc+=1;
                }
                break;
            case 52:
                correctD();
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 53:
                correctB();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 54:
                correctC();
                if(opt.equals("c")){
                    rc+=1;
                }
                break;
            case 55:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 56:
                correctD();
                if(opt.equals("d")){
                    rd+=1;
                }
                break;
            case 57:
                correctA();
                if(opt.equals("c")){
                    rc+=1;
                }
                break;
            case 58:
                correctA();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 59:
                correctD();
                if(opt.equals("d")){
                    rd+=1;
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