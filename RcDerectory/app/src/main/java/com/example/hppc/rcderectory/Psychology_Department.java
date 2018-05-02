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

public class Psychology_Department extends AppCompatActivity {

    ListView psyTeacherList;

    final String d_name = "Psychology DEpartment";
    final String bh = "The department of Psychology is one of the famous departments of this college. This department started functioning in 1969 with Higher " +
            "Secondary courses in the Fuller hostel building in 1970. The department was then shifted to the 1st floor of Arts building in 1975 and again to " +
            "the 1st floor of second science building in 1996.<br></br>" +

            "The founding Head of the department was Professor Md. Nurunnabi. The department was started with only three teaching staff. In the early of this " +
            "department the number of students in one Honours session was 70 and now it is 135. At present the department is running with four class rooms, " +
            "one computer room, one teachers room and a room for the Head of the department. About 1,000 students are studying in this department. In 1972, " +
            "Honours courses have been introduced here under the University of Rajshahi and Masters Course under National University in 1992.";

    String[] tea_nam = {"01. Md. Nurul Haque Chowdhury\nId: 4024",
            "02. Partha Sarathi Biswas\nId: 4363",
            "03. Md. Jahangir Hossain\nId: 4519",
            "04. Md. Mashudul Haq Siddik\nId: 10433",
            "05. Syed Nadim Akter\nId: 12607",
            "06. Md. Abu Bokor Siddik\nId: 14993",
            "07. Mohammed Saiful Islam\nId: 12608",
            "08. Dr. Nitai Kumar Saha\nId: 15366",
            "09. Md. Azmat Ali\nId: 14180",
            "10. Pramath Chandra Sarker\nId: 23925",
            "11. Umme Ishrat Jahan\nId: ",
            "12. Md. Razem Uddin",
            "13. Md. Estik Hossain Bishal",
            "14. Md. Wahid Rana"
    };

    String[] tea_pnumber = {"+8801711399633",
            "+8801716695707",
            "+8801711040604",
            "+8801914415336",
            "+8801716726699",
            "+8801712628525",
            "+8801714459202",
            "+8801712550096",
            "+8801818212421",
            "+8801714925923",
            "+8801556318683",
            "+8801845144441",
            "+8801963356075",
            "+8801750860805"
    };

    String[] tea_poss = {"Professor",
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
            "Computer Operator",
            "M.L.S.S",
            "M.L.S.S"
    };

    int[] tea_img = {R.drawable.psy_nurul_haque_01,
            R.drawable.psy_partha_sarathi_bissas_02,
            R.drawable.psy_zahangir_hossain_03,
            R.drawable.psy_mashudul_haq_siddiq_04,
            R.drawable.psy_syed_nadim_akter_05,
            R.drawable.psy_abu_bokor_siddiki_06,
            R.drawable.psy_shaiful_islam_07,
            R.drawable.psy_natai_kumar_saha_08,
            R.drawable.psy_azmat_ali_09,
            R.drawable.psy_promoth_chandra_sarkar_10,
            R.drawable.psy_umma_ishrat_zahan_11,
            R.drawable.psy_razem_uddin_12,
            R.drawable.psy_estik_hossain_bishal_13,
            R.drawable.psy_wahid_rana_14

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychology__department);

        psyTeacherList = (ListView)findViewById(R.id.psyTeacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Psychology_Department.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        psyTeacherList.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_psychology__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721770550"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"dept.psy.rc@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Psychology_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Psychology_Department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/psychology");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/psychology"));
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
                Toast.makeText(Psychology_Department.this, "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}

