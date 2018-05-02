package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Barind_Theatre extends AppCompatActivity {

    WebView bt_wv;

    final String a_bt = "<b><u>Barind Theatre Rajshahi College: </u></b></br></br>" +
            "'Good Film Good Country'- being enthused by this slogan Barind Theatre observed two 'Bijoy Chalocitro festivals'. " +
            "Focused on initiating the spirit of Liberation War through creating new audience and directors, this club was " +
            "established on 26 March 2011.  Film festivals organized by the club have made Rajshahi College proud. A group " +
            "of young and fresh actors of this club took part in Shilpokola Academy stage drama competition in Dhaka.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barind__theatre);

        bt_wv = (WebView)findViewById(R.id.btWv);

        String text_bt = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + a_bt+
                "</p> " +
                "</body>" +
                "</html>";
        bt_wv.loadData(text_bt, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
