package com.diana.iaquizv3;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

import java.net.MalformedURLException;
import java.net.URL;

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
                .setTitle("Content in the AI Trainer app")
                .setMessage("The content in this application has been taken from the AIU Artificial Intelligence Certified Tester Syllabus at the next link: https://www.ai-united.org")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        finish();
                    }
                }).show();
    }

    /*public void showMessageDownload(final Activity ActivityName, final String fileName, final String fileUrl, final NetworkInfo networkInfo){
        new Builder(ActivityName,R.style.AlertDialogTheme)
                .setTitle("Download file")
                .setMessage("Verify you have internet connection and press Ok to download the file.")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        finish();
                        try {
                            downloadFile(ActivityName, fileName,fileUrl, networkInfo);
                        } catch (MalformedURLException e) {
                            e.printStackTrace();
                        }
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //set what should happen when negative button is clicked
                        finish();
                    }
                }).show();

    }*/

  /*  public void downloadFile(Activity ActivityName,String fileName, String filepath, NetworkInfo networkInfo) throws MalformedURLException {
        URL url = new URL(filepath);


        if (networkInfo != null && networkInfo.isConnected()) {
            // Si hay conexión a Internet en este momento
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url + ""));
            request.setTitle(fileName);
            request.setMimeType("applcation/pdf");
            request.allowScanningByMediaScanner();
            request.setAllowedOverMetered(true);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName);
            DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
            dm.enqueue(request);
            Toast.makeText(getApplicationContext(),"Search your file in the Downloasd folder",Toast.LENGTH_LONG);
        } else {
            // No hay conexión a Internet en este momento
            Toast.makeText(getApplicationContext(),"Verify your internet connection",Toast.LENGTH_LONG);
        }
    }
*/
}
