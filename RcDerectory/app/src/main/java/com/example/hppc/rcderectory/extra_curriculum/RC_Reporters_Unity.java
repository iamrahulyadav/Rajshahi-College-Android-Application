package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class RC_Reporters_Unity extends AppCompatActivity {

    WebView rcRepu;

    final String rcrepu = "<b><u>Rajshahi College Reporters Unity:</u></b></br></br>"  +
            "In 2012, Rajshahi College Reporters Unity was formed. In the meantime, the organization has arranged " +
            "multiple workshops on journalism. The focus of this organization is to practise journalism, maintain the freedom of " +
            "press, and to ensure the members benfits.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rc__reporters__unity);

        rcRepu = (WebView)findViewById(R.id.rcrepuWv);

        String text_rcrepu = "<html>"+
                    "<body>" +
                        "<p align=\"justify\">"
                            +rcrepu+
                        "</p>"+
                    "</body>"+
                "</html>";

        rcRepu.loadData(text_rcrepu, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
