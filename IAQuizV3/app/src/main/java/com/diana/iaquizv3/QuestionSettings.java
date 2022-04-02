package com.diana.iaquizv3;

import android.graphics.Color;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class QuestionSettings {
    ScrollView sv;

    public void clearColor(Button a, Button b, Button c, Button d){
        a.setBackgroundColor(Color.LTGRAY);
        b.setBackgroundColor(Color.LTGRAY);
        c.setBackgroundColor(Color.LTGRAY);
        d.setBackgroundColor(Color.LTGRAY);
    }

    public void correctA(Button a, Button b, Button c, Button d){
        setColorAg(a);
        setColorBr(b);
        setColorCr(c);
        setColorDr(d);
    }
    public void correctB(Button a, Button b, Button c, Button d){
        setColorAr(a);
        setColorBg(b);
        setColorCr(c);
        setColorDr(d);
    }
    public void correctC(Button a, Button b, Button c, Button d){
        setColorAr(a);
        setColorBr(b);
        setColorCg(c);
        setColorDr(d);
    }
    public void correctD(Button a, Button b, Button c, Button d){
        setColorAr(a);
        setColorBr(b);
        setColorCr(c);
        setColorDg(d);
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

    public void setColorAr(Button a){
        a.setBackgroundColor(Color.RED);
    }
    public void setColorBr(Button b){
        b.setBackgroundColor(Color.RED);
    }
    public void setColorCr(Button c){
        c.setBackgroundColor(Color.RED);
    }
    public void setColorDr(Button d){
        d.setBackgroundColor(Color.RED);
    }
    public void setColorAg(Button a){
        a.setBackgroundColor(Color.GREEN);
    }
    public void setColorBg(Button b){
        b.setBackgroundColor(Color.GREEN);
    }
    public void setColorCg(Button c){
        c.setBackgroundColor(Color.GREEN);
    }
    public void setColorDg(Button d){
        d.setBackgroundColor(Color.GREEN);
    }
}
