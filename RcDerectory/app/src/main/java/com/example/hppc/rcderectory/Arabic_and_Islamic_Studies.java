package com.example.hppc.rcderectory;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Arabic_and_Islamic_Studies extends AppCompatActivity {

    ListView arbISTeacherList;

    final String d_name = "Arabic And Islamic Studies";
    final String bh = "It is an old department of Rajshahi College. It launched a few years later as the college established in 1873. In 1878 the window of this " +
            "Department was opened among with a few others of that and recognized as the Department of Arabic and Persian. Teaching on Islamic Studies was also " +
            "going on simultaneously in accordance with other courses and lately in 1981 the name changed.<br></br>" +

            "Here the courses on B.A (Hons) and M.A in Arabic Literature, B.A (pass) and M.A in Islamic Studies are going on. There are approximately 900 students " +
            "studding in different courses where the teacher's stuff only nine. Among them one for Professor, two for Associate professors, three for Assistant " +
            "Professors and three for Lecturers. <br></br>" +

            "It is to appreciate highly as the centre of education that longed hundred and thirty four years where some national educational laureates like " +
            "Professor Dr. M. A. Bari (two times former Vice -Chancellor of the University of Rajshahi and founder Vice- Chancellor of National University), " +
            "Professor Dr. Golam Maksud Hilaly, Professor Dr. Lutful Haque and many other Scholars were the teachers of this Department";

    String[] tea_nam = {"01. Muhammad Afsar Ali\nId: 9016",
            "02. Dr.Abu Syeed Md. Nurul Islam\nId: 5363",
            "03. Sheikh Mohammad Abdul Hamid\nId: 4328",
            "04. Abu Talha Md. Monirul Islam\nId: ",
            "05. MD. Mostafizur Rahman\nId: 13531",
            "06. Mohammod Abdul Majid\nId: 14149",
            "07. Rokhsana Akhter\nId: 17760",
            "08. Md.Mostafizur Raman\nId: 17976",
            "09. Amirul Islam\nId: 18481",
            "10. MD. ZAHIDUL HASAN (JONY)",
            "11. MD. SAIDUR RAHAMAN"
    };

    String[] tea_poss = {"Professor",
            "Associate\nProfessor",
            "Associate\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Lecturer",
            "Lecturer",
            "Lecturer",
            "Computer\nOperator",
            "M.L.S.S"
    };

    String[] tea_pnumber = {"+8801716250571",
            "+8801712517156",
            "+8801916026655",
            "+8801719303426",
            "+8801714568484",
            "+8801713700985",
            "+8801191590667",
            "+8801911956685",
            "+8801725621505",
            "+8801796832167",
            "+8801945138399"
    };

    int[] tea_img = {R.drawable.ais_mohammad_afsar_ali_01,
            R.drawable.ais_abu_syeed_nurul_islam_02,
            R.drawable.ais_shaikh_abdul_hamid_03,
            R.drawable.ais_monirul_islam_04,
            R.drawable.ais_mostafizur_rahman_05,
            R.drawable.ais_mohammad_abdul_majid_06,
            R.drawable.ais_rokhsana_akhter_07,
            R.drawable.ais_mostafizur_rahman_08,
            R.drawable.ais_amirul_islam_09,
            R.drawable.ais_zahidul_hasan_10,
            R.drawable.ais_saidur_rahman_11
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic_and__islamic__studies);

        arbISTeacherList = (ListView)findViewById(R.id.arabic_IS_Teacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Arabic_and_Islamic_Studies.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        arbISTeacherList.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_arabic_and__islamic__studies, menu);
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

    //Bottom 4 buttons
    //01. Call button for call department
    public void d_call(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721774249"));
        try{
            startActivity(intent);
        }
        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "Activity is not founded", Toast.LENGTH_SHORT).show();
        }
    }

    //2. E-mail
    public void send_mail(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rcarabic1201@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Arabic_and_Islamic_Studies.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Arabic_and_Islamic_Studies.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit rc.edu.bd/economics");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/economics/"));
                    try {
                        startActivity(browserButton);
                    }
                    catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(getApplicationContext(),"Something wrong!.", Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    //no connection
                    Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Arabic_and_Islamic_Studies.this, "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}
