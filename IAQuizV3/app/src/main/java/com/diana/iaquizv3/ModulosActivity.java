package com.diana.iaquizv3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class ModulosActivity extends AppCompatActivity {
    public String name;
    int flag = 0;
    ScrollView sv;
    ImageView btn;
    QuestionSettings qSet = new QuestionSettings();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulos);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        sv = (ScrollView) findViewById(R.id.modulos);
        btn = (ImageView) findViewById(R.id.more);
    }

    public void salir(View v){
        if(v.getId() == R.id.Topic1){
            Intent intent = new Intent(ModulosActivity.this, Topic1Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.test1){
            Intent intent = new Intent(ModulosActivity.this, Quiz1Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.Topic2){
            Intent intent = new Intent(ModulosActivity.this, Topic2Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.test2){
            Intent intent = new Intent(ModulosActivity.this, Quiz2Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.Topic3) {
            Intent intent = new Intent(ModulosActivity.this, Topic3Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.test3){
            Intent intent = new Intent(ModulosActivity.this, Quiz2Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.Topic4) {
            Intent intent = new Intent(ModulosActivity.this, Topic4Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.test4){
            Intent intent = new Intent(ModulosActivity.this, Quiz4Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.Topic5) {
            Intent intent = new Intent(ModulosActivity.this, Topic5Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.test5){
            Intent intent = new Intent(ModulosActivity.this, Quiz5Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.Topic6) {
            Intent intent = new Intent(ModulosActivity.this, Topic6Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.test6){
            Intent intent = new Intent(ModulosActivity.this, Quiz6Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.Topic7) {
            Intent intent = new Intent(ModulosActivity.this, Topic7Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.test7){
            Intent intent = new Intent(ModulosActivity.this, Quiz7Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.randomquiz){
            Intent intent = new Intent(ModulosActivity.this, RandomQuizActivity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.back){
            Intent intent = new Intent(ModulosActivity.this, MainActivity.class);
            startActivity(intent);
        }
        finish();
    }

    @Override
    public void onBackPressed () {
        Intent intent = new Intent(ModulosActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void scrolldown(View v){
        if(flag==0){
            flag++;
            sv.fullScroll(ScrollView.FOCUS_DOWN);
            btn.setImageResource(R.drawable.btnarriba);
        }else if(flag==1){
            flag--;
            sv.fullScroll(ScrollView.FOCUS_UP);
            btn.setImageResource(R.drawable.btnabajo);
        }

    }

}
