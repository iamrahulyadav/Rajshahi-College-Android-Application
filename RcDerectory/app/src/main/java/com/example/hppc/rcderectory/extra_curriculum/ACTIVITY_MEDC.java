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

public class ACTIVITY_MEDC extends Fragment {

    View v2_medc;

    WebView mmedc_wView;

    final String avti_medc = "<b><u>Activity Mirror English Debating Club: </u></b>" +
            "<ol>" +
                "<li>Activity Zero</li></br>"+
                "<li>Activity One</li></br>"+
                "<li>Activity Two</li></br>"+
                "<li>Activity Three</li></br>"+
                "<li>Activity Four</li></br>"+
                "<li>Activity Five</li></br>"+
                "<li>Activity Six</li></br>"+
            "</ol>";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v2_medc = inflater.inflate(R.layout.fragment_medc_activity, container, false);

        mmedc_wView = (WebView) v2_medc.findViewById(R.id.medcwv);

        mmedc_wView.loadData(avti_medc, "text/html", "utf-8");

        return v2_medc;
    }
}
