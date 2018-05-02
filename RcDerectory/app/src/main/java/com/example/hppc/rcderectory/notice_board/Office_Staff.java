package com.example.hppc.rcderectory.notice_board;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.hppc.rcderectory.R;

public class Office_Staff extends AppCompatActivity {

    WebView Osrc_Wv;

    final String osRc = "<ol>" +
                "<li>Md. Abu Jafor Ali</br>Main Assistant</br>8801714793872</li></br>" +
                "<li>Md. Ashikur Rahman</br>Case Register</br>+8801724112991</li></br>" +
                "<li>Md. Kamal Hossain</br>Computer Operator</br>+8801775466966</li></br>" +
                "<li>Md. Humain Kadir</br>Computer Operator</br>+8801710686227</li></br>" +
                "<li>Md. Residul Haque</br>Computer Operator</br>+8801724051240</li></br>" +
                "<li>Md. Lipon Ali</br></br>+8801191501599</li></br>" +
                "<li>Md. Abdul Mazid</br></br>+8801721379638</li></br>" +
                "<li>Md Anisur Rahman</br>M.L.S.S</br>+8801720144349</li></br>" +
                "<li>Muhammad Ali</br>Temporary Office Assistant</br>+8801937788086</li></br>" +
                "<li>Abdul Motaleb</br>Temporary Office Assistant</br>+8801712547914</li></br>" +
                "<li>Md. Asadul Islam</br>Temporary Office Assistant</br>+8801783037838</li></br>" +
                "<li>Md. Sadikula Alam</br>Temporary</br>+8801783942667</li></br>" +
                "<li>Md. Abul Khair</br>Temporary</br>+8801783942666</li></br>" +
                "<li>Md. Shamsuddin</br>Temporary</br>+8801735691464</li></br>" +
                "<li>Md. Rahim bakhasa</br>Temporary</br>+8801190133589</li></br>" +
                "<li>Md. Ashraf Ali</br>Temporary</br>+8801712340137</li></br>" +
                "<li>Md. Nurul Islam</br>Temporary</br>+8801913797286</li></br>" +
                "<li>Shamsul Haque</br>Temporary</br>+8801718675922</li></br>" +
                "<li>Ranu Bibi</br>Temporary</br>+8801714655862</li></br>" +
                "<li>Rahima Khatun</br>Temporary</br>+8801190133586</li></br>" +
                "<li>Md. Badal Rahman</br>Temporary (Main Gate)</br>+8801766202091</li></br>" +
                "<li>Md. Shahin</br>Temporary (Main Gate)</br>+8801912082220</li></br>" +
                "<li>Md. Abdus Salam</br>Temporary</br>+8801723909175</li></br>" +
                "<li>Md. Sumun</br>Temporary</br>+8801728859053</li></br>" +
                "<li>Md. Arif</br>Temporary</br>+8801721664757</li>"+
            "</ol>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office__staff);

        Osrc_Wv = (WebView)findViewById(R.id.rcOsWv);

        Osrc_Wv.loadData(osRc, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
