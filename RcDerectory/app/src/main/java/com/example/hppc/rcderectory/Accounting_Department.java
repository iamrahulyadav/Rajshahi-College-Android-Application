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

public class Accounting_Department extends AppCompatActivity {

    ListView accountTeachersName;

    final String d_name = "Accounting Department";
    final String bh = "Rajshahi College is playing a very important role in the field of higher education in Bangladesh. As a member of Rajshahi College family, " +
            "The Dept. of Accounting is playing its part properly with utmost sincerity. Rajshahi College, launched accounting as a separate department in the " +
            "year 1973. Professor Gazi Abdus Salam was the founder chairman of the department." +
            "<br></br>" +
            "Three year Honours course was introduced with 25 students under Rajshahi University in that year. Masters course was also introduced under National " +
            "University from the academic session of 1994-1995. Now, around 2000 students are enrolled in this department in different courses. The following courses " +
            "are in operation at the moment in this department:"+
            "<ul>"+
                "<li>4 year Honours course (BBA)</li>"+
                "<li>Masters Preliminary course (MBS-Prel.)</li>"+
                "<li>Masters Final (MBS-Final)</li>"+
            "</ul>";

    String[] tea_nam = {"01. ASHIS KUMAR SANYAL\nId: 4688",
            "02. RIDDHA KHONDKAR\nId: 4523",
            "03.SHAMIM ARA JESMIN\nId: 4645",
            "04. MD. MAHBUBUR RAHMAN SELIM\nId: 4384",
            "05. ISMOT ARA BEGUM\nId: ",
            "06. MD. ABUL HASNAT\nId: 9103",
            "07. ABU MD. FASHIUR\nId:12764",
            "08. MD. MOMOTAZ UDDIN MOLLA\nId: 15378",
            "09. A.K.M SYEDUR RAHMAN KHAN\nId: 18168",
            "10. MD. SOHEL RANA\nId: 21891",
            "11. MOST. SABMILA KHATUN\nId: 25044",
            "12. MOST. LIPE KHATUN\nId: ",
            "13. MD. BADIUZZAMAN NAYAN",
            "14. MD. MATIUR RAHMAN",
            "15. MD. PAIREUL ISLAM"
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
            "M.L.S.S",
            "M.L.S.S"
    };

    String[] tea_pnumber = {"+8801718024271",
            "+8801556332280",
            "+8801717882972",
            "+8801712532428",
            "+8801712553697",
            "+8801715171046",
            "+8801712943564",
            "+8801716152758",
            "+8801712805596",
            "+8801732565219",
            "+8801725821164",
            "+8801723740129",
            "+8801728007612",
            "+8801917448636",
            "+8801738661177"
    };

    int[] tea_img = {R.drawable.accounting_01,
            R.drawable.accounting_02,
            R.drawable.accounting_03,
            R.drawable.accounting_04,
            R.drawable.accounting_05,
            R.drawable.accounting_06,
            R.drawable.accounting_07,
            R.drawable.accounting_08,
            R.drawable.accounting_09,
            R.drawable.accounting_10,
            R.drawable.accounting_11,
            R.drawable.accounting_12,
            R.drawable.accounting_13,
            R.drawable.accounting_14,
            R.drawable.accounting_15

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounting__department);

        accountTeachersName = (ListView)findViewById(R.id.accountTeacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Accounting_Department.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        accountTeachersName.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_accounting__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721774407"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rc1873acc@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Accounting_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Accounting_Department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/accounting");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/accounting"));
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
