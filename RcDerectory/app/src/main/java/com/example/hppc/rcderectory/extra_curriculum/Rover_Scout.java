package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Rover_Scout extends AppCompatActivity {

    WebView rcRs;

    final String rS = "<b><u>Rajshahi College Rover Scout:</u></b></br></br>" +
            "''Determined to stay always ready to serve the country'' keeping this slogan in mind, Rajshahi College Rover " +
            "Scout started its journey on 29 December, 1973. Besides, Rajshahi College Rover Scout has registration of " +
            "5 units.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rover__scout);

        rcRs = (WebView)findViewById(R.id.rcrsWv);

        String text_rs = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + rS+
                "</p> " +
                "</body>" +
                "</html>";
        rcRs.loadData(text_rs, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
