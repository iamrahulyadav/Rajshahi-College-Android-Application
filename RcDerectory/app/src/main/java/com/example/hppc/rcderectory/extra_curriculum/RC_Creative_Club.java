package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class RC_Creative_Club extends AppCompatActivity {

    WebView rccrc_wv;

    final String a_sdc = "<b><u>Rajshahi College Creative Club (RCCC):</b></u></br></br>" +
            "Rajshahi College Creative Club is one of the best platforms in Rajshahi College to explore the creativity of learners. " +
            "It is a unique and innovative club which will reveal the hidden potentiality of students. The club will help students to " +
            "develop new concepts and enhance the skills of quality presentation. In academic section this club provides a solid " +
            "foundation for the students to be an innovative one which helps the studnets to shape their desired career. </br></br>" +

            "It is a club which arranges creative presentations and competition. Rajshahi College Creative Club initiates curricular" +
            "and extra-curricular activies. Organizaing events of different dimensions help the students to enhance their knowledge " +
            "base, sharpen the innovative thinking, increase their integrity, focus on career path and make a bridge between classroom " +
            "learning and real-life implementation. Moreover, such events help the students to compete at national and international " +
            "levels. ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rc__creative__club);

        rccrc_wv = (WebView)findViewById(R.id.rccrcWv);

        String text_rccrc = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + a_sdc+
                "</p> " +
                "</body>" +
                "</html>";
        rccrc_wv.loadData(text_rccrc, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
