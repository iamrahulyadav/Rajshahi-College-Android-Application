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

public class Social_Work_Department extends AppCompatActivity {

    ListView socwrkTL;

    final String d_name = "Department of Social Work";

    final String bh = "Department of Social Work was introduced in 1972 with B.S.S (Pass) course. The founder chairman was Professor Mrs. Ayesha Khatun, " +
            "who was also the principal of Noagoan Govt. College in 2002. Higher Secondary course was introduced in 1988. With the demand of time M.S.S " +
            "course was introduced in 1996 here under the National University. The 4-year B.S.S (Hons.) course was started in 2006. The number of students " +
            "is about 2500. Now 12 talented and devoted teachers are working in this department.<br></br>" +

            "Social Work is a professional and academic discipline that seeks to improve the quality of life and wellbeing of an individual, group, or " +
            "community by intervening through research, policy, practice and teaching on behalf of those afflicted with poverty or any social injustices " +
            "and violations of their human rights. Social Work, as an interdisciplinary field, includes theories from economics, education, sociology, " +
            "medicine, philosophy, politics, psychology etc.<br></br>" +

            "Social Workers help people to overcome their psycho-social problems and make their lives better. Social Work department is committed to " +
            "change its students in skilled Social Workers and human resources to face the challenges of 21st century of the world.";

    String[] tea_nam ={"01. DR.ZUBAIDA AYESHA SIDDIKA\nId: 4378",
            "02. KAMRUN NAHAR\nId: 006196",
            "03. ABDULLAH AL MAHAMUD\nId: 6124",
            "04. MD. ASHRAFUL ISLAM\nId: 3952",
            "05. MD. MONIRUL ISLAM\nId: 4671",
            "06. MD. SANAWALLAH\nId: 13228",
            "07. MD. ISLAM UDDIN\nId: 12744",
            "08. DR. MD. ABDUR RAHAMAN\nId: 15172",
            "09. MD. NAZMUL HAQUE\nId: 21793",
            "10. NANDITA CHAKRABORTY\nId: 22432",
            "11. MD. ROSTAM ALI\nId: 23564",
            "12. MD. MONIRUL ISLAM",
            "13. Md. Abdur Rahim Bablu",
            "14. Md. Aftab Uddin"
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
            "Peon",
            "Peon"
    };

    String[] tea_pnumber ={"+8801711301417",
            "+8801726927533",
            "+8801715850009",
            "+8801714217909",
            "+8801712661443",
            "+8801716034288",
            "+8801716472548",
            "+8801712147905",
            "+8801723580411",
            "+8801724339711",
            "+8801710649819",
            "+8801756663957",
            "+8801913278151",
            "+8801745297277"
    };


    int[] tea_img ={R.drawable.sow_zubaida_ayesha_siddika_01,
            R.drawable.sow_kamrun_nahar_02,
            R.drawable.sow_abdullah_al_mahamud_03,
            R.drawable.sow_ashraful_islam_04,
            R.drawable.sow_monirul_islam_05,
            R.drawable.sow_sanawallah_06,
            R.drawable.sow_islam_uddin_07,
            R.drawable.sow_abdur_rahman_08,
            R.drawable.sow_nazmul_haque_09,
            R.drawable.sow_nandita_chakraborty_10,
            R.drawable.sow_rostam_ali_11,
            R.drawable.sow_monirul_islam_12,
            R.drawable.sow_abdur_rahim_bablu_13,
            R.drawable.sow_aftab_uddin_14
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social__work__department);

        socwrkTL = (ListView)findViewById(R.id.socwrkTeacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Social_Work_Department.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        socwrkTL.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_social__work__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+880721774353"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"rcsw2101@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Social_Work_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Social_Work_Department.this);
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
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/socialwork"));
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
                Toast.makeText(Social_Work_Department.this, "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}
