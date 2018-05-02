package com.example.hppc.rcderectory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;

public class Brief_History extends AppCompatActivity {

    TextView d_name;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brief__history);

        d_name = (TextView)findViewById(R.id.dep_name);
        webView = (WebView)findViewById(R.id.web_view);

        Intent intent = getIntent();
        String s = intent.getStringExtra("dname");
        String text = "<html> <body>" +
            "<p align=\"justify\">"
                + intent.getStringExtra("message")+
            "</p> " +
        "</body></html>"
        ;
        d_name.setText(s);
        webView.loadData(text, "text/html", "utf-8");

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_brief__history, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
