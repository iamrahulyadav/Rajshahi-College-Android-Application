package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Sociology_Debate_Club extends AppCompatActivity {

    WebView sdc_wv;

    final String a_sdc = "<b><u>Sociology Debate Club (SDC) Rajshahi College:</b></u></br></br>" +
            "Sociology Debate Club (SDC) is the Departmental debate club of Rajshahi College. The club was established in the " +
            "Sociology Department in 2016 during the revolution of debate practic-ing at Rajshahi College. The club is fully " +
            "determind to search truth, to establish the truth with logic, to create debators, and preserve the debate related " +
            "proceedings in perfect way through both Bangla and English debate.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sociology__debate__club);

        sdc_wv = (WebView)findViewById(R.id.sdcWv);

        String text_sdc = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + a_sdc+
                "</p> " +
                "</body>" +
                "</html>";
        sdc_wv.loadData(text_sdc, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
