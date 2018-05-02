package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Abritti_Parishad extends AppCompatActivity {

    WebView ap_wv;

    final String a_ap = "<b><u>Abritti Parishad Rajshahi College:</u></b></br></br>" +
            "Tradition of recitation can inspire students to get involved in recitation.  Patronised by some qualified teachers, " +
            "Abritti Parishad started its journey. Their first programme styled 'Kabita Sandhya' will be held on 21 February, 2017.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abritti__parishad);

        ap_wv = (WebView)findViewById(R.id.apWv);

        String text_ap = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + a_ap+
                "</p> " +
                "</body>" +
                "</html>";
        ap_wv.loadData(text_ap, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
