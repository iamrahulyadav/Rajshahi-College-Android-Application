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

public class ACTIVITY_RCBC extends Fragment {

    View v2_rcbc;

    WebView mrcbc_WView;

    final String avti_rcbc = "<b><u>Activity Rajshahi College Business Club(RCBC): </u></b>"+
            "<ol>" +
                "<li>Regular session for skill development.</li></br>"+
                "<li>Regular update ourselves for various job circulars and competitions.</li></br>"+
                "<li>Developing English, computer and presentation skill.</li></br>"+
                "<li>Discussion about Preparation for various jobs.</li></br>"+
                "<li>Arranging career and social Entrepreneurship related workshops, seminars, competitions.</li></br>"+
                "<li>Discussion about Higher education on study in Abroad.</li></br>"+
                "<li>Discussion about the Preparation for BCS Exam.</li></br>"+
                "<li>Any other Activities related to career development.</li></br>"+
            "</ol>";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v2_rcbc = inflater.inflate(R.layout.fragment_rcbc_activity, container, false);

        mrcbc_WView = (WebView) v2_rcbc.findViewById(R.id.rcbcwv_activity);

        mrcbc_WView.loadData(avti_rcbc, "text/html", "utf-8");

        return v2_rcbc;
    }
}