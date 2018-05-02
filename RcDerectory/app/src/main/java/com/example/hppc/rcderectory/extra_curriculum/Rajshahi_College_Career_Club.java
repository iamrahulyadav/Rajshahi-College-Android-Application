package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Rajshahi_College_Career_Club extends AppCompatActivity {

    WebView rccc_wv;

    final String a_sdc = "<b><u>Rajshahi College Career Club :</b></u></br></br>" +
            "Rajshahi College Career Club provides pre-career training to establish a perfect career after completion of the " +
            "graduation.  Many students of this club are working in several pharmaceuticals companies. ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__college__career__club);

        rccc_wv = (WebView)findViewById(R.id.rcccWv);

        String text_rccc = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + a_sdc+
                "</p> " +
                "</body>" +
                "</html>";
        rccc_wv.loadData(text_rccc, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
