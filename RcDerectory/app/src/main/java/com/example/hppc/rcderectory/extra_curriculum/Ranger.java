package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Ranger extends AppCompatActivity {

    WebView ranGer;

    final String a_ranger = "<b><u>Rajshahi College Ranger Unit:</u></b></br></br>" +
            "''Determined to stay always ready to serve the country''- with this slogan Rajshahi College Ranger " +
            "Unit started its journey in 2016. Rajshahi College Ranger Unit has gained reputation participating in different " +
            "trainings and social services.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranger);

        ranGer = (WebView)findViewById(R.id.rangerWv);

        String text_ranger = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + a_ranger+
                "</p> " +
                "</body>" +
                "</html>";
        ranGer.loadData(text_ranger, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
