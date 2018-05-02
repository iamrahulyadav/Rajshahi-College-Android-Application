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

public class History_Department extends AppCompatActivity {

    ListView histTeacherList;

    final String d_name = "History Department";
    final String bh = "The department of History was introduced when the College was established in 1873.<br></br>" +

            "Many prominent figures of the country served here as teacher, such as A.R Mallik, later on who became the Vice Chancellor of Chittagong University and " +
            "also the finance minister of Bangladesh, Habibur Rahman Shely, who became the Chief Justice and also the Chief Advisor of Bangladesh Care Taker government " +
            "later.<br></br>" +
            "As well as, many students of this department became famous home and abroad.";

    String[] tea_nam ={"01. ZAKIA BEGUM\nId: ",
            "02. DR. MD. ELIAS UDDIN\nId: 4337",
            "03. DR. MD. HABIBUR RAHMAN \nId: 4574",
            "04. ABU HASNAT MD. RAFIQUL ISLAM\nId: 5411",
            "05. MD. ANISUZZAMAN\nId: 12785",
            "06. DR. MD. REZAUL KARIM\nId: 16798",
            "07. RATON UDDIN AHMED\nId: 017182",
            "08. MD. TARIQUL ISLAM ANSURI\nId: 014146",
            "09. DR. ABU REZA AZAD\nId: 12275",
            "10. MD. ABUL BASHAR\nId: 22540",
            "11. MD. AL AMIN HAQUE\nId: 22694",
            "12. MD. ABU RAIHAN SIDDQUE",
            "13. MD. ABDUL HAKIM"
    };

    String[] tea_poss ={"Professor",
            "Associate\nProfessor",
            "Associate\nProfessor",
            "Associate\nProfessor",
            "Assistant Professor",
            "Assistant Professor",
            "Assistant Professor",
            "Assistant Professor",
            "Lecturer",
            "Lecturer",
            "Lecturer",
            "Computer Operator",
            "M. L. S. S"
    };

    String[] tea_pnumber = {"+8801732883403",
            "+8801712547735",
            "+8801718183646",
            "+8801711313932",
            "+8801711046482",
            "+8801716884030",
            "+8801716307227",
            "+8801740860570",
            "+8801719092555",
            "+8801729734234",
            "+8801752507837",
            "+8801913235029",
            "+8801866410146"
    };

    int[] tea_img ={R.drawable.his_zakia_begum_01,
            R.drawable.his_elias_uddin_02,
            R.drawable.his_habibur_rahman_03,
            R.drawable.his_rafiqul_islam_04,
            R.drawable.his_anisuzzaman_05,
            R.drawable.his_rezaul_karim_06,
            R.drawable.his_raton_uddin_ahemed_07,
            R.drawable.his_tariqul_islam_ansuri_08,
            R.drawable.his_abu_reza_azad_09,
            R.drawable.his_abul_bashar_10,
            R.drawable.his_amin_haque_11,
            R.drawable.his_abu_raihan_siddque_12,
            R.drawable.his_abdul_hakim_13
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history__department);

        histTeacherList = (ListView)findViewById(R.id.historyTeacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(History_Department.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        histTeacherList.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_history__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721774257"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rc1873history@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(History_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(History_Department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/history");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/history"));
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
