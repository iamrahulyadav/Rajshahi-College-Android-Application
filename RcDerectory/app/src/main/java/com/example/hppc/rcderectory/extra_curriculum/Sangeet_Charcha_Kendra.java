package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Sangeet_Charcha_Kendra extends AppCompatActivity {

    WebView sck_wv;

    final String a_sck = "<b><u>Sangeet Charcha Kendra: </u></b></br></br>" +
            "Besides study, Sangeet Charcha Kendra is working relentlessly to make the enthusiastic singers in learning the music " +
            "and establishing them as singers. Many students have been se-lected in several Radio and Television programmes.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sangeet__charcha__kendra);

        sck_wv = (WebView)findViewById(R.id.sckWv);

        String text_sck = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + a_sck+
                "</p> " +
                "</body>" +
                "</html>";
        sck_wv.loadData(text_sck, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
