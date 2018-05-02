package com.example.hppc.rcderectory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * Created by HP PC on 12/27/2016.
 */

public class RC_ALUMNUS extends Fragment{

    WebView rc_alumnus;
    View v4;

    String rc_alum = "Notable Alumni of Rajshahi College" +
            "<ol>" +
                "<li><a href=\"http://en.wikipedia.org/wiki/Khademul_Bashar\">Khademul Bashar</a></li>"+
                "<li>Md. Golam Kabir</li>"+
                "<li>Sir Jodunath Sarkar</li>"+
                "<li><a href=\"http://en.wikipedia.org/wiki/Qazi_Motahar_Hossain\">Qazi Motahar Hossain</a></li>"+
                "<li>Romaprasad Chanda</li>"+
                "<li><a href=\"http://en.wikipedia.org/wiki/Akshay_Kumar_Maitreya\">Akshay Kumar Maitreya</a></li>"+
                "<li>Sree Radhika Mohon Moitrya</li>"+
                "<li>Promothnath Bishi</li>"+
                "<li><a href=\"http://en.wikipedia.org/wiki/Rajanikanta_Sen\">Rajanikanta Sen</a></li>"+
                "<li>Khan Bahadur Emaduddin Ahmad</li>"+
                "<li>Mirza Golam Hafiz</li>"+
                "<li>Dr. Kazi Abdul Mannan</li>"+
                "<li>Dr. Mazharul Islam</li>"+
                "<li>Dr. Golam Moula</li>"+
                "<li><a href=\"http://en.wikipedia.org/wiki/Chief_Justice_of_Bangladesh\">Justice Badrul Haider Choudhury</a></li>"+
                "<li><a href=\"http://en.wikipedia.org/wiki/Muhammad_Habibur_Rahman\">Justice Muhammad Habibur Rahman</a></li>"+
                "<li>Dr. Md. Enamul Haque</li>"+
                "<li>Rittik Ghotok</li>"+
                "<li>Shahid Anwar Pasha</li>"+
                "<li>Dr. Ebne Golam Samad</li>"+
                "<li>Dr. Emaz Uddin Ahmad</li>"+
                "<li><a href=\"http://en.wikipedia.org/wiki/Dr._M_Wazed_Ali_Miah\">Dr.M. Wazed Ali Miah</a></li>"+
                "<li>Nazma Jesmin Choudhury</li>"+
            "</ol>";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v4 = inflater.inflate(R.layout.fragment_alumnus, container, false);

        rc_alumnus = (WebView) v4.findViewById(R.id.web_view_alumnus);
        rc_alumnus.loadData(rc_alum, "text/html", "utf-8");
        String text = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + rc_alum+
                "</p> " +
                "</body>" +
                "</html>";

        return v4;
    }
}
