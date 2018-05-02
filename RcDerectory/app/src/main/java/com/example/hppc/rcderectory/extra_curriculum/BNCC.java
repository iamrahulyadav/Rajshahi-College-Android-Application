package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

import com.example.hppc.rcderectory.R;

public class BNCC extends AppCompatActivity {

    ImageView bncc_ja;
    WebView bncc_wv;

    final String aBncc = "<b><u>Rajshahi College BNCC:</u></b></br></br> " +
            "Rajshahi College BNCC was declared the best unit in college level in 2016.  Every cadet of BNCC is oathbound " +
            "in protecting the motherland. Apart from this, the well trained band group of this unit has already gained everybody's " +
            "praise. Rajshahi College unit is a part of the Mohasthan Regiment.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bncc);

        bncc_ja = (ImageView) findViewById(R.id.bncc_img);
        bncc_wv = (WebView) findViewById(R.id.bnccWv);

        String text_bncc = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + aBncc+
                "</p> " +
                "</body>" +
                "</html>";
        bncc_wv.loadData(text_bncc, "text/html", "utf-8");


        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}