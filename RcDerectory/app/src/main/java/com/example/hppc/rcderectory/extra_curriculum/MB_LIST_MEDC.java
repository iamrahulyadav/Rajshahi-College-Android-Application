package com.example.hppc.rcderectory.extra_curriculum;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

/**
 * Created by HP PC on 1/9/2017.
 */

public class MB_LIST_MEDC extends Fragment {

    View v4_rcbc;

    WebView mb_list_medc;

    final String mbList = "<b><u>Managing Body: Mirror English Debating Club</u></b>"+
            "<ol>" +
                "<li>Member One</li></br>" +
                "<li>Member Two</li></br>" +
                "<li>Member Three</li></br>" +
                "<li>Member Four</li></br>" +
                "<li>Member Five</li></br>" +
                "<li>Member Six</li></br>" +
                "<li>Member Seven</li></br>" +
                "<li>Member Eight</li></br>" +
                "<li>Member Nine</li></br>" +
                "<li>Member Ten</li></br>" +
            "</ol>";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v4_rcbc = inflater.inflate(R.layout.fragment_medc_mb_list, container, false);

        mb_list_medc = (WebView)v4_rcbc.findViewById(R.id.wlwv_medc);
        mb_list_medc.loadData(mbList, "text/html", "utf-8");

        return v4_rcbc;
    }
}
