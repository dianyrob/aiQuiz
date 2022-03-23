package com.diana.iaquizv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.diana.iaquizv3.R.id.backbtn;

public class Topic3Activity extends AppCompatActivity {
    Intent i;
    ImageView back,startTest1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic3);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void option(View v) {
        switch(v.getId()){
            case backbtn:
                i = new Intent(Topic3Activity.this, ModulosActivity.class);
                startActivity(i);
                finish();
                break;
            case R.id.topictest1:
                i = new Intent(Topic3Activity.this, Quiz3Activity.class);
                startActivity(i);
                finish();
                break;
            default:
                break;
        }
    }
}
