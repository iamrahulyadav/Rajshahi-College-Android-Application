package com.example.hppc.rcderectory.notice_board;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.hppc.rcderectory.R;

import java.util.HashMap;
import java.util.Map;

public class ADD_NOTICE extends AppCompatActivity {

    EditText upNtitle, upDname, upDate, upNdetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__notice);

        upNtitle = (EditText)findViewById(R.id.upn_title);
        upDname = (EditText)findViewById(R.id.upn_dname);
        upDate = (EditText)findViewById(R.id.upn_time);
        upNdetails = (EditText)findViewById(R.id.upn_details);
    }

    //Upload Notice
    public void upn_submit(View view) {
        //Toast.makeText(getApplicationContext(), "Notice Upload Successfully", Toast.LENGTH_SHORT).show();

        String url ="https://rcnotice.000webhostapp.com/api/post.php";

        StringRequest sq = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }){
            protected Map<String, String> getParams(){
                Map<String, String> parr = new HashMap<String, String>();

                parr.put("mysubject",upDname.getText().toString());
                parr.put("mytitle",upNtitle.getText().toString());
                parr.put("mydate",upDate.getText().toString());
                parr.put("mynews",upNdetails.getText().toString());

                return parr;
            }
        };

        AppController.getInstance().addToRequestQueue(sq);
        Toast.makeText(getApplicationContext(), "Notice Upload Successfully", Toast.LENGTH_SHORT).show();

    }


    //Clear Text
    public void clear_text(View view) {
        Toast.makeText(getApplicationContext(), "Clear Text Field", Toast.LENGTH_SHORT).show();

        upNtitle.setText("");
        upDname.setText("");
        upDate.setText("");
        upNdetails.setText("");
    }
}
