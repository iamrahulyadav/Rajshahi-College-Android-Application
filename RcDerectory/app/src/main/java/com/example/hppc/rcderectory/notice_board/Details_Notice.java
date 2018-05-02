package com.example.hppc.rcderectory.notice_board;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hppc.rcderectory.R;

public class Details_Notice extends AppCompatActivity {

    TextView bdTitle, bdDep, bdTime, bdDetails_notice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details__notice);

        bdTitle = (TextView)findViewById(R.id.dnbNewsTitle);
        bdDep = (TextView)findViewById(R.id.dnbNewsDep);
        bdTime = (TextView)findViewById(R.id.dnbNewsTim);
        bdDetails_notice = (TextView)findViewById(R.id.dnbNewsDetails);

        String dn_titl = getIntent().getStringExtra("NOTICE");
        String dn_deptn = getIntent().getStringExtra("DEPATTMENT");
        String dn_time = getIntent().getStringExtra("DATE");
        String dn_details = getIntent().getStringExtra("DETAILS");

        bdTitle.setText("Title: "+dn_titl);
        bdDep.setText("Name: "+dn_deptn);
        bdTime.setText("Date: "+dn_time);
        bdDetails_notice.setText("Details:"+"\n"+dn_details);
    }
}
