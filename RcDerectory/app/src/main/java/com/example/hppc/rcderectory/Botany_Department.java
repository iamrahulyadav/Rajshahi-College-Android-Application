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

public class Botany_Department extends AppCompatActivity {

    ListView botTeacherList;

    final String d_name = "Botany Department";

    final String bh = "Botany Department is situated at the middle position in the Rajshahi College Campus. Honours course in Botany was started from 1957 in this college. " +
            "At that time the Principal was Dr. Abdul Haque and the Head of the Department was Dr. Samsul Huda Chowdhury. Many renowned teachers served in this department. " +
            "Now this department is rich in all Laboratory equipments with a huge number of books in the seminar library. Around one thousand students study in this " +
            "department in B.Sc Pass, Honours, Previous and Masters courses.<br></br>"+

            "In this Department, a Biotechnology laboratory is playing a major role to learn the new technology of tissue culture technique to plant production. A small " +
            "Botanical Garden decorates the front of this Building.<br></br>"+

            "Besides, brilliant and glorious academic attainments of the members of the teaching staff and the students of this Dept. regularly take part in co-curricular " +
            "activities and they try to prove themselves, successful.";

    String[] tea_nam ={"01. Mst. Halima Khatun\nId: 5538",
            "02. Dr. Md. Rezaul Kari\nId: 4463",
            "03. Nurun Nesa Khatun\nId: 4631",
            "04. Dr.A.N.M. Al-Mamun Chowdhury\nId: 4719",
            "05. Mst. Nasima Khatun\nId: 8921",
            "06. ENAYETUS SAKALAIN\nId: 13528",
            "07. DR.MD. SHARIFUL ISLAM\nId: 14096",
            "08. Md. Montaz Ali Sarkar\nId: 13920",
            "09. MST. NAZMA SULTANA\nId: 14528",
            "10. Afroja Akter\nId: 17315",
            "11. SHARMIN SAKILA\nId: 21816",
            "12. MST. BILKIS KHANAM\nId: 22964",
            "13. SYEDASIFAT-E-NURI\nId: 22970",
            "14. Md. Golam Kibria",
            "15. Md. Masudul Haque",
            "16. Md. Kamrul Hassan (Himu)"
    };

    String[] tea_poss ={"Professor",
            "Associate\nProfessor",
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
            "Lecturer",
            "Computer\nOperator",
            "M.L.S.S",
            "M.L.S.S"
    };

    String[] tea_pnumber = {"+8801552321867",
            "+8801712337753",
            "+8801715122278",
            "+8801711302669",
            "+8801729611855",
            "+8801712899011",
            "+8801711302917",
            "+8801711062731",
            "+8801712406792",
            "+8801827255228",
            "+8801719916938",
            "+8801717544997",
            "+8801750365541",
            "+8801721512912",
            "+8801960599731",
            "+8801721101472"
    };

    int[] tea_img ={R.drawable.bot_halima_khatun_01,
            R.drawable.bot_razaul_karim_02,
            R.drawable.bot_nurun_nesa_khatun_03,
            R.drawable.bot_al_mamun_chowdhury_04,
            R.drawable.bot_nasima_khatun_05,
            R.drawable.bot_enatetus_sakalain_06,
            R.drawable.bot_shariful_islam_07,
            R.drawable.bot_montaz_ali_sarker_08,
            R.drawable.bot_najma_sultana_09,
            R.drawable.bot_afroja_akter_10,
            R.drawable.bot_sharmin_sakila_11,
            R.drawable.bot_bilkis_khanam_12,
            R.drawable.bot_syedasifat_enur_13,
            R.drawable.bot_golam_kibria_14,
            R.drawable.bot_masudul_haque_15,
            R.drawable.bot_himu_16
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botany__department);

        botTeacherList = (ListView)findViewById(R.id.botanyTeacher_name);



        CustomAdapter_TL myAdap = new CustomAdapter_TL(Botany_Department.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        botTeacherList.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_botany__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721775257"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rcbotany@yahoo.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Botany_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Botany_Department.this);
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
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/botany"));
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
                Toast.makeText(Botany_Department.this, "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }

}
