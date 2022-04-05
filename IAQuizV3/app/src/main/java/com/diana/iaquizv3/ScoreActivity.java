package com.diana.iaquizv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ScoreActivity extends AppCompatActivity {
    Intent recibe, x;
    Bundle bolsa;
    TextView scr,dur;
    ImageView reintentar;
    int calif=0,total=0;
    long tiempo=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        DecimalFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(2); //Define 2 decimales.


        x=new Intent(ScoreActivity.this, MainActivity.class);
        recibe=getIntent();
        bolsa=recibe.getExtras();
        tiempo = bolsa.getLong("dur");
        calif = bolsa.getInt("calificacion");
        total = bolsa.getInt("total");
        scr=(TextView)findViewById(R.id.score);
        dur=(TextView)findViewById(R.id.duration);
        String sco= String.valueOf(calif);
        String tot=String.valueOf(total);
        scr.setText(sco+ " of "+tot);
        String duracionSec = String.valueOf(tiempo);
        dur.setText("Your Time: "+duracionSec+ " sec");


        //x=new Intent(ScoreActivity.this, MainActivity.class);
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
    public void onBackPressed () {

    }
    public void salir(View v){
        finish();
    }
}
