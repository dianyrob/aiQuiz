package com.diana.iaquizv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Topic6Activity extends AppCompatActivity {
    Intent i;
    ImageView back,startTest1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic6);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void option(View v) {
        switch(v.getId()){
            case R.id.back:
                i = new Intent(Topic6Activity.this, ModulosActivity.class);
                startActivity(i);
                finish();
                break;
            case R.id.topictest6:
                i = new Intent(Topic6Activity.this, Quiz6Activity.class);
                startActivity(i);
                finish();
                break;
            default:
                break;
        }
    }
}
