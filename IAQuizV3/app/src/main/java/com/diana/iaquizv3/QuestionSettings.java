package com.diana.iaquizv3;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AlertDialog.Builder;

public class QuestionSettings {
    ScrollView sv;
    Activity ActivityName;
    DataStorage da = new DataStorage();

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
        //setColorBr(b);
        //setColorCr(c);
        //setColorDr(d);
        sv.fullScroll(ScrollView.FOCUS_DOWN);
    }
    public void correctB(Button a, Button b, Button c, Button d, ScrollView sv){
        //setColorAr(a);
        setColorBg(b);
        //setColorCr(c);
        //setColorDr(d);

        sv.fullScroll(ScrollView.FOCUS_DOWN);
    }
    public void correctC(Button a, Button b, Button c, Button d, ScrollView sv){
        //setColorAr(a);
        //setColorBr(b);
        setColorCg(c);
        //setColorDr(d);
        sv.fullScroll(ScrollView.FOCUS_DOWN);
    }
    public void correctD(Button a, Button b, Button c, Button d, ScrollView sv){
        //setColorAr(a);
        //setColorBr(b);
        //setColorCr(c);
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

    /*public void setColorAr(Button a) { a.setBackgroundColor(Color.parseColor("#F9926E")); }
    public void setColorBr(Button b){
        b.setBackgroundColor(Color.parseColor("#F9926E"));
    }
    public void setColorCr(Button c){
        c.setBackgroundColor(Color.parseColor("#F9926E"));
    }
    public void setColorDr(Button d) { d.setBackgroundColor(Color.parseColor("#F9926E")); }
    */
    public void setColorAg(Button a){
        a.setTextColor(Color.BLACK);
        a.setBackgroundColor(Color.parseColor("#58D8D0"));
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

    public void requestName(Activity ActivityName){
        final EditText input = new EditText(ActivityName);
        new Builder(ActivityName)
                .setTitle("AI Trainer")
                .setMessage("Enter your firstname")
                .setView(input)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String username = input.getText().toString();
                        da.setUsername(username);
                        // deal with the editable
                    }
                })
                .setNegativeButton("Cancel", new OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Do nothing.
                    }
                }).show();
    }
}
