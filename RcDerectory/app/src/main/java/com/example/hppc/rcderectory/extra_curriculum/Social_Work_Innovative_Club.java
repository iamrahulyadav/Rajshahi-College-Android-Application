package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Social_Work_Innovative_Club extends AppCompatActivity {

    WebView rc_swic;

    final String a_swic = "<b><u>Social Work Innovative Club:</u></b></br></br>" +
            "Social Work Innovative Club was established in 2016. They have launched the 'Clean College " +
            "Campus Campaign'. It is focused on engaging the student in various creative activities.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social__work__innovative__club);

        rc_swic = (WebView)findViewById(R.id.rcswicWv);

        String text_swic = "<html>" +
                    "<body>" +
                        "<p align = \"justify\">"
                            +a_swic+
                        "</p>" +
                    "</body>" +
                "</html>";

        rc_swic.loadData(text_swic, "text/html", "utf-8");
        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
