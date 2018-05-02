package com.example.hppc.rcderectory.extra_curriculum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class MUNIARC extends AppCompatActivity {

    WebView muniarc_wv;

    final String a_muniarc = "<b><u>Model United Nations International Affairs of Rajshahi College (MUNIARC):</b></u></br></br>" +
            "MUNIARC is one of the best platforms in Rajshahi College to learn about global affairs and politics & leadership " +
            "development under the concept of United Nations assemblies. Besides MUNIARC helps studnets dcvelop various skills " +
            "as for begotiating, public speaking convincing power. It has a dedicated, active and energetic group of students " +
            "to promote the concept of Model United Nations.</br></br>" +

            "It imparts training workshops and different brainstorming activities for its members to participate in different " +
            "MUN Conferences. Moreover MUNIARC also helps students to develop patriotism, floufish International relationships " +
            "and public relations. Students are motivated towards social activities and actively take part in welfare of society " +
            "through MUNIARC. ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muniarc);

        muniarc_wv = (WebView) findViewById(R.id.muniarcWv);

        String text_muniarc = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + a_muniarc+
                "</p> " +
                "</body>" +
                "</html>";
        muniarc_wv.loadData(text_muniarc, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
