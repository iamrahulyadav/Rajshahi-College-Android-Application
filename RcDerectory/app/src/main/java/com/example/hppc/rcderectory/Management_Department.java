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

public class Management_Department extends AppCompatActivity {

    ListView mangTlist;

    final String d_name = "Management Department";
    final String bh = "Modern management concept in contemporary world does not only refer to fix the processes, also deal with the people, the diverse workplace, " +
            "changing economic and social environment, increasing application of technology in business, to sustain and remain competitive in the global marketplace. " +
            "Management started with the concept of “to manage resources”, that can be traced back to the Babylonian king, Hammurabi. Ancient management back then " +
            "included a code of 282 laws, related to business dealings, personal behavior, interpersonal relations, wages, punishments and other social " +
            "matters.<br></br>"+

            "Later on the evolution of management concept progressed by solving the challenges of converting resources into result. The modern business world is " +
            "still being faced the challenges to ensure efficient and effective use of the all resources (from financial to most important one human resource). " +
            "The old paradigm of management regards to profit maximization and command and control hierarchy have failed to keep companies remain competitive and " +
            "also failed to meet the emerging contemporary social and economic needs.<br></br>"+

            "Therefore, the new paradigm of management emerged, based on, ethics, values, corporate responsibility, and sustainability and employee empowerment. " +
            "According to new paradigm, management has to serve a noble purpose, create value for society, fulfill the higher needs of people and at the same time " +
            "make money.<br></br>"+

            "Companies are now need an integrated management tool to work in diverse workplace, collaborative organizational structure and also in the dominant work " +
            "of technology. Companies are looking for a winning combination of people, technology and profit along with keeping social " +
            "responsibility.<br></br>"+

            "In result, the growing pressure in business environment has also increased the importance of reforming in management education and forcing the educational " +
            "institutions to develop their curriculum, focus on action learning and practical problem having effective and also motivating to undertake more research " +
            "work to find the best way in dealing the turmoil environment of business.<br></br>"+

            "In Bangladesh business education started with University of Dhaka in 1921. During that period of time commerce education meant two years Bachelor of " +
            "Commerce degree. Later on the two years degree failed to enhance business know how and skill and in result three years honours program launched in " +
            "mid- fifties. Management as a subject introduced in 1957. At present, the expanding horizon of business world and particularly increasing business " +
            "activities in Bangladesh in the global market is forcing the higher education to move from three years to four years honours program. Furthermore, " +
            "course contents have been modernized along and teachers have trained to enhance quality of management education. Along with the major universities, " +
            "government colleges affiliated with National University of Bangladesh have also been providing quality management education in Bangladesh and Rajshahi " +
            "College is one of them.<br></br>"+

            "In 1952, Rajshahi College, launched commerce as a subject, with a view to spread business knowledge and develop a skill community. Professor Ajmot Ullah " +
            "and Professor Azgor Ali, joined as the first ever teacher of commerce. Later in 1954. Rajshahi College offered Bachelor in Commerce degree to enhance the " +
            "importance of business education in the community.<br></br>"+

            "Many renowned teachers had contributed to develop the commerce department by their merit, skill and efficient leadership, Professor Satyaban Das, Professor" +
            " Nazir Uddin Ahmed, Professor Shafayat Ahmed, Professor Abdur Rahman, Professor Gazi Abdus Salam, Professor Golam Mortuza, Professor Shofiqul Islam, " +
            "Professor Abdul Mannan, Professor Mohammad Shamsuddin Khan, Professor Md. Abu Taleb Sarker were among them. Particularly, Professor Satyaban Das was " +
            "the major contributor in developing commerce department. He first took an initiative to inaugurate a library and a museum to support and modernize the" +
            " business education. Afterward, Professor Abdur Rahman, should be mentioned for keep continuing the improvement of commerce department. Professor " +
            "Abdur Rahman led the department for a long time and was the first chairman of management department.<br></br>"+

            "In 1973, Rajshahi University launched two business departments: Accounting and Management. During that period of time Rajshahi Government College was " +
            "affiliated with Rajshahi University and also launched two subjects: accounting and management. After Professor Abdur Rahman, Professor Shamsuddin Khan " +
            "was the second most leading chairman of management department.<br></br>"+

            "The management department of Rajshahi College has significant contribution in enhancing business education and develops skilled community in the " +
            "Northern part of Bangladesh. Around two thousand students are now studying in four-year integrated honours program and also with one year Masters " +
            "Program in management. At present, the chairman of the department is Professor Subidh Kumar Maitra who works hard to make the department effective " +
            "by his efficient leadership. The academic result of the department is satisfactory and the outcome is achieving remarkable success in the job market. " +
            "Students are not only doing their best in academic result but also performing well in extra curriculum activities as well. The department has been " +
            "moving towards excellence with total twelve teacher’s hard work, commitment, experiences and leadership.";


    String[] tea_nam = {"01. MD. ABDUL KHALEQUE SARKER\nId: 4805",
            "02. DR. BIPLAB KUMAR MOZUMDER\nId: 10661",
            "03. HASNA ARA BEGUM\nId: 004518",
            "04. MD. GOLAM FERDOUS\nId:",
            "05. KAZI RASHED KARIM\nId: 17602",
            "06. AFROZA BEGUM\nId: 14859",
            "07. FARHANA ALAM\nId: 14185",
            "08. MD. ABDUR RAZZAQUE\nId: 11059",
            "09. PRANAB MUKHERJEE\nId: 18103",
            "10. MD. ANIQUL ISLAM\nId: 18266",
            "11. MD. ABDULLAH AL MAMUN\nId: 23816",
            "12. MD. SOFIQUL ISLAM",
            "13. MD. SANIUL KABIR",
            "14. MD. ABUL KALAM AZAD"
    };

    String[] tea_poss = {"Associate\nProfessor",
            "Associate\nProfessor",
            "Associate\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Lecturer",
            "Lecturer",
            "Lecturer",
            "Computer\nOperator",
            "Seminar\nAssist",
            "M.L.S.S",
    };

    String[] tea_pnumber = {"+8801712181467",
            "+8801715170768",
            "+8801552350614",
            "+8801779198730",
            "+8801556514131",
            "+8801817508919",
            "+8801765393203",
            "+8801712166300",
            "+8801718695186",
            "+8801719402602",
            "+8801737346082",
            "+8801714568398",
            "+8801913208600",
            "+8801711062714"

    };
    int[] tea_img = {R.drawable.management_01,
            R.drawable.management_02,
            R.drawable.management_03,
            R.drawable.management_04,
            R.drawable.management_05,
            R.drawable.management_06,
            R.drawable.management_07,
            R.drawable.management_08,
            R.drawable.management_09,
            R.drawable.management_10,
            R.drawable.management_11,
            R.drawable.management_12,
            R.drawable.management_13,
            R.drawable.management_14
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management__department);

        mangTlist = (ListView) findViewById(R.id.mangTeacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Management_Department.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        mangTlist.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_management__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721771979"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rc1873man@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Management_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Management_Department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/management");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/management"));
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

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}
