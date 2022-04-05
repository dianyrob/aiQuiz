package com.diana.iaquizv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ModulosActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulos);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void salir(View v){
        if(v.getId() == R.id.Topic1){
            Intent intent = new Intent(ModulosActivity.this, Topic1Activity.class);
            startActivity(intent);
        }if(v.getId() == R.id.test1){
            Intent intent = new Intent(ModulosActivity.this, Quiz1Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.Topic2){
            Intent intent = new Intent(ModulosActivity.this, Topic2Activity.class);
            startActivity(intent);
        }if(v.getId() == R.id.test2){
            Intent intent = new Intent(ModulosActivity.this, Quiz2Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.Topic3) {
            Intent intent = new Intent(ModulosActivity.this, Topic3Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.Topic4) {
            Intent intent = new Intent(ModulosActivity.this, Topic4Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.Topic5) {
            Intent intent = new Intent(ModulosActivity.this, Topic5Activity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.Topic6) {
            Intent intent = new Intent(ModulosActivity.this, Topic6Activity.class);
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
    }

    //public void quit(View v){finish();}
}
