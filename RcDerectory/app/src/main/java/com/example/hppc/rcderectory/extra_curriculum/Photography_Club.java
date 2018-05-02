package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Photography_Club extends AppCompatActivity {

    WebView rcpc_wv;

    final String a_rcpc = "<b><u>Rajshahi College Photography Club:</u></b></br></br>" +
            "A Photography Club was formed with a few interested students. Established in 2016, the club started its journey " +
            "with an exhibition titled ''Independence Day Photography Exhibition''.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photography__club);

        rcpc_wv = (WebView)findViewById(R.id.rcpcWv);

        String text_rcpc = "<html>" +
                    "<body>" +
                        "<p align=\"justify\">"
                            + a_rcpc+
                        "</p> " +
                    "</body>" +
                "</html>";
        rcpc_wv.loadData(text_rcpc, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
