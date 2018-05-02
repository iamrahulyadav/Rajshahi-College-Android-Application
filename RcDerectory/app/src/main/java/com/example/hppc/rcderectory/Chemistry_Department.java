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

public class Chemistry_Department extends AppCompatActivity {

    ListView cheTeacherList;

    final  String d_name = "Chemistry Department";

    final String bh ="Chemistry, a branch of physical science, is the study of the composition, properties and change of matter. French Chemist, Antoni Lavoesie is the " +
            "father of modern Chemistry. We have got some world famous Chemists who laid the foundation of Chemistry in our country and made the subject attractive. In this " +
            "connection we remember with respect Dr. Kudrat-E-Khuda, Prof. Mokarram Hossain Khundoker, Prof. Ali Nawab, Prof. S. Z. Haider, Prof. Mofiz Uddin Ahmed, Dr. " +
            "Fazlul Halim Chowdhary, Dr. Mesbahuddin Ahmed, Dr. Syed Safiullah and Prof. Abu Saleh.<br></br>"+

            "The century old Rajshahi College founded in 1873 has been playing an active role in the development of educational, social and political culture of the " +
            "people of this subcontinent. Chemistry Department is its pride. Chemistry is one of the important discipline of this institution where students are " +
            "awaraded graduation and post graduation degrees. Moreover, Chemistry is a compulsory subject for the students of science group in the higher " +
            "secondary class.<br></br>"+

            "The People’s Republic of Bangla-desh opened Honors courses in several subjects in this college in 1972. Chemistry is one of them. Bachelor of Honors degree " +
            "in Chemistry is being awarded since 1957 and Master of Science since 1993. National University affiliated the Graduation and Masters Program from the " +
            "session 1992-1993.<br></br>"+

            "Chemistry Department is situated in a unique position in Rajshahi College campus. The three storied department building consists of five class rooms " +
            "including two gallery rooms equipped with modern electronic equipments (including audio-visual system supported by multimedia projector), four " +
            "Practical/ Research Laborateries with sufficient number of scientific instruments, glassware and chemicals. To avoid hazard of load shedding the " +
            "department is equipped with heavy duty generator and Instant Power Supply (IPS). Moreover, about two thousand books are available in Seminar Library " +
            "of the department.<br></br>"+

            "We have a spacious and furnished teacher’s common room with essential amenities. There is also a well furnished guest room for guest teachers " +
            "and external examiners.<br></br>"+

            "Now Chemistry Department enrolls about 750 students under graduation and post graduation program every year.<br></br>"+

            "Students passing out from Chemistry Department are working with reputation in many fields. Besides glorious academic attainments the members of " +
            "the teaching staff and the students of this Department regularly take part in co-curricular activities and they try to give a good account of " +
            "themselves.<br></br>"+

            "At present 14 teachers, 4 MLSSs, 1 computer operator and 1 mechanic are serving this department with full enthusiasm. They all are sincere in " +
            "their respective fields. The present vice principal Prof. Md. Habibur Rahman served this Department from 03.06.2001 to 23.02.2009. The first Head " +
            "to serve this department was Dr. Md. Kiam Uddin. At first Babu Khirod Mohon Sen joined as a teacher of Chemistry in 1923 and served till 1934. " +
            "On the other hand, the first Muslim teacher of this Department, Mr. Md. Wahed Box served from 1944-1953. We always acknowledge their contribution. " +
            "The existing Departmental Head, Prof. Dr. Md. Abul Hayat has been serving since 27.03.10. He is our 20th Departmental Head. Under the dynamic " +
            "leadership of the present Head, the Department is marching towards glory. Besides glorious academic attainments the members of the teaching " +
            "staff and the students of this Department of regularly take part in co-curricular activities and they try to give a good account of themselves.<br></br>"+

            "At present in our Department 14 teachers, 4 MLSS 1 Computer Operator, 1 mechanic work team spirit as if all are family members. They are all sincere in " +
            "there respective fields. In this department, first Departmental Chairman was Dr. Md. Kiam Uddin Before in 1962. At first Babu Khirod Mohon Sen joined " +
            "as teacher of chemistry in 19.12.1923 and served till 18.07.1934. In the other hand first Muslim teacher in this Department was Mr. Md. Wahed Box " +
            "from 1944-1953. We remember them.<br></br>"+

