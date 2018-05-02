package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class RC_Community_Policing extends AppCompatActivity {

    WebView rcCp;

    final String a_rccp = "<b><u>Rajshahi College Community Policing:</u></b></br></br>" +
            "Rajshahi College Community Policing Unit was formed in 2016. The members of this unit attended a " +
            "workshop organized by Bangladesh Center for Communication Programme (BCCP). The members are committed to combating " +
            "any anti-social activity in the college campus.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rc__community__policing);

        rcCp = (WebView)findViewById(R.id.rccpWv);

        String text_rccp = "<html>" +
                    "<body>" +
                        "<p align = \"justify\">"
                            +a_rccp+
                        "</p>" +
                    "</body>" +
                "</html>";

        rcCp.loadData(text_rccp, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
