package com.diana.iaquizv3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class ScoreActivity extends AppCompatActivity {
    Intent recibe, x;
    Bundle bolsa;
    TextView scr,dur,resp,thename;
    ImageView reintentar;
    int calif=0,total=0;
    long tiempo=0;
    DataStorage da = new DataStorage();
    QuestionSettings qSet = new QuestionSettings();
    SharedPreferences prefe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        DecimalFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(2); //Define 2 decimales.

        TextView textView = (TextView) findViewById(R.id.about);
        SpannableString mitexto = new SpannableString("About");
        mitexto.setSpan(new UnderlineSpan(), 0, mitexto.length(),0);
        textView.setText(mitexto);

        x=new Intent(ScoreActivity.this, MainActivity.class);
        recibe=getIntent();
        bolsa=recibe.getExtras();
        tiempo = bolsa.getLong("dur");
        calif = bolsa.getInt("calificacion");
        total = bolsa.getInt("total");
        scr=(TextView)findViewById(R.id.score);
        dur=(TextView)findViewById(R.id.duration);
        resp = (TextView)findViewById(R.id.Respuestas);
        thename = (TextView)findViewById(R.id.Name);
        String sco= String.valueOf(calif);
        String tot=String.valueOf(total);
        scr.setText(sco+ " of "+tot);
        String duracionSec = String.valueOf(tiempo);

        dur.setText("Your Time: "+duracionSec+ " sec");
        prefe=getSharedPreferences("datos", Context.MODE_PRIVATE);
        String name = da.getUsername();

        resp.setText("Your correct answers were:");
        thename.setText(name.toUpperCase());

        reintentar=(ImageView)findViewById(R.id.Reintentar);
        reintentar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(x);
                finish();

            }
        });
    }
    @Override
    public void onBackPressed () { }

    public void showMsg(View v){
        Toast.makeText(ScoreActivity.this,"The content in this application has been taken from the AIu Artificial Intelligence Certified Tester Syllabus in the next link: https://www.ai-united.org", Toast.LENGTH_LONG).show();
    }

    public void update(){
        qSet.requestName(ScoreActivity.this);
    }

    public void salir(View v){
        finish();
    }
}
