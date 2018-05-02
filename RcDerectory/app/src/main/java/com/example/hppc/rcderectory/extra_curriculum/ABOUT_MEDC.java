package com.example.hppc.rcderectory.extra_curriculum;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

/**
 * Created by HP PC on 1/9/2017.
 */

public class ABOUT_MEDC extends Fragment{

    View v1_medc;

    WebView mWebViewMEDC;

    String abmedc = "Mirror English Debating Club is the central debating club of Rajshahi College. It is also the only English debating " +
            "club. The office room of the club is situated at the ground floor of English Department. The club was established on 07.07.2009. " +
            "Its two main objectives are to create debaters and cultivate good logic & apply it for humanity. This Club has four advisers " +
            "and a managing body.</br></br>" +

            "After the birth of the club, the club is running nicely by its own constitution and by the help of the teachers of English " +
            "Department. Especially honorable Principal, Prof. Md. Habibur Rahman, of Rajshahi College takes a great care of the club. " +
            "He patronizes the club to arrange different kinds of debate competitions and cultural programs every year. Even the debaters " +
            "of this club take part in debate championships in local and national level. They have snatched many prizes. Thus the club has " +
            "brought a great reputation for the College.</br></br>" +

            "Formal debate practice session starts every Thursday at 12.30pm. Regular practice session starts at 12.30 on other working days except holidays.";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v1_medc = inflater.inflate(R.layout.fragment_medc_about, container, false);

        mWebViewMEDC = (WebView)v1_medc.findViewById(R.id.wvabout_medc);
        String text = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + abmedc+
                "</p> " +
                "</body>" +
                "</html>";
        mWebViewMEDC.loadData(text, "text/html", "utf-8");

        return v1_medc;
    }
}
