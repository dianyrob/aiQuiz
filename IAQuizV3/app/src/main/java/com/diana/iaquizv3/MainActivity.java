package com.diana.iaquizv3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Intent i;
    Button iniciar;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void start(View v) {

        if (v.getId() == R.id.btnbasic) {
            Intent intent = new Intent(MainActivity.this, BasicPdfActivity.class);
            startActivity(intent);
            finish();
        }
        if (v.getId() == R.id.btntesting) {
            Intent intent = new Intent(MainActivity.this, ModulosActivity.class);
            startActivity(intent);
            finish();
        }
    }



}
