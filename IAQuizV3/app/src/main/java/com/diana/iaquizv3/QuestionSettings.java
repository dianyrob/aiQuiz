package com.diana.iaquizv3;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;

public class QuestionSettings extends AppCompatActivity {
    ScrollView sv;
    Activity ActivityName;
    DataStorage da = new DataStorage();
    SharedPreferences prefe;

    public void clearColor(Button a, Button b, Button c, Button d){
        a.setBackgroundColor(Color.LTGRAY);
        a.setTextColor(Color.BLACK);
        b.setBackgroundColor(Color.LTGRAY);
        b.setTextColor(Color.BLACK);
        c.setBackgroundColor(Color.LTGRAY);
        c.setTextColor(Color.BLACK);
        d.setBackgroundColor(Color.LTGRAY);
        d.setTextColor(Color.BLACK);
    }

    public void correctA(Button a, Button b, Button c, Button d, ScrollView sv){
        setColorAg(a);
        sv.fullScroll(ScrollView.FOCUS_DOWN);
    }
    public void incorrectBtn(Button btn, ScrollView sv){
        setColorRed(btn);
        sv.fullScroll(ScrollView.FOCUS_DOWN);
    }
    public void correctB(Button a, Button b, Button c, Button d, ScrollView sv){
        setColorBg(b);
        sv.fullScroll(ScrollView.FOCUS_DOWN);
    }
    public void correctC(Button a, Button b, Button c, Button d, ScrollView sv){
        setColorCg(c);
        sv.fullScroll(ScrollView.FOCUS_DOWN);
    }
    public void correctD(Button a, Button b, Button c, Button d, ScrollView sv){
        setColorDg(d);
        sv.fullScroll(ScrollView.FOCUS_DOWN);
    }
    public void deshabilitar(Button a, Button b, Button c, Button d, ImageView sig){
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        sig.setEnabled(true);

    }
    public void habilitar(Button a, Button b, Button c, Button d, ImageView sig,ScrollView sv){
        a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        sig.setEnabled(false);
        sv.fullScroll(ScrollView.FOCUS_UP);
    }


    public void setColorAg(Button a){
        a.setTextColor(Color.BLACK);
        a.setBackgroundColor(Color.parseColor("#58D8D0"));
    }
    public void setColorRed(Button btn){
        btn.setTextColor(Color.BLACK);
        btn.setBackgroundColor(Color.parseColor("#F9926E"));
    }
    public void setColorBg(Button b){
        b.setTextColor(Color.BLACK);
        b.setBackgroundColor(Color.parseColor("#58D8D0"));
    }
    public void setColorCg(Button c){
        c.setTextColor(Color.BLACK);
        c.setBackgroundColor(Color.parseColor("#58D8D0"));
    }
    public void setColorDg(Button d){
        d.setTextColor(Color.BLACK);
        d.setBackgroundColor(Color.parseColor("#58D8D0"));
    }

    public void requestName(final Activity ActivityName){
        final EditText input = new EditText(ActivityName);
        new Builder(ActivityName,R.style.AlertDialogTheme)
                .setTitle("Welcome to AI Trainer")
                .setMessage("Please enter your name:")
                .setView(input)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String username = input.getText().toString();
                        da.setUsername(username);
                        // deal with the editable
                    }
                }).show();
    }
    public void showMessage(final Activity ActivityName){
        new Builder(ActivityName,R.style.AlertDialogTheme)
                .setTitle("About the content in the AI Trainer")
                .setMessage("The content in this application has been taken from the AIu Artificial Intelligence Certified Tester Syllabus in the next link: https://www.ai-united.org")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        finish();
                    }
                }).show();
    }



}
