package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Natyo_Sangsad extends AppCompatActivity {

    WebView ns_wv;

    final String a_ns = "<b><u>Rajshahi College Natyo Sangsad:</b></u></br></br>" +
            "With the mission to sustain Drama movement this organization started its journey in 2012. This organization has already " +
            "staged six dramas on various occasions. 'We too are on the path of flourishment' -being saturated with this spirit " +
            "and getting involved in creative and positive drama movement, this club is heading forward staging new productions.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natyo__sangsad);

        ns_wv = (WebView)findViewById(R.id.nsWv);

        String text_ns = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + a_ns+
                "</p> " +
                "</body>" +
                "</html>";
        ns_wv.loadData(text_ns, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
