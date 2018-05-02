package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Science_Club extends AppCompatActivity {

    WebView sClub_wv;

    final String a_sClub = "<b><u>Rajshahi College Science Club: </u></b></br></br>" +
            "Rajshahi College Science Club came into being with an aim at encouraging science and science related researches.  " +
            "The club has already been awarded in Science Fair and Innovation Fair.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science__club);

        sClub_wv = (WebView)findViewById(R.id.sClubWv);

        String text_sClub = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + a_sClub+
                "</p> " +
                "</body>" +
                "</html>";
        sClub_wv.loadData(text_sClub, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
