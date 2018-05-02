package com.example.hppc.rcderectory;

import android.app.Activity;
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

// Previous AppCompatActivity
public class Mathematics_Department extends AppCompatActivity {

    ListView tealist;

    final String d_name = "Mathematics Department";

    final String bh = "The department of Mathematics started its journey in 1878 short after establishment of the college with only two teachers. " +
            "Honours and masters courses in Mathematics were introduced in1881 and 1893 respectively.<br></br>"+

            "In the third decade of the 20th century, the number of teaching staff was four among which two posts for professors and two posts " +
            "for lectures. This teaching staff pattern was unchanged until 1980. In 1981, the number of teaching staff became seven and twelve in 1997. " +
            "The number of students was 40 in 1972 and at present it raises to 180.<br></br>" +

            "The department is running with three class rooms, two modern computer laboratories, one seminar cum library room, one teacher's room and a " +
            "room for the chairman. There are 5000 books in seminar library. At present, nearly about 1500 students are studying in this department.";

    String[] tea_nam = {"01. Md. Serajul Islam\nId: 5899",
            "02. Md. Shahidul Alam\nId: ",
            "03. Md. Kafilar Rahman\nId: 4361",
            "04. Md. Nurul Islam\nId: 6738",
            "05. Dr. Akhtara Banu\nId: 4465",
            "06. Dr. Md. Abdul AzizId: 12509",
            "07. Md. Asaduzzaman\nId: 14183",
            "08. Md. Mizanur Rahman\nId: 14058",
            "09. Md. Sharwar Jahan\nId: 13458",
            "10. Shaika Horkil\nId: 14881",
            "11. Nadira Nazneen\nId: 15968",
            "12. Mst. Lailatul Kadri\nId: 18026",
            "13. Mst. Mafruha Mustari\nId: 18066",
            "14. MD. RAKEBUL AZAD",
            "15. AME AKTHAR",
            "16. MD. ALFAZ UDDIN",
            "17. MD. SHAKIL AHMED"
    };

    String[] tea_poss = {"Professor",
            "Associate\nProfessor",
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
            "Lecturer",
            "Computer\nOperator",
            "Library\nAssistant",
            "M.L.S.S",
            "M.L.S.S"
    };

    String[] tea_pnumber = {"+8801913648545",
            "+8801713247399",
            "+8801716386574",
            "+8801721755339",
            "+8801716726133",
            "+8801716408598",
            "+8801718270081",
            "+8801815572384",
            "+8801725016097",
            "+8801717172302",
            "+8801724939888",
            "+8801735675402",
            "+8801725905474",
            "+8801911031911",
            "+8801773460291",
            "+8801726215449",
            "+8801777242758"
    };

    int[] tea_img = {R.drawable.math_01,
            R.drawable.math_02,
            R.drawable.math_03,
            R.drawable.math_04,
            R.drawable.math_05,
            R.drawable.math_06,
            R.drawable.math_07,
            R.drawable.math_08,
            R.drawable.math_09,
            R.drawable.math_10,
            R.drawable.math_11,
            R.drawable.math_12,
            R.drawable.math_13,
            R.drawable.math_14,
            R.drawable.math_15,
            R.drawable.math_16,
            R.drawable.math_17
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematics__depertment);

        tealist = (ListView) findViewById(R.id.show_Mteacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Mathematics_Department.this,tea_nam,tea_pnumber,tea_poss,tea_img);
        tealist.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mathematics__depertment, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721775248"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rc1873math@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Mathematics_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Mathematics_Department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/mathematics");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/mathematics"));
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
                Toast.makeText(Mathematics_Department.this, "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}