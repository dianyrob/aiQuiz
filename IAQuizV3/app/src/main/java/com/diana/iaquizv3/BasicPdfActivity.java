package com.diana.iaquizv3;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.net.MalformedURLException;
import java.net.URL;

public class BasicPdfActivity extends AppCompatActivity {
    String filepath = "https://firebasestorage.googleapis.com/v0/b/equiz-641f1.appspot.com/o/chapter1.pdf?alt=media&token=2350bdae-809f-43b8-887d-17747c337809";
    String fileName="AITrainer_Chapter1.pdf";
    Intent i;
    ImageView btnDownload;
    URL url= null;
    private static final int MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE = 1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_pdf);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        try {
            url= new URL(filepath);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        btnDownload = (ImageView) findViewById(R.id.download);

        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("chapter1.pdf")
                //.pages(0,1,2,3,4,5,6,7,8) // all pages are displayed by default
                .enableSwipe(true) // allows to block changing pages using swipe
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                // spacing between pages in dp. To define spacing color, set view background
                .spacing(0)
                .autoSpacing(false) // add dynamic spacing to fit each page on its own on the screen
                .fitEachPage(false) // fit each page to the view, else smaller pages are scaled relative to largest page.
                .pageSnap(false) // snap pages to screen boundaries
                .pageFling(false) // make a fling change only a single page like ViewPager
                .nightMode(false) // toggle night mode
                .load();
        setListeners();
    }

    @Override
    public void onBackPressed () {
        i = new Intent(BasicPdfActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }

    public void option(View v) {
        switch(v.getId()){
            case R.id.logo:
            case R.id.back:
                i = new Intent(BasicPdfActivity.this, MainActivity.class);
                startActivity(i);
                finish();
                break;
            case R.id.topictest1:
                i = new Intent(BasicPdfActivity.this, BasicQuizActivity.class);
                startActivity(i);
                finish();
                break;
            default:
                break;
        }
    }
    private void setListeners() {

        btnDownload.setOnClickListener(v -> {

            int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
            if (ContextCompat.checkSelfPermission(this,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    != PackageManager.PERMISSION_GRANTED) {

                if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE)) {

                } else {

                    ActivityCompat.requestPermissions(this,
                            new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                            MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE);

                }
            }

            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

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
                Toast.makeText(getApplicationContext(),"Search your file in the Downloads folder",Toast.LENGTH_LONG).show();
            } else {
                // No hay conexión a Internet en este momento
                Toast.makeText(getApplicationContext(),"Verify your internet connection",Toast.LENGTH_LONG).show();
            }
        });
    }
}