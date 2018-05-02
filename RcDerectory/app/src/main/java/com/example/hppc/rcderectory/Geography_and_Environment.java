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

public class Geography_and_Environment extends AppCompatActivity {

    ListView geoTeacherList;

    final String d_name = "Geography and Environment";

    final String bh = "Rajshahi College is one of the Colleges in which Geography was introduced as a subject in the early stages of College education in the " +
            "then East Pakistan. Geography was introduced in 1951 in higher secondary and degree level, Honours level in 1972 and Masters level in 1993. <br></br>" +

            "Many renowned teachers including Prof. M. I. Chowdhury, Prof. Rafiq Ahmed, Prof. A. B. M. Rezaul Haq, Prof. Md. Golam Nabi, Prof. Nazrul Islam " +
            "taught Geography in this department. Many students obtaining degrees form this department, have been serving in different spheres of thesociety and " +
            "country. <br></br>" +

            "Nowadays importance of Geography is increasing rapidly for contribution towards mitigating environmental disasterand problems worldwide. Recently " +
            "many meritorious students of Honours and Mastersâ€™ levels of this department have brought reputationfor the department. The department " +
            "comprises eleven devoted teachers, three employees and more than one thousand students.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography_and__environment);

        geoTeacherList = (ListView)findViewById(R.id.geoTeacher_name);

        String[] tea_nam = {"01. U. F. Hosne Ara Khanum\nId. 04360",
                "02. Nadira Aziz\nId: 06709",
                "03. Md. Kamruzzaman\nId: 16987",
                "04. Md. Zahirul Islam\nId: 14193",
                "05. Md. Manirul Islam\nId: 15569",
                "06. Md. Monirul Islam\nId: 13671",
                "07. Mst. Farzana Hossain\nId: 13363",
                "08. Md. Abdul Hakim\nId: 10192",
                "09. Md. Aminur Rahman\nId: 22146",
                "10. Muhammad Asad-Uz-Zaman\nId: 22228",
                "11. Md. Abdur Razzaque\nId: 23219",
                "12. Md. Mahfuzur Rahman",
                "13. Md. Azizur Rahman",
                "14. Md. Mojahar Ali"
        };

        String[] tea_poss = {"Professor",
                "Associate\nProfessor",
                "Associate\nProfessor",
                "Assistant\nProfessor",
                "Assistant\nProfessor",
                "Assistant\nProfessor",
                "Assistant\nProfessor",
                "Lecturer",
                "Lecturer",
                "Lecturer",
                "Lecturer",
                "Computer\nOperator",
                "M.L.S.S",
                "M.L.S.S"
        };

        String[] tea_pnumber = {"+8801733946660",
                "+8801716411407",
                "+8801717135653",
                "+8801749907907",
                "+8801827597709",
                "+8801816298686",
                "+8801726305650",
                "+8801711467367",
                "+8801718028302",
                "+8801710245774",
                "+8801717849369",
                "+8801729320120",
                "+8801929142117",
                "+8801734828339"
        };

        int[] tea_img = {R.drawable.geo_hosne_ara_khanum_01,
                R.drawable.geo_nadira_aziza_02,
                R.drawable.geo_kamruzzaman_03,
                R.drawable.geo_zahirul_islam_04,
                R.drawable.geo_monirul_islam_05,
                R.drawable.geo_monirul_islam_06,
                R.drawable.geo_farjana_hossain_07,
                R.drawable.geo_abdul_hakim_08,
                R.drawable.geo_aminur_rahman_09,
                R.drawable.geo_muhammud_asad_uz_zamman_10,
                R.drawable.geo_abdur_razzak_11,
                R.drawable.geo_mahfuzur_rahman_12,
                R.drawable.geo_azizur_rahman_13,
                R.drawable.geo_mojahar_ali_14
        };

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Geography_and_Environment.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        geoTeacherList.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_geography_and__environment, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721771499"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rc1873geography@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Geography_and_Environment.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Geography_and_Environment.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/geography?");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/geography"));
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
                Toast.makeText(Geography_and_Environment.this, "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}
