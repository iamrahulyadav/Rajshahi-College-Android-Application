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

public class Philosophy_Department extends AppCompatActivity {

    ListView philosophyTlist;

    final String d_name = "Philosophy Department";
    final String bh = "The department of Philosophy in Rajshahi College is known to be historically famous. Because it has been functioning with pride as an independent " +
            "department soon after the establishment of Rajshahi college in 1873.<br></br>" +

            "Celebrated scholars like Mr. J K Chakrovorty, U C Vottacharia, Charushastri Chakrovorty, Abdul Hai, Md. Shamsuzzaman, Md. Azhar Uddin Mollik, served in this " +
            "department. Having got degree from this department numerous intelligent students have been contributing in various fields home and abroad.<br></br>" +

            "The department is composed of 11 dedicated teachers, 2 office assistants and more than 1200 students.";

    String[] tea_nam ={"01. MAHMUDA KHATUM\nId: 4466",
            "02. RAZIA SULTANA\nId: 4467",
            "03. Md. Rafiqul Islam\nId: 6797",
            "04. MD. SHAFIQUL ALAM\nId: ",
            "05. A.K.M SHAFIQUL ISLAM\nId: 4724",
            "06. MD. SAIFUL ISLAM\nId: 13861",
            "07. DR. MD. SYED ALI AHSHAN\nId: 14150",
            "08. MD. FARUQUE HOSSAIN\nId: 16348",
            "09. KAZI  RUMICHA  KHANAM\nId: 16322",
            "10. MD. MASUD RANA\nId: 21897",
            "11. MD. JOYNAL ABEDIN\nId: 22878",
            "12. MD. JAHURUL HAQUE",
            "13. SHADAIN AHAMMED",
            "14. MD. MONIRUL ISLAM"
    };

    String[] tea_poss ={"Professor",
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

    String[] tea_pnumber = {"+8801842582755",
            "+8801715844573",
            "+8801718550144",
            "+8801712077199",
            "+8801715408862",
            "+8801770645663",
            "+8801716010703",
            "+8801757290666",
            "+8801916689099",
            "+8801718738664",
            "+8801712337527",
            "+8801922778971",
            "+8801714673770",
            "+8801772433421"
    };

    int[] tea_img ={R.drawable.philo_mahmuda_khatun_01,
            R.drawable.philo_razia_sultana_02,
            R.drawable.philo_rafiqul_islam_03,
            R.drawable.philo_shafiqul_alam_04,
            R.drawable.philo_shafiqul_islam_05,
            R.drawable.philo_shafiqul_islam_06,
            R.drawable.philo_syed_ali_ahshan_07,
            R.drawable.philo_faruque_hossain_08,
            R.drawable.philo_rumicha_khanum_09,
            R.drawable.philo_masud_rana_10,
            R.drawable.philo_joynal_abedin_11,
            R.drawable.philo_jahurul_haque_12,
            R.drawable.philo_shadain_ahammed_13,
            R.drawable.philo_monirul_islam_14
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philosophy__department);

        philosophyTlist = (ListView)findViewById(R.id.philosophyTeacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Philosophy_Department.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        philosophyTlist.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_philosophy__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721774313"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rc1873phil@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Philosophy_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Philosophy_Department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/philosophy");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/philosophy"));
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
                Toast.makeText(getApplicationContext(), "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}
