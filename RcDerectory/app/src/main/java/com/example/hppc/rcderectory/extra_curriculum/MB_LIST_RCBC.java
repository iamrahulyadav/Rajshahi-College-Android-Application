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

public class MB_LIST_RCBC extends Fragment {

    View v4_rcbc;

    WebView wcomm_rcbc;

    final String commList = "<b><u>List of RCBC working committee: </u></b>"+
            "<ol>" +
                "<li>President</br>Shahidul islam</br>Accounting</br>2013-2014</br>+8801521-473563</li></br>" +
                "<li>General Secretary</br>Rony ahmed</br>Accounting</br>2013-2014</br>+8801719-403627</li></br>" +
                "<li>Treasurer</br>Rakibul islam</br>Accounting</br>2014-2015</br>+8801746-979961</li></br>" +
                "<li>Office  Secretary</br>Azizur rahim</br>Management</br>2014-2015</br>+8801721-007362</li></br>" +
                "<li>Joint secretary</li>"+
                "<ul> "+
                    "<li>Mir ashraf ali Palash</br>Accounting</br>2013-2014</br>+8801920-672374</li></br>"+
                    "<li>Sabuj kumar</br>Management</br>2013-2014</br>+8801750-821293</li></br>"+
                    "<li>Timir kumar mondol</br>Mraketing</br>2013-2014</br>+8801774-882848</li></br>"+
                    "<li>Amanullah sohan</br>Accounting</br>2012-2013</br>+8801914-947645</li></br>"+
                "</ul>" +
                "<li>Organizer Secretary</br>Rahul Sarkar pom</br>Management</br>2012-2013</br>+8801771-222060</li></br>" +
                "<li>Press Secretary</br>Aditi Asha</br>Accounting</br>2015-2016</li></br>" +
                "<li>Student Secretary</li>" +
                "<ul>"+
                    "<li>Ahsana Hossen Badhan</br>Accounting</br>2014-2015</br>+8801735-242492</li></br>" +
                    "<li>G.S Rafi</br>Accounting</br>2014-2015</br>+8801755-378847</li></br>" +
                "</ul>"+
                "<li>Cultural Secretary</br>Kewsar hossain</br>Accounting</br>2013-2014</br>+8801767-006469</li></br>" +
                "<li>Edu. and info. Secretary</br>Nur A Shaba</br>Accounting</br>2012-2013</br>+8801744-315668</li></br>" +
                "<li>IT Secretary</br>Tarek hasan</br>Accounting</br>2013-2014</br>+8801761-001721</li></br>" +
            "</ol>";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v4_rcbc = inflater.inflate(R.layout.fragment_rcbc_mb_list, container, false);

        wcomm_rcbc = (WebView)v4_rcbc.findViewById(R.id.wlwv_rcbc);
        wcomm_rcbc.loadData(commList, "text/html", "utf-8");

        return v4_rcbc;
    }
}