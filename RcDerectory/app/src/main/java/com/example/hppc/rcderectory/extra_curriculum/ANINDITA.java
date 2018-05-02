package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class ANINDITA extends AppCompatActivity {

    WebView rcandta;

    final String rcAndta = "<b><u>Rajshahi College ANINDAITA:</u></b></br></br>" +
            "ANINDITA an organization of Rajshahi College regarding the womens rights. It organizes " +
            "different training programmes and workshop in order to make the students conscious of womens rights.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anindit);

        rcandta = (WebView)findViewById(R.id.rcandtaWv);

        String text_rcand = "<html>" +
                    "<body>" +
                        "<p align = \"justify\">"
                            +rcAndta+
                        "</p>"+
                    "</body>" +
                "</html>";

        rcandta.loadData(text_rcand, "text/html", "utf-8");
        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
