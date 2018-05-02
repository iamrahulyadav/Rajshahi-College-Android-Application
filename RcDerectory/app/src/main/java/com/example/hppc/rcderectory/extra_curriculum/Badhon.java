package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Badhon extends AppCompatActivity {

    WebView badhan_wv;

    final String a_badhon = "<b><u>Rajshahi College Badhon:</u></b></br></br>" +
            "''We possess love for human beings within us. We are grateful to our Motherland.'' Out of responsibility for the country " +
            "Badhon started its activities in 2006.  Badhon has helped 50 thousand people to know their blood group and has already " +
            "provided blood to 15 thousand critical patients.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badhon);

        badhan_wv = (WebView)findViewById(R.id.badhonWv);

        String text_badhon = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + a_badhon+
                "</p> " +
                "</body>" +
                "</html>";
        badhan_wv.loadData(text_badhon, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
