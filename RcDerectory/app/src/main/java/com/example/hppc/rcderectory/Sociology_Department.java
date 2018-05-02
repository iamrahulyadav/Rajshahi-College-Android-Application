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

public class Sociology_Department extends AppCompatActivity {

    ListView soclogyTL;

    final String d_name = "Sociology Department";

    final String bh = "Sociology department is situated on the 1st floor of the third science Building at Rajshahi College in an excellent environment. " +
            "It was introduced in 1972 and acted its function in ground with BSS (Pass) and MSS (Previous) course. The founding chairman Dr. AHM Zehadul " +
            "Karim who was also the VC of Comilla University was a permanent teacher of Rajshahi University in 1974. In 1992 honours course has been " +
            "introduced here under national University and Higher Secondary Certificate course was introduced in 2010. Presently there are nine teachers " +
            "are working from 12 parts. There are almost 2000 students are studying at present.<br></br>" +

            "Over the year 1992 graduates from the this department occupied various parts in the local and national level showing their performance " +
            "and competence in both government and non-governmental organizations.";

    String[] tea_nam = {"01. DR. NAZNEEN SULTANA\nId: 10263",
            "02. DR. MD. FIROJUL ISLAM\nId: 17187",
            "03. DR. MD. ALAMGIR KABIR\nId: 13232",
            "04. DR. MD. ABDUL MALEK SARKER\nId: 16611",
            "05. MUHAMMAN JAKIR AL FARUKI\nId: 12441",
            "06. DR. MD. ROKNUZZAMAN SIDDIKY\nId: 14192",
            "07. MT. ROZINA AFROZ\nId: 23390",
            "08. NUSRAT ZERIN ANNY\nId: 24632",
            "09. MD. SADIQUL ISLAM\nId: 24617",
            "10. SULTANA JAHURA\nId: 24617",
            "11. MD. SHAHINUR ROHMAN",
            "12. MD. EHSANUL KABIR",
            "13. MD. ATAHAR ALI",
            "14. MD. AMIR KHOSRU RAJON"

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
            "Lecturer",
            "Computer\nOperator",
            "Computer\nOperator",
            "Peon"
    };

    String[] tea_pnumber ={"+8801715804256",
            "+8801716206138",
            "+8801712169852",
            "+8801712218852",
            "+8801712218852",
            "+8801777386633",
            "+8801717088990",
            "+8801718600744",
            "+8801786832929",
            "+8801755774578",
            "+8801737037356",
            "+8801861799750",
            "+8801729733997",
            "+8801781357507"
    };


    int[] tea_img = {R.drawable.slogy_nazneen_sultana_01,
            R.drawable.slogy_firojul_islam_02,
            R.drawable.slogy_alamgir_kabir_03,
            R.drawable.slogy_abdul_malek_sarker_04,
            R.drawable.slogy_muhammad_jakir_faruki_05,
            R.drawable.slogy_roknuzzaman_siddiky_06,
            R.drawable.slogy_rozina_afroz_07,
            R.drawable.slogy_nusrat_zerin_anny_08,
            R.drawable.slogy_sadiqul_islam_09,
            R.drawable.slogy_sultana_jahura_10,
            R.drawable.slogy_shahinur_rahman_11,
            R.drawable.slogy_ehsanul_kabir_12,
            R.drawable.slogy_atahar_ali_13,
            R.drawable.slogy_amir_khosru_rajon_14
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sociology__department);

        soclogyTL = (ListView) findViewById(R.id.sologyTeacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Sociology_Department.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        soclogyTL.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sociology__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+880721774327"));
        try{
            startActivity(intent);
        }
        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(),"Activity is not founded", Toast.LENGTH_SHORT).show();
        }
    }

    //2. E-mail
    public void send_mail(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rcsociology1873@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Sociology_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Sociology_Department.this);
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
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/sociology/"));
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
                Toast.makeText(Sociology_Department.this, "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}
