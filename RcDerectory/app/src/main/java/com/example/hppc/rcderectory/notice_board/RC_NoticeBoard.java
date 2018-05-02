package com.example.hppc.rcderectory.notice_board;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.hppc.rcderectory.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RC_NoticeBoard extends AppCompatActivity {

    ListView nbListv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rc__notice_board);

        nbListv = (ListView)findViewById(R.id.notBoardLv);

        fatchingData();
    }

    void fatchingData(){

        String myurl = "https://rcnotice.000webhostapp.com/api/gettingnews.php";
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(myurl, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                final String[] nos_title = new String[response.length()];
                final String[] nos_deptname = new String[response.length()];
                final String[] nos_Timedbk = new String[response.length()];
                final String[] nos_detailNot = new String[response.length()];

                for (int i = 0; i < response.length(); i++){
                    try {
                        JSONObject jsonObject = (JSONObject) response.get(i);
                        nos_title[i] = jsonObject.getString("title");
                        nos_deptname[i] = jsonObject.getString("subject");
                        nos_Timedbk[i] = jsonObject.getString("time");
                        nos_detailNot[i] = jsonObject.getString("news");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                nbListv.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.my_noticebord_lvour, R.id.tvforNblout, nos_title));
                nbListv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(RC_NoticeBoard.this, Details_Notice.class);
                        intent.putExtra("NOTICE", nos_title[i]);
                        intent.putExtra("DEPATTMENT", nos_deptname[i]);
                        intent.putExtra("DATE", nos_Timedbk[i]);
                        intent.putExtra("DETAILS", nos_detailNot[i]);
                        startActivity(intent);
                    }
                });
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d("Volley Log", error);
            }
        });

        com.example.hppc.rcderectory.notice_board.AppController.getInstance().addToRequestQueue(jsonArrayRequest);
        Toast.makeText(getApplicationContext(), "Data Loaded Successfully", Toast.LENGTH_SHORT).show();
    }


    //Upload Notice GTo Server
    public void upliadNoticeServer(View view) {
        Toast.makeText(getApplicationContext(), "Upload Notice To Server", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(RC_NoticeBoard.this, ADD_NOTICE.class);
        startActivity(intent);
    }
}
