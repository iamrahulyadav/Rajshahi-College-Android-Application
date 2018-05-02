package com.example.hppc.rcderectory;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by HP PC on 11/19/2016.
 */

public class RC_AwardList extends Fragment {

    WebView rcawardListt;
    WebView rcawardList;
    View v3;

    String awlt = "<h3>Award List of Rajshahi College<h3>";
    String awl = "I have almost 30 webview in a Tablayout. Everything works fine but my app consumes a lot of memory and will just close because of memory issue. This is what I get in log";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v3 = inflater.inflate(R.layout.fragment_award_list, container, false);
        rcawardList = (WebView) v3.findViewById(R.id.web_view_Awardlist);
        rcawardListt = (WebView) v3.findViewById(R.id.web_view_Awardlistt);

        rcawardListt.loadData(awlt, "text/html", "utf-8");

        String text = "<html> " +
                    "<body>" +
                        "<p align=\"justify\">"
                            + awl+
                        "</p> " +
                    "</body>" +
                "</html>";

        rcawardList.loadData(text, "text/html", "utf-8");
        return  v3;
    }
}