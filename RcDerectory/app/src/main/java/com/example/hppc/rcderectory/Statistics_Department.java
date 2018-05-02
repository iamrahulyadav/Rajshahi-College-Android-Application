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

public class Statistics_Department extends AppCompatActivity {

    ListView staTeacherList;

    final String d_name = "Statistics Department";
    final String bh = "Statistics was opened in this college in August 1973 at HSC, Degree (Pass) and Subsidiary level. Nearly 14 years after the start of the " +
            "subject Statistics on 11 October 1987, Honors course have been introduced and stated teaching from session 1986-87.<br></br>" +

            "Support of the then Head of the Department of Psychology of Rajshahi University, Khandaker Monirul Islam and personal level contact " +
            "of respected Principal Dr. Abul Kashem to Professor Khandaker Monwar Hossain, Professor Hossain made inspection and his monumental efforts " +
            "Rajshahi University issue permission to open Honours course in Statistics from session 1986-87 vide Memo No. 69/KaPa; dated 6/04/1987. " +
            "On the ground Ministry of Education allowed to open the same vide Memo no. sha:6/2siâ€“21/87/(993)/ 1(2)-Education; dated 14/09/1987. " +
            "Master Level teaching was permitted from 1993-94 academic session by the National University.";

    String[] tea_nam = {"01. Dewan Abdur Razzak\nId: 4800",
            "02. Md. Abdul Mazid Akand\nId: 5616",
            "03. Samira Begum\nId: 8919",
            "04. K. M. Mahfuzur Rahman\nId: 12945",
            "05. Md. Syful Islam\nId: 14137",
            "06. Usha Rani Saha\nId: 14936",
            "07. Aziza Sultana Rosy Sarkar\nId:",
            "08. Mst. Jubaida Sultana\nId: ",
            "09. Md. Yeasin Ali",
            "10. Md. Amzad Hossain",
            "11. Md. Tarik"
    };

    String[] tea_poss = {"Professor",
            "Associate\nProfessor",
            "Associate\nProfessor",
            "Associate\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Lecturer",
            "Lecturer",
            "Computer Operator",
            "M.L.S.S",
            "M.L.S.S"
    };

    String[] tea_pnumber = {"+8801712505254",
            "+8801735487280",
            "+8801710967313",
            "+8801716648669",
            "+8801718558010",
            "+8801718850436",
            "+8801964250231",
            "+8801726842042",
            "+8801725085177",
            "+880172642670",
            "+8801738181027"
    };
    int[] tea_img = {R.drawable.sta_dewan_abdur_kuddus_01,
            R.drawable.sta_abdul_mazid_akand_02,
            R.drawable.sta_samira_begum_03,
            R.drawable.sta_mahfuzur_rahman_04,
            R.drawable.sta_syful_islam_05,
            R.drawable.sta_usha_rani_saha_06,
            R.drawable.sta_aziza_sultana_rosy_sarkar_07,
            R.drawable.sta_jubadai_sultana_08,
            R.drawable.sta_yeasin_ali_09,
            R.drawable.sta_amzad_hossain_10,
            R.drawable.sta_tarik_11
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics__department);

        staTeacherList = (ListView)findViewById(R.id.statisticsTeacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Statistics_Department.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        staTeacherList.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_statistics__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721775211"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rc1873stat@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Statistics_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Statistics_Department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/statistics");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/statistics"));
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
                Toast.makeText(Statistics_Department.this, "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}
