package com.example.hppc.rcderectory;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Economics_Department extends AppCompatActivity {

    ListView econoTeachersName;

    final String d_name = "Economics Department";

    final String bh = "The Department of Economics has always been one of the pioneer departments in the history of Rajshahi College. The history" +
            "        of this department commenced in 1878 when an F.A. (undergraduate degree) programme in economics opened under the name of Economics" +
            "        and Political Philosophy. Thereafter, in the early 1913 economics was initiated as a subject in B.A. degree (pass) course under" +
            "        affiliation of the then Calcutta University.<br></br>" +

            "        It is notable that an eminent economist Mr. Kausiki Nath Bhattacharyya served the college during that tenure. In 1936 Department" +
            "        of Economics came into being as a full-fledged Honours Course under the same affiliation. After separation of Indo-Pak Subcontinent" +
            "        in 1947 it found its new affiliation under Dhaka University. Again in 1953, when Rajshahi University started its activities, the" +
            "        department was being regulated by the University of Rajshahi. Master of Social Science (MSS) in Economics was started under" +
            "        affiliation of National University of Bangladesh in 1993. At present the Department has 13 Teachers specialized in a range of" +
            "        areas of economic interests. About 1600 students are studying in Honours and Masters Courses in different stages. A good number" +
            "        of students study Economics at intermediate level.<br></br>" +

            "        The students of the Department have the privilege to use both the central library and the Seminar library of the Department. Classes" +
            "        of this department are well-equipped with multi-media facilities. All the computers of the Department have got broad-band internet" +
            "        connections. The Department organizes seminars and workshops for the students. In addition to all of these facilities, students of" +
            "        this department have privileged to use ICT lab facilities managed by ICT Department of this college.<br></br>" +

            "        Honours and Masters Result of this department has been quite satisfactory since inception of the subject. Department boast a legacy of a" +
            "        outstanding scholarly activities of the teachers in various extracurricular activities like music, drama, recitation, excursion, debate," +
            "        seminar sports etc. A good number of students after acquiring brilliant result at Honours and Masters level from this department are temped" +
            "        in various responsible posts at different capacities in different government and non-government organizations both in national and transnational" +
            "        level.";

    String[] tea_nam = {"01. DR. WASIM MD. MAZBAHUL HAQUE\nId: 5206",
            "02. MD. ABDUL KHALEQUE\nId: 4544",
            "03. MOMOTA HENA\nId: 5811",
            "04. MD. HUMAYUN REZA\nId: 9122",
            "05. MD. BADSHA HOSAIN\nId: 12061",
            "06. DR. NAHIDA AFROZ\nId: 14181",
            "07. MD. MIZANUL ISLAM\nId: 16792",
            "08. MD. MAHBUBUL ALAM\nId: 16250",
            "09. MD. SAJEDUR RAHMAN\nId: 22227",
            "10. MD. ALHAJ UDDIN\nId: 23659",
            "11. MST. SURAIYA SULTANA\nId: 25662",
            "12. MD. ALI AHSAN\nId: 25657",
            "13. FEROSE UDDIN AHMED",
            "14. MD. SOHEL RANA",
            "15. SHARIF"
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

    String[] tea_pnumber = {"+8801711392137",
            "+8801718542852",
            "+8801716948787",
            "+8801711789190",
            "+8801718993269",
            "+8801716077478",
            "+8801711939623",
            "+8801712669455",
            "+8801710437440",
            "+8801798762917",
            "+8801929425988",
            "+8801775231064",
            "+8801716731868",
            "+8801717-487691",
            "+8801718-507201"
    };

    int[] tea_img = {R.drawable.eco_wasim_mazbahul_haque_01,
            R.drawable.eco_abdul_khaleque_02,
            R.drawable.eco_momota_hena_03,
            R.drawable.eco_humayun_reza_04,
            R.drawable.eco_badsha_hosain_05,
            R.drawable.eco_nahida_afroz_06,
            R.drawable.eco_mizanul_islam_07,
            R.drawable.eco_mahbubul_alam_08,
            R.drawable.eco_sajedur_rahman_09,
            R.drawable.eco_alhaj_uddin_10,
            R.drawable.eco_suraiya_sultana_11,
            R.drawable.eco_ali_ahsan_12,
            R.drawable.eco_ferose_uddin_ahmed_13,
            R.drawable.eco_sohel_rana_14,
            R.drawable.eco_sharif_15,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economics__department);

        econoTeachersName = (ListView) findViewById(R.id.economicTeacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Economics_Department.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        econoTeachersName.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_economics__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+880721772523"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"Economics.rajshahicollegebd@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Economics_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Economics_Department.this);
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
                Toast.makeText(Economics_Department.this, "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}
