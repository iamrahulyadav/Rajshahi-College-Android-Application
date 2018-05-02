package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Redcrescent_Unit extends AppCompatActivity {

    WebView redcU_wv;

    final String a_rcrcu= "<b><u>Rajshahi College Redcrescent Unit:</b></u></br></br>" +
            "Rajshahi College Redcrescent Unit was formed in 2016. Just after formation a three-day long workshop on " +
            "'Administering first aid, disaster management' was organized by the mem-bers of the club. The organsation " +
            "started its activities targeting social services.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redcrescent__unit);

        redcU_wv = (WebView)findViewById(R.id.rcrcuWv);

        String text_rcrcu = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + a_rcrcu+
                "</p> " +
                "</body>" +
                "</html>";
        redcU_wv.loadData(text_rcrcu, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
