package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Rotari_Club extends AppCompatActivity {

    WebView rcRotc;

    final String rcRotaric = "<b><u>Rajshahi College Rotari Club:</u></b></br></br>" +
            "An organization devoted to the cause of the oppressed, organized by those with wealth and heart. " +
            "Rajshahi College is committed to help the services of this club reach everyones doorstep.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotari__club);

        rcRotc = (WebView) findViewById(R.id.rcrcroticWv);

        String text_RcRotc = "<html>" +
                    "<body>" +
                        "<p align =\"justify\">"
                            +rcRotaric+
                        "</p>"+
                    "</body>" +
                "</html>";

        rcRotc.loadData(text_RcRotc, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
