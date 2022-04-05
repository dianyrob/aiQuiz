package com.diana.iaquizv3;

//import static com.diana.iaquizv3.R.id.backbtn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;

public class BasicPdfActivity extends AppCompatActivity {
    Intent i;
    ImageView back,startTest1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_pdf);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        //back = (ImageView)findViewById(R.id.backbtn);
        startTest1 = (ImageView)findViewById(R.id.topictest1);


        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("intro.pdf")
                .pages(0,1,2,3,4,5,6,7,8) // all pages are displayed by default
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
    }

    @Override
    public void onBackPressed () {
        i = new Intent(BasicPdfActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }

    public void option(View v) {
        switch(v.getId()){
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
}