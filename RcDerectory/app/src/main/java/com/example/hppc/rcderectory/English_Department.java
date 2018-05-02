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

public class English_Department extends AppCompatActivity {

    ListView engTeacherList;

    final String d_name = "English Department";
    final String bh = "The department of English in Rajshahi College holds a different prestige and honour that any other institute would cherish to achieve. " +
            "It has been functioning as an independent department till 1878, only a few years after the foundation of Rajshahi College itself in 1873.<br></br>" +

            "Renowned scholars like Professor Dr. Shree Kumar Banarjee, Professor Dr. Md. Sadar Uddin Ahmed, Professor Md. Amanullah, Professor A. S. M Muarrof, " +
            "and Professor Abu Daud Hasan served in this department. The department consists of 13 dedicated teachers, 3 employees. <br></br>" +

            "More than 1500 regular students study in BA (Honours), Masters (Part-1) and Masters (Final) classes in this department. Teachers have also been " +
            "conducting lessons in HSC and BA (Pass) classes very efficiently in Communicative Approach and using modern equipments like multimedia projector. " +
            "Having got their degree from this institution, numerous scholarly students have proved their worth as they perform in diverse fields in nation " +
            "building.";

    String[] tea_nam ={"01. PIJUSH KANTI FAUZDAR\nId: 4717",
            "02. MOHAMMAD NAFIZ\nId: 3443",
            "03. MD. HABIBUR RAHMAN\nId: 9072",
            "04. MD. NOUROZUR RAHAMAN\nId: 9407",
            "05. GULSHAN ARA\nId: 12394",
            "06. DR. SAMYASATHEE BHOWMIK\nId: 12642",
            "07. DEVAYANI CHAKRABORTY\nId: 13086",
            "08. MD. JASIM UDDIN\nId: 10952",
            "09. MD. ABDUL MALEK\nId: 15412",
            "10. KRISNA KABERY\nId: 14151",
            "11. MD. AMIR SADAT\nId: 15866",
            "12.ZANNATUL FERDOUS\nId: 15849",
            "13. DEBASHAS KUMAR SHIL\nId: 18552",
            "14. MD. RASHED BIN MONSUR\nId: 23853",
            "15. MD. ATIQUR RAHMAN\nId: 23710",
            "16. MD. ATIQUR RAHMAN\nId: 024496"
    };

    String[] tea_poss ={"Professor",
            "Associate\nProfessor",
            "Associate\nProfessor",
            "Associate\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Lecturer",
            "Lecturer",
            "Lecturer",
            "Lecturer"
    };

    String[] tea_pnumber = {"+8801712853125",
            "+8801712009474",
            "+8801712130462",
            "+880175376235",
            "+8801750096703",
            "+8801713201635",
            "+8801712219894",
            "+8801711901313",
            "+8801711289983",
            "+8801719571000",
            "+8801715581179",
            "+8801715673794",
            "+8801942415530",
            "+8801717544873",
            "+8801711451395",
            "+8801716472425"
    };

    int[] tea_img ={R.drawable.eng_pijush_kanti_fauzdar_01,
            R.drawable.eng_mohammed_nafiz_02,
            R.drawable.eng_habibur_rahman_03,
            R.drawable.eng_nourozur_rahman_04,
            R.drawable.eng_gulshan_ara_05,
            R.drawable.eng_samyasathee_bhowmik_06,
            R.drawable.eng_devayani_chakraborty_07,
            R.drawable.eng_jasim_uddin_08,
            R.drawable.eng_abdul_malek_09,
            R.drawable.eng_krisna_kabery_10,
            R.drawable.eng_amir_sadat_11,
            R.drawable.eng_zannatul_ferdous_12,
            R.drawable.eng_debashas_kumar_shil_13,
            R.drawable.eng_rashed_bin_monsur_14,
            R.drawable.eng_atiqur_rahman_15,
            R.drawable.eng_samson_hasdak_16
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english__department);

        engTeacherList = (ListView)findViewById(R.id.englishTeacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(English_Department.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        engTeacherList.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_english__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721774206"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"engdrc@yahoo.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(English_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(English_Department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/english");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/english"));
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
                Toast.makeText(English_Department.this, "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}
