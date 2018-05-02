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

public class Political_Science_Department extends AppCompatActivity {

    ListView polisTeachersName;

    final String d_name = "Political Science Department";
    final String bh = "In 1916 the study of Political Science was initiated in Rajshahi College as Civics in the Intermediate of Arts (I.A.) class" +
            "        under the Department of Civics and Economics. Within the same Department, in 1950, Political Science was incorporated as a" +
            "        distinct course for the Bachelor of Arts (B.A.) classes. The Department of Politics was instigated in 1953. Until 1956, parallel" +
            "        to the Department of Civics and Economics, the Department of Politics had been existed. In 1957 the study of Civics left to the" +
            "        Department of Politics. From now the Department of Politics was renamed as the Department of Civics and Political Science." +
            "        In 1981, it was retitled as the Department of Political Science.<br></br>" +

            "        In 1972, the students of Rajshahi College organized a hunger strike demanding affiliation to Bachelor of Honours Courses in Political" +
            "        Science by Rajshahi University authority. Owing to direct intermediation by the then Honourable Relief and Rehabilitation Minister" +
            "        A. H. M Quamruzzaman, the Rajshahi University authority accepted the demand and the strike was called off. However, up till 1994 no" +
            "        Masters Courses were conducted by the Department as the students having Honours degree had been admitted into Masters Classes in the" +
            "        Rajshahi University.<br></br>" +

            "        In 1994, for the first time the Department introduced Masters level courses under affiliation with the National University. In 1996" +
            "        the department ended its Higher Secondary Courses (HSC) with closure of the courses by the college. Nevertheless, due to dearth in" +
            "        quality institutions and growing demand for higher secondary level education in Rajshahi the HSC courses have been reinstated in 2010." +
            "        With fresh enthusiasm by the students and all walks of people of Rajshahi, soon after the inclusion of HSC courses, Rajshahi College" +
            "        has regained its position as one of the best higher secondary education conferring institutions of this region. Since the reinsertion" +
            "        of HSC courses Civics has been taught as one of the core subjects for the students of Humanities group.<br></br>";

    String[] tea_nam = {"01. Ayesha Siddiqua Banun\nDepartment Head\nId: 004522",
            "02. Dr. Khandaker Muzahidul Haq\nId: 2013",
            "03. Shampa Rezina Shirin\nId: 4643",
            "04. Md. Tayazul Islam\nId: 5943",
            "05. Dr. Md. Lutfor Rahman\nId: 12471",
            "06. Mst. Jannatun Nesa\nId: 17032",
            "07. Rifat Ferdousi\nId: 15978",
            "08. Md. Abdus Salam\nId: 17383",
            "09. Md. Babul Akter\nId: 21677",
            "10. Md. Zahangir Alam\nId: 22120",
            "11. Zohura Kanij\nId: 22913",
            "12. Md. Rubyat-E-Afroz\nId: 24720",
            "13. Md. Rezaul Islam",
            "14. Md. Milon Ali",
            "15. Md. Nazrul Islam",
            "16. Md. Mahfuz"
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
            "Office\nAssist",
            "Computer\nOperator",
            "Peon",
            "Peon"

    };

    String[] tea_pnumber = {"+8801714781896",
            "+8801712561211",
            "+8801712312600",
            "+8801727752525",
            "+8801712734157",
            "+8801718030899",
            "+8801914327355",
            "+8801818264741",
            "+8801740599052",
            "+8801717157523",
            "+8801745871025",
            "+8801714503668",
            "+8801722832615",
            "+8801713733591",
            "+8801710649740",
            "+8801882731351"
    };

    int[] tea_img = {R.drawable.polis_ayesha_siddiqua_banu_01,
            R.drawable.polis_khandaker_muzahidul_haq_02,
            R.drawable.polis_shampa_rezina_shirin_03,
            R.drawable.polis_tayazul_islam_04,
            R.drawable.polis_lutfor_rahman_05,
            R.drawable.polis_jannatun_nesa_06,
            R.drawable.polis_rifat_ferdousi_07,
            R.drawable.polis_abdus_salam_08,
            R.drawable.polis_babul_akter_09,
            R.drawable.polis_zahangir_alam_10,
            R.drawable.polis_zohura_kanij_11,
            R.drawable.polis_rubyat_afroz_12,
            R.drawable.polis_rezaul_islam_13,
            R.drawable.polis_milon_ali_14,
            R.drawable.polis_nazrul_islam_15,
            R.drawable.polis_mahfuz_16
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_political__science__department);

        polisTeachersName = (ListView) findViewById(R.id.polisTeacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Political_Science_Department.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        polisTeachersName.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_political__science__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+880721774316"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"polscience_rc@yahoo.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Political_Science_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Political_Science_Department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/polscience");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/polscience/"));
                    try {
                        startActivity(browserButton);
                    } catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(getApplicationContext(), "Something wrong!.", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    //no connection
                    Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection", Toast.LENGTH_LONG);
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

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
