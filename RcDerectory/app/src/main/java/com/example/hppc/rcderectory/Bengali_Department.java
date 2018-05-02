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

public class Bengali_Department extends AppCompatActivity {

    ListView benTeacherList;

    final String d_name = "Bengali Department";
    final String bh = "It is very difficult to notice just when the Honours course in Bengali was started in Rajshahi College. Despite the instigation of B.L. " +
            "and Masters programs respectively in 1881 and 1892, there is no proof of evidence that Bengali was incorporated as one of the courses of those " +
            "programs. According to Rajshahi College Report 1912-13 Bengali was taught in Rajshahi College as Vernacular Composition respectively at I.A., B.A. " +
            "and English Honours classes. <br></br>" +

            "It is apparent that prior to 1918 no teacher was available for Bengali. Although the Rajshahi College Report 1916-17 reveals that a lecturer named " +
            "Syamacharan Bhattacharya was designated to teach in Sanskrit and Bengali. In 1918, a lecturer namely, Basant Kumar Roy was assigned specifically " +
            "to teach Bengali for the first time. From 1935-1936 session Bengali was initiated as a distinct subject (instead of Vernacular Composition) for the " +
            "I.A. and B.A. classes. In 1937-1938, the College introduced Bengali as an individual subject at the Honours level. In 1941 noted literary personality " +
            "Shri Shiva Prasanna Lahiri was awarded Honours degree in Bangla from Rajshahi College.";

    String[] tea_nam ={"01. MST. MONOWARA KHATUN\nId: 4471",
            "02. MD. OLIUR RAHMAN\nId: 4472",
            "03. Md. Mahfujul Islam\nId: 7889",
            "04. MST. TASLIMA KHATUN\nId: 12611",
            "05. MOIN UDDIN AHMED\nId: 14158",
            "06. MST. SHAKILA SHABNAM\nId: 16181",
            "07.  MD. ABDUR RAHIM\nId: 16061",
            "08.  MD. RABIUL ISLAM\nId: 15971",
            "09. GAZEE  MAHMUD HASSAN\nId: 18296",
            "10. BIBEKANANDA BISWAS\nId: 17816",
            "11. NURJAHAN BEGUM\nId:",
            "12. MD. ARIFUL ISLAM",
            "13. MD. RAZIBUL ISLAM",
            "14. MD. NIEEM  ISLAM",
    };

    String[] tea_poss ={"Professor",
            "Associate\nProfessor",
            "Associate\nProfessor",
            "Associate\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Lecturer",
            "Lecturer",
            "Lecturer",
            "Computer\nOperator",
            "M.L.S.S",
            "M.L.S.S"
    };

    String[] tea_pnumber = {"+8801716439008",
            "+8801746855380",
            "+8801720265381",
            "+8801861318890",
            "+8801716091883",
            "+8801718826121",
            "+8801714331898",
            "+8801716285763",
            "+8801719751408",
            "+8801716090461",
            "+8801719106543",
            "+8801713919451",
            "+8801734393547",
            "+8801935051206",
    };

    int[] tea_img ={R.drawable.ban_monowara_khatun_01,
            R.drawable.ban_oliur_rahman_02,
            R.drawable.ban_mahfujul_islam_03,
            R.drawable.ban_taslima_khatun_04,
            R.drawable.ban_moin_uddin_ahmed_05,
            R.drawable.ban_shakila_shabnam_06,
            R.drawable.ban_abdur_rahman_07,
            R.drawable.ban_rabiul_islam_08,
            R.drawable.ban_gazee_mahmud_hassan_09,
            R.drawable.ban_bibekananda_biswas_10,
            R.drawable.ban_nurjahan_begum_11,
            R.drawable.ban_ariful_islam_12,
            R.drawable.ban_razibul_islam_13,
            R.drawable.ban_nieem_islam_14
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengali__department);

        benTeacherList = (ListView)findViewById(R.id.bengaliTeacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Bengali_Department.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        benTeacherList.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bengali__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721772623"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"Bangladepartment1959@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Bengali_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Bengali_Department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/bengali");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/bengali"));
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
                Toast.makeText(Bengali_Department.this, "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}
