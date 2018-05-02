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

public class Islamic_History_and_Culture extends AppCompatActivity {

    ListView ihacTeacherList;

    final String d_name = "Islamic History And Culture";
    final String bh = "The renowned and famous Rajshahi College was established in 1873. Although the Islamic History & Culture Department was not opened initially, " +
            "The eminent Ex. Principal of Rajshahi College, Professor Shams-Ul-Haque frist established the Department of Islamic History & Culture in 1955." +
            "<br></br>" +

            "At that time departmental Head was Mr. Sayed Azizur Rahman Hasemi. Since then it has been marching on with glorious result and producing famous " +
            "students who have shown their talent in their respective working Places.<br></br>" +

            "At Present, Professor Zillur Rahman, Head of The Department along with 11 other teachers (3 Associate Professors, 4 Assistant Professors and 4 Lecturers) " +
            "are working together to make the department more advanced and took forward to provide the country with brilliant students who will prove their worth.";

    String[] tea_nam ={"01. NARGIS ZAHAN\nId: 4792",
            "02. DR. YEASMIN AKTER SARMIN\nId: 10492",
            "03. MONZURA KHANAM\nId: 5653",
            "04. MD. ABDUL MATIN\nId: 7959",
            "05. MD. MOSLEM UDDIN MONDOL\nId: 5038",
            "06. DR. ABU NOMAN MD. ASADULLAH\nId: 14176",
            "07. SHOHELA PARVIN\nId: 13667",
            "08. AKIKUN NAHER\nId: 14601",
            "09. MD. MANIK HOSSEN\nId: 21888",
            "10. TOFAEL AHMMED\nId: 22759",
            "11. MD. OMAR FARUQUE",
            "12. MD. HANIF MIA",
            "13. MD. ASAD ALI"
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
            "Office Assist",
            "Computer\nOperator",
            "M.L.S.S"
    };

    String[] tea_pnumber = {"+8801917129042",
            "+8801743921806",
            "+8801715545300",
            "+8801711065341",
            "+8801718784621",
            "+8801714258135",
            "+8801923957071",
            "+8801729438471",
            "+8801712162033",
            "+8801717821901",
            "+8801736899890",
            "+8801764008156",
            "+8801758135790"
    };

    int[] tea_img ={R.drawable.ihac_01,
            R.drawable.ihac_02,
            R.drawable.ihac_03,
            R.drawable.ihac_04,
            R.drawable.ihac_05,
            R.drawable.ihac_06,
            R.drawable.ihac_07,
            R.drawable.ihac_08,
            R.drawable.ihac_09,
            R.drawable.ihac_10,
            R.drawable.ihac_11,
            R.drawable.ihac_12,
            R.drawable.ihac_13
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islamic__history_and__culture);

        ihacTeacherList = (ListView) findViewById(R.id.ishacTeacher_name);

        CustomAdapter_TL myAdpt = new CustomAdapter_TL(Islamic_History_and_Culture.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        ihacTeacherList.setAdapter(myAdpt);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_islamic__history_and__culture, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721774299"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rc1873ishis@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Islamic_History_and_Culture.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Islamic_History_and_Culture.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit rc.edu.bd/");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/"));
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
