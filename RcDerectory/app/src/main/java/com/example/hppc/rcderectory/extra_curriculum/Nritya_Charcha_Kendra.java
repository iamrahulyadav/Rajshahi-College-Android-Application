package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Nritya_Charcha_Kendra extends AppCompatActivity {

    WebView nck_wv;

    final String a_nck = "<b><u>Rajshahi College Nritya Charcha Kendra:</u></b></br></br> " +
            "Rajshahi College Nritya Charcha Kendra was formed in 2016 being patronized by some respected teachers and students. " +
            "Two workshops have already been organized by the center and it has created immense interest among learners.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nritya__charcha__kendra);

        nck_wv = (WebView)findViewById(R.id.nckWv);

        String text_nck = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + a_nck+
                "</p> " +
                "</body>" +
                "</html>";
        nck_wv.loadData(text_nck, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
