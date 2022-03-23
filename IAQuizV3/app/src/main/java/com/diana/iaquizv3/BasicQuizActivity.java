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

public class BasicQuizActivity extends AppCompatActivity {
    ScrollView sv;
    TextView Quest,qNum;
    Button a,b,c,d;
    ImageView sig,ter;
    int calificacion=0;
    int ra=0,rb=0,rc=0,rd=0;
    int questions=1,totalQuestions=40;
    Intent i;
    int[] quest={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    long startTime=0,endTime=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_quiz);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        i=new Intent(BasicQuizActivity.this, ScoreActivity.class);
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
                i=new Intent(BasicQuizActivity.this, ScoreActivity.class);
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
                Quest.setText("Is the intelligence acquired by a machine to solve problems usually solved by humans? ");
                a.setText("A) Artificial knowledge");
                b.setText("B) Artificial intelligence");
                c.setText("C) Machine learning");
                d.setText("D) Deep learning");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 2:
                qNum.setText(questions+".");
                Quest.setText("In which sectors is Al playing a leading role?");
                a.setText("A) Healthcare and manufacturing");
                b.setText("B) E-commerce and retail");
                c.setText("C) Social Media and logistics ");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 3:
                qNum.setText(questions+".");
                Quest.setText("How is the Artificial Intelligence categorized?");
                a.setText("A) Narrow");
                b.setText("B) General");
                c.setText("C) Super AI ");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 4:
                qNum.setText(questions+".");
                Quest.setText("Is the category for the machines that are programmed for carrying out a specific task with limited context. For example, game playing machines, voice assistants and all AI currently:");
                a.setText("A) Simple AI");
                b.setText("B) Narrow");
                c.setText("C) General");
                d.setText("D) Super AI");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 5:
                qNum.setText(questions+".");
                Quest.setText("Is the category for the machines with general cognitive abilities are popularly called as Strong AI cases. These AIs can reason and understand their environment as humans do, and act accordingly. For instance, common- sense reasoning:");
                a.setText("A) Single AI");
                b.setText("B) Narrow");
                c.setText("C) General");
                d.setText("D) Super AI ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 6:
                qNum.setText(questions+".");
                Quest.setText("Is the category for machines that are capable of replicating human thoughts, ideas and emotions. It is that super state of intelligence where machines will become smarter and wiser than humans. ");
                a.setText("A) Simple AI");
                b.setText("B) Narrow");
                c.setText("C) General");
                d.setText("D) Super AI ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 7:
                qNum.setText(questions+".");
                Quest.setText("These are the systems that learn and improve with experience, and, with time, refine a model that can be used to predict the outcome of questions, based on the previous learning? ");
                a.setText("A) Artificial knowledge");
                b.setText("B) Artificial intelligence");
                c.setText("C) Machine learning");
                d.setText("D) Deep learning");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 8:
                qNum.setText(questions+".");
                Quest.setText("Some of the technologies used to accomplish AI are: Machine Learning (ML), Natural Language Processing (NLP), Robotics, Speech Processing, Computer Vision ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 9:
                qNum.setText(questions+".");
                Quest.setText("Some of the technologies used to accomplish ML are: Artificial Intelligence (AI), Natural Language Processing (NLP), Robotics, Speech Processing, Computer Vision ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 10:
                qNum.setText(questions+".");
                Quest.setText("These are a few ways in which ML algorithms can be categorized: Supervised Learning, Unsupervised Learning, Reinforcement Learning ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 11:
                qNum.setText(questions+".");
                Quest.setText("These are a few ways in which AI can be categorized: Supervised Learning, Unsupervised Learning, Reinforcement Learning ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 12:
                qNum.setText(questions+".");
                Quest.setText("In this kind of learning, the model learns from labeled data during the training phase. The labeled data acts as a trainer/supervisor for the mapping function which infers the relationship between input data and the output label during the training. During the testing phase, the mapping function is then applied to a new set of unseen data to predict the output which is also labeled. The model is deployed once the output accuracy level is satisfactory. ");
                a.setText("A) Supervised Learning");
                b.setText("B) Unsupervised Learning");
                c.setText("C) Machine Learning");
                d.setText("D) Artificial Intelligence");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 13:
                qNum.setText(questions+".");
                Quest.setText("Problems solved by Supervised Learning are further divided into two categories: ");
                a.setText("A) Classification and Deep Learning");
                b.setText("B) Classification and Regression");
                c.setText("C) Deed Learning and Regression");
                d.setText("D) Machine Learning and Deep Learning");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 14:
                qNum.setText(questions+".");
                Quest.setText("Is the category when the problem requires classifying an input into one of a few pre-decided classes, supervised learning is used. This kind of model is used when the output data is discrete or when the output falls among the number of classes fed during training. ");
                a.setText("A) Classification");
                b.setText("B) Regression");
                c.setText("C) Deep Learning");
                d.setText("D) Artificial Intelligence");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 15:
                qNum.setText(questions+".");
                Quest.setText("Some of the commonly used algorithms for classification are logistic regression, nearest neighbor, support vector machine, and neural nets. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 16:
                qNum.setText(questions+".");
                Quest.setText("Is the category is used when the output data is continuous or numeric in nature, e.g., predicting the age/weight of a person, predicting the future price of the stock, etc.");
                a.setText("A) Classification");
                b.setText("B) Regression");
                c.setText("C) Deep Learning");
                d.setText("D) Artificial Intelligence");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 17:
                qNum.setText(questions+".");
                Quest.setText("Clean, labeled data are not readily available all the time, so that certain problems need to be solved without an explicitly labeled training set. This kind of ML where no labeled data is provided explicitly is called:");
                a.setText("A) Supervised Learning");
                b.setText("B) Unsupervised Learning");
                c.setText("C) Machine Learning");
                d.setText("D) Artificial Intelligence");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 18:
                qNum.setText(questions+".");
                Quest.setText("Unsupervised Learning is further classified in the following two methods, based on the type of outputs:");
                a.setText("A) Classification and Regression");
                b.setText("B) Regression and Association ");
                c.setText("C) Clustering and Association ");
                d.setText("D) Association and Classification");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 19:
                qNum.setText(questions+".");
                Quest.setText("This Unsupervised Learning model groups the input data based on some common characteristics or attributes. Input data with similar attributes (not labeled) are grouped in one cluster. Thus, the outputs are clusters of input data. For instance, customer segmentation in market analysis. ");
                a.setText("A) Classification");
                b.setText("B) Clustering");
                c.setText("C) Regression");
                d.setText("D) Association");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 20:
                qNum.setText(questions+".");
                Quest.setText("Association Rule Mining finds interesting relationships or dependencies among the data attributes. The discovery of interesting associations provides a source of information often used for decision making. ");
                a.setText("A) Classification");
                b.setText("B) Clustering");
                c.setText("C) Regression");
                d.setText("D) Association");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 21:
                qNum.setText(questions+".");
                Quest.setText("It is a type of ML where an agent (algorithm) learns by interacting with the environment in an iterative manner and thereby learns from experience. The agent is rewarded when it makes a right decision and penalized when it makes a wrong one. This reward and penalty-based learning is thus defined as:");
                a.setText("A) Supervised Learning");
                b.setText("B) Unsupervised Learning");
                c.setText("C) Reinforcement Learning");
                d.setText("D) Deep Learning");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 22:
                qNum.setText(questions+".");
                Quest.setText("This type of learning refers to the systems gaining experience from massive data sets. It uses Artificial Neural Networks (ANN) to analyze large data sets, e.g. Autonomous Vehicles, Large Text Processing, and Computer Vision applications among others");
                a.setText("A) Supervised Learning");
                b.setText("B) Unsupervised Learning");
                c.setText("C) Reinforcement Learning");
                d.setText("D) Deep Learning");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 23:
                qNum.setText(questions+".");
                Quest.setText("Deep Learning uses the same types of learning (Supervised, Unsupervised and Reinforcement Learning) as ML. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 24:
                qNum.setText(questions+".");
                Quest.setText("Deep Learning uses different types of learning (Supervised, Unsupervised and Reinforcement Learning) as ML. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 25:
                qNum.setText(questions+".");
                Quest.setText("These are inspired by the architecture of the human brain. ‘Neurons’, as the basic unit of ANN, act upon the input stimulus and produce the output signal. The input goes through \n" +
                        "the layers of activation functions to generate the output. These layers form a mesh like network. \n");
                a.setText("A) Artificial Neuronal Networks");
                b.setText("B) Deep Neuronal Network");
                c.setText("C) Convolutional Neuronal Network");
                d.setText("D) Recurrent Neuronal Network");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 26:
                qNum.setText(questions+".");
                Quest.setText("Is a type of neural networks?");
                a.setText("A) Deep Neuronal Network");
                b.setText("B) Convolutional Neuronal Network");
                c.setText("D) Recurrent Neuronal Network");
                d.setText("E) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 27:
                qNum.setText(questions+".");
                Quest.setText("Is an Artificial Neuronal Network with two or more hidden layers?");
                a.setText("A) Deep Neuronal Network");
                b.setText("B) Convolutional Neuronal Network");
                c.setText("C) Recurrent Neuronal Network");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 28:
                qNum.setText(questions+".");
                Quest.setText("Is an Artificial Neuronal Network that emerged from the study of the brain’s visual cortex, and they have been used in image recognition since the 1980s. Unlike other neural networks, this works directly on input images without serializing/ vectorizing an input image and extracting features by filters:");
                a.setText("A) Deep Neuronal Network");
                b.setText("B) Convolutional Neuronal Network");
                c.setText("C) Recurrent Neuronal Network");
                d.setText("D)None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 29:
                qNum.setText(questions+".");
                Quest.setText("These ANNs can predict the future of time series problems. They follow a sequential approach on series of input data of arbitrary length rather than inputs of fixed length as in other neural networks. Each input and output are independent of all the other layers. The feedback from the output layer is fed to the same network recurrently, till the right level of confidence is achieved:");
                a.setText("A) Deep Neuronal Network");
                b.setText("B) Convolutional Neuronal Network");
                c.setText("C) Recurrent Neuronal Network");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 30:
                qNum.setText(questions+".");
                Quest.setText("Which is CRISP-DM?");
                a.setText("A) Cross Industry Standard Process for the Data Mining ");
                b.setText("B) Critical Industry Size Process for the Deep Mining");
                c.setText("C) Cross Industry Selection Product for the Data Mining");
                d.setText("D) Critical Industry Standard Process for Deep Mining");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 31:
                qNum.setText(questions+".");
                Quest.setText("CRISP-DM has traditionally six stages in the data mining life cycle. It has been customized to meet the requirements of ML projects, by adding a seventh stage. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 32:
                qNum.setText(questions+".");
                Quest.setText("CRISP-DM has traditionally eight stages in the data mining life cycle. It has been customized to meet the requirements of ML projects, by adding a eighth stage.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 33:
                qNum.setText(questions+".");
                Quest.setText("Are some of the stages of the CRISP-DM framework for ML?");
                a.setText("A) Data acquisition and Data preparation ");
                b.setText("B) Modeling and Evaluation ");
                c.setText("C) Deployment, Operations and Optimization ");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 34:
                qNum.setText(questions+".");
                Quest.setText("This stage gathers data from all internal and external sources (for example databases, CSV files, social media, etc.):");
                a.setText("A) Data acquisition");
                b.setText("B) Data preparation ");
                c.setText("C) Modeling");
                d.setText("D) Evaluation ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 35:
                qNum.setText(questions+".");
                Quest.setText("This stage cleans the raw data and reshape it. New attributes are created with feature engineering, a process for creating new variables from existing data. ");
                a.setText("A) Data acquisition");
                b.setText("B) Data preparation ");
                c.setText("C) Modeling");
                d.setText("D) Evaluation ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 36:
                qNum.setText(questions+".");
                Quest.setText("This stage selects the model or algorithm, divide the available data into training set and testing set. Models are obtained by executing ML algorithms on the training data set. Use the testing data set to evaluate and enhance the performance of the model until satisfactory performance is achieved. ");
                a.setText("A) Data acquisition");
                b.setText("B) Data preparation ");
                c.setText("C) Modeling");
                d.setText("D) Evaluation ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 37:
                qNum.setText(questions+".");
                Quest.setText("This stage evaluates the model on various metrics (discussed in 3.2 Metrics) and baseline it before it goes for final deployment. ");
                a.setText("A) Data acquisition");
                b.setText("B) Data preparation ");
                c.setText("C) Modeling");
                d.setText("D) Evaluation ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 38:
                qNum.setText(questions+".");
                Quest.setText("This stage deploys and monitor the baselined model for metrics in the production environment.");
                a.setText("A) Data preparation ");
                b.setText("B) Modeling");
                c.setText("C) Evaluation ");
                d.setText("D) Deployment");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 39:
                qNum.setText(questions+".");
                Quest.setText("This stage carries out regular maintenance and operations. Regenerate and refine the model when the metrics fall below a certain threshold. ");
                a.setText("A) Evaluation");
                b.setText("B) Deployment");
                c.setText("C) Operations");
                d.setText("D) Optimization");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 40:
                qNum.setText(questions+".");
                Quest.setText("In this stage deployed solution may be replaced due to concept, as better algorithms become available, or because of some major failures in performance. ");
                a.setText("A) Evaluation");
                b.setText("B) Deployment");
                c.setText("C) Operations");
                d.setText("D) Optimization");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
        }
    }

    public void correctQuestion(int question, String opt){
        AlertDialog.Builder builder = new AlertDialog.Builder(BasicQuizActivity.this);
        AlertDialog alert;
        WindowManager.LayoutParams wmlp;
        switch (question){
            case 1:
                setColorAr();
                setColorBg();
                setColorCr();
                setColorDr();
                if(opt.equals("b")){
                    rc+=1;
                }
                break;
            case 2:
                setColorAr();
                setColorBr();
                setColorCr();
                setColorDg();
                if(opt.equals("d")){
                    ra+=1;
                }
                break;
            case 3:
                setColorAr();
                setColorBr();
                setColorCr();
                setColorDg();
                if(opt.equals("d")){
                    rb+=1;
                }
                break;
            case 4:
                setColorAr();
                setColorBg();
                setColorCr();
                setColorDr();
                if(opt.equals("b")){
                    ra+=1;
                }
                break;
            case 5:
                setColorAr();
                setColorBr();
                setColorCg();
                setColorDr();
                if(opt.equals("c")){
                    rb+=1;
                }
                break;
            case 6:
                setColorAr();
                setColorBr();
                setColorCr();
                setColorDg();
                if(opt.equals("d")){
                    rb+=1;
                }
                break;
            case 7:
                setColorAr();
                setColorBr();
                setColorCg();
                setColorDr();
                if(opt.equals("c")){
                    ra+=1;
                }
                break;
            case 8:
                setColorAg();
                setColorBr();
                setColorCr();
                setColorDr();
                if(opt.equals("a")){
                    rc+=1;
                }
                break;
            case 9:
                setColorAr();
                setColorBg();
                setColorCr();
                setColorDr();
                if(opt.equals("b")){
                    rd+=1;
                }
                break;
            case 10:
                setColorAg();
                setColorBr();
                setColorCr();
                setColorDr();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 11:
                setColorAr();
                setColorBg();
                setColorCr();
                setColorDr();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 12:
                setColorAg();
                setColorBr();
                setColorCr();
                setColorDr();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 13:
                setColorAr();
                setColorBg();
                setColorCr();
                setColorDr();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 14:
                setColorAg();
                setColorBr();
                setColorCr();
                setColorDr();
                if(opt.equals("a")){
                    rd+=1;
                }
                break;
            case 15:
                setColorAg();
                setColorBr();
                setColorCr();
                setColorDr();
                if(opt.equals("a")){
                    rc+=1;
                }
                break;
            case 16:
                setColorAr();
                setColorBg();
                setColorCr();
                setColorDr();
                if(opt.equals("b")){
                    ra+=1;
                }
                break;
            case 17:
                setColorAr();
                setColorBg();
                setColorCr();
                setColorDr();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 18:
                setColorAr();
                setColorBr();
                setColorCg();
                setColorDr();
                if(opt.equals("c")){
                    ra+=1;
                }
                break;
            case 19:
                setColorAr();
                setColorBg();
                setColorCr();
                setColorDr();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 20:
                setColorAr();
                setColorBr();
                setColorCr();
                setColorDg();
                if(opt.equals("d")){
                    ra+=1;
                }
                break;
            case 21:
                setColorAr();
                setColorBr();
                setColorCg();
                setColorDr();
                if(opt.equals("c")){
                    rb+=1;
                }
                break;
            case 22:
                setColorAr();
                setColorBr();
                setColorCr();
                setColorDg();
                if(opt.equals("d")){
                    ra+=1;
                }
                break;
            case 23:
                setColorAg();
                setColorBr();
                setColorCr();
                setColorDr();
                if(opt.equals("a")){
                    rb+=1;
                }
                break;
            case 24:
                setColorAr();
                setColorBg();
                setColorCr();
                setColorDr();
                if(opt.equals("b")){
                    ra+=1;
                }
                break;
            case 25:
                setColorAg();
                setColorBr();
                setColorCr();
                setColorDr();
                if(opt.equals("a")){
                    rb+=1;
                }
                break;
            case 26:
                setColorAr();
                setColorBr();
                setColorCr();
                setColorDg();
                if(opt.equals("d")){
                    ra+=1;
                }
                break;
            case 27:
                setColorAg();
                setColorBr();
                setColorCr();
                setColorDr();
                if(opt.equals("a")){
                    rb+=1;
                }
                break;
            case 28:
                setColorAr();
                setColorBg();
                setColorCr();
                setColorDr();
                if(opt.equals("b")){
                    ra+=1;
                }
                break;
            case 29:
                setColorAr();
                setColorBr();
                setColorCg();
                setColorDr();
                if(opt.equals("c")){
                    rb+=1;
                }
                break;
            case 30:
                setColorAg();
                setColorBr();
                setColorCr();
                setColorDr();
                if(opt.equals("a")){
                    ra+=1;
                }
                break;
            case 31:
                setColorAg();
                setColorBr();
                setColorCr();
                setColorDr();
                if(opt.equals("a")){
                    rb+=1;
                }
                break;
            case 32:
                setColorAr();
                setColorBg();
                setColorCr();
                setColorDr();
                if(opt.equals("b")){
                    rb+=1;
                }
                break;
            case 33:
                setColorAr();
                setColorBr();
                setColorCr();
                setColorDg();
                if(opt.equals("d")){
                    ra+=1;
                }
                break;
            case 34:
                setColorAg();
                setColorBr();
                setColorCr();
                setColorDr();
                if(opt.equals("a")){
                    rb+=1;
                }
                break;
            case 35:
                setColorAr();
                setColorBg();
                setColorCr();
                setColorDr();
                if(opt.equals("b")){
                    ra+=1;
                }
                break;
            case 36:
                setColorAr();
                setColorBr();
                setColorCr();
                setColorDg();
                if(opt.equals("d")){
                    rb+=1;
                }
                break;
            case 37:
                setColorAr();
                setColorBr();
                setColorCg();
                setColorDr();
                if(opt.equals("c")){
                    ra+=1;
                }
                break;
            case 38:
                setColorAr();
                setColorBr();
                setColorCr();
                setColorDg();
                if(opt.equals("d")){
                    rb+=1;
                }
                break;
            case 39:
                setColorAr();
                setColorBr();
                setColorCg();
                setColorDr();
                if(opt.equals("c")){
                    ra+=1;
                }
                break;
            case 40:
                setColorAr();
                setColorBr();
                setColorCr();
                setColorDg();
                if(opt.equals("d")){
                    rb+=1;
                }
                break;
        }
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