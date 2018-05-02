package com.example.hppc.rcderectory.extra_curriculum;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

/**
 * Created by HP PC on 1/8/2017.
 */

public class ABOUT_RCBC extends Fragment{

    View v1_rcbc;

    WebView mWebViewRCBC;

    String abrcbc = "Rajshahi College Business Club(RCBC) is a student-led organization whose mission is to  work for the career development of Rajshahi " +
            "college student. Also stablish collaborative relationships between students and the local business community in order to expand our current " +
            "skills and inspire our futures. Students meet weekly to discuss new ideas. New members are always welcome.<br></br>"+

            "Rajshahi College Business Club wishes to provide countries corporate with a pool of adapt and expert human resource.";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v1_rcbc = inflater.inflate(R.layout.fragment_rcbc_about, container, false);

        mWebViewRCBC = (WebView) v1_rcbc.findViewById(R.id.wvabout_rcbc);

        String text = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + abrcbc+
                "</p> " +
                "</body>" +
                "</html>";
        mWebViewRCBC.loadData(text, "text/html", "utf-8");

        return v1_rcbc;
    }
}
