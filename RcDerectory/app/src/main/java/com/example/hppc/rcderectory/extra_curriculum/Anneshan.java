package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Anneshan extends AppCompatActivity {

    WebView anshan_wv;

    final String a_anshan = "<b><u>Rajshahi College Anneshan:</u></b></br></br>" +
            "Taking the vow 'Piercing the heart of darkness, we will ignite the candle of knowledge' An-neshan came into being in 2008. " +
            "It is a literary, cultural and debating organization. Patronised by some qualified teachers, some enthusiastic " +
            "young members have passed five successful years. Annesha is their epitome. Cultural heritage forms the spirit of " +
            "a nation and creats har-mony among people. ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anneshan);

        anshan_wv = (WebView)findViewById(R.id.anshanWv);

        String text_anshan = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + a_anshan+
                "</p> " +
                "</body>" +
                "</html>";
        anshan_wv.loadData(text_anshan, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