            "Our present Departmental Chairman is Prof. Dr. Md. Abul Hayat is acting form 27.03.2010. He is our 20th Departmental Chairman. Under the dynamic " +
            "leadership of present Departmental Chairman, our Depart5ment is enriched its name and fame.<br></br>"+

            "Besides glorious academic attainments the members of the teaching staff and the students of this department regularly take part in co-curricular " +
            "activities and they try to give a good account of themselves.<br></br>"+

            "Let us all hope that the department of chemistry of Rajshahi College will continue to produce efficient and competent good citizens for our beloved country.";

    String[] tea_nam = {"01. Md. Mainul Islam\nId: 4887",
            "02. Md. Hossen Ali\nId: 005856",
            "03. Dr. Rezina Akhter Banu\nId: 004372",
            "04. Md Ashfaqur Rahman\nId: 9047",
            "05. Md. Jahangir Ali\nId: 12653",
            "06. Dr. Brazendranath Sarkar\nId: 12601",
            "07. Md. Mizanur Rahman\nId: 17875",
            "08. Md. Abdus Samad\nId: 15811",
            "09. Md. Abu Sayed\nId: 18542",
            "10. Md. Harunur Rashid\nId: 022226",
            "11. Md. Shakilur Zaman Shakil\nId: 025970",
            "12. Md. Shajhan Ali",
            "13. Md. Abdul Malak",
            "14. Nur Mohammad Zianur Islam",
            "15. Md. Jafor Ikbal (Liton)",
            "16. Md. Rimon Ali",
            "17. Md. Ashik Ikbal (Tutul)"

    };

    String[] tea_poss ={"Professor",
            "Associate\nProfessor",
            "Associate\nProfessor",
            "Associate\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Lecturer",
            "Lecturer",
            "Lecturer",
            "Lecturer",
            "M.L.S.S",
            "Temporary\nemployee",
            "Computer\nOperator",
            "Temporary\nemployee",
            "Temporary\nemployee",
            "Temporary\nemployee"
    };

    String[] tea_pnumber ={"+8801736576802",
            "+8801716490633",
            "+8801911137641",
            "+8801715170742",
            "+8801716076395",
            "+8801711245704",
            "+8801716099663",
            "+8801716181129",
            "+8801916449833",
            "+8801712769693",
            "+8801722307202",
            "+8801981984088",
            "+8801718022571",
            "+8801710414828",
            "+8801725874517",
            "+8801724026746",
            "+8801727663617"
    };
    int[] tea_img = {R.drawable.chy_mainul_islam_01,
            R.drawable.chy_hossen_ali_02,
            R.drawable.chy_rezina_akter_banu_03,
            R.drawable.chy_ashfaqur_rahman_04,
            R.drawable.chy_jahangir_ali_05,
            R.drawable.chy_brazendranat_sarker_06,
            R.drawable.chy_mizanur_rahman_07,
            R.drawable.chy_abdus_salam_08,
            R.drawable.chy_abu_sayed_09,
            R.drawable.chy_harunur_rashid_10,
            R.drawable.chy_shakilur_zaman_11,
            R.drawable.chy_shajhanali_12,
            R.drawable.chy_abdul_malak_13,
            R.drawable.chy_mohammad_zianur_ali_14,
            R.drawable.chy_jafor_ikbal_15,
            R.drawable.chy_remon_ali_16,
            R.drawable.chy_ashik_ikbal_17

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry__department);

        cheTeacherList = (ListView)findViewById(R.id.chemistryTeacher_name);


        CustomAdapter_TL myAdap = new CustomAdapter_TL(Chemistry_Department.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        cheTeacherList.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chemistry__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721775233"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rc1873chem@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Chemistry_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Chemistry_Department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/chemistry");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/chemistry"));
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
                Toast.makeText(Chemistry_Department.this, "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}
