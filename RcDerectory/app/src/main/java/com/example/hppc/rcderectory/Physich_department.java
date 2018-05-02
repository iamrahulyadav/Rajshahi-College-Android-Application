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

public class Physich_department extends AppCompatActivity {

    ListView phyTeacherList;

    final String d_name = "Physics Department";

    final String bh = "Rajshahi College was established in 1873. The Department of Physics is on of the famous Department in this College.On 1st April of " +
            "that year, 1st Year and 2nd Year F.A (First Arts) classes started with only 6 students, which continued up to 1908. In 1909, I.Sc. course " +
            "started.<br></br>" +

            "After having permission in 1877, B.Sc. classes started in Rajshahi College in 1878. According to the sources available, Honours courses started " +
            "in some of the departments even before 1887. Though Masters Course was initiated in 1893, the permission of running the course was withdrawn in " +
            "1909 However, later in 1993 under National University, Masters Course started again.<br></br>" +

            "Though the exact date of the inception of Physics Department at Rajshahi College is unknown, in the light of various available sources, it " +
            "can be deduced that Physics as a subject was there since the foundation of the college. It is traced out that a student named Syed Abdus Salek " +
            "achieved Honours degree with distinction from Physics and Chemistry (in those days these two subjects were one) According to available data, in " +
            "1912-13 session the number of students having Physics subject was 138; the number of Intermediate students was 86 B.A (Pass Course) students 41, " +
            "and B.Sc (Pass Course & Honours Students 11. In that session number of teachers was 2 and demonstrators 2. In 1912-13 session Teachers of Physics " +
            "were Babu Bala Charan Bhattacharya and the then Principal Kumudinikanta Banerjee Bahadur, who is considered the architech of Rajshahi College. " +
            "He was a Professor of Physics. At his endeavor, the present Physics building was established. After 1930 many famous personalities worked as teachers " +
            "in this department, of whom some notables are: H C Ganguly (1934), Moulavi Aftabuddin Ahmed, Dr. Abdullah Al-Muti Sarfuddin, Dr. Sadaruddin Ahmed" +
            " Chowdhury, Dr. Mokbular Rahman. Sarkar.<br></br>" +

            "Area of Physics department: Apart form the prestigious Physics building, classes are also conducted in some rooms on the ground floor of the 3rd " +
            "Science Building.<br></br>" +

            "Class Room: Gallery-02, Normal Class Room-02, Physics Laboratory-02, Seminar-01, Office Room-01, Store-01, Bathroom-03<br></br>" +

            "One of the two galleries, one is used as the class room for the XI Science ‘A’ group students and the other is used as the class room " +
            "for the students of third year hons.<br></br>" +

            "On the 1st floor of the said building there are the Optical Lab and the Electricity & Electronics Lab which are being used for the 1st" +
            " year honours and non-major students, and 2nd Year Degree Pass and 3rd Year students, The Lab on the ground floor of the 3rd Science " +
            "Building is used as the Lab for the students of 4th Year Hons, Masters Part I and Masters Final Year The labs of this Department are " +
            "quite rich.<br></br>" +

            "Apart from the Central Library, the Physics Department has its Seminar. In the Seminar there are many books on Physics which the " +
            "students can either study or borrow. A teacher of the Department manages it. To know about in bengali please download the pdf.<br></br>";

    String[] tea_nam ={"01.PROFESSOR MD. ABDUL JALIL\nId: 4799",
            "02. DR. MD. NAZIM UDDIN\nId: 5371",
            "03. MD. ALAUDDIN\nId: 8822",
            "04. MD. DURUL HUDA\nId: 9046",
            "05. MD. MAHFUZ HASAN\nId: 9059",
            "06. MD. TAJEMUL HOQUE\nId: 10679",
            "07. JOY KUMAR DAS\nId: 12651",
            "08. MD. BARIK MRIDHA\nId: 23031",
            "09. Jemine Ferdaus\nId: 5371",
            "10. MD. MIZANUR RAHAMAN\nId:",
            "11. MD. ISMAIL HOSSAIN",
            "12. MD. ATIKUR RAHMAN",
            "13. MD. FARUK HOSAIN",
            "14. ARIFA KHATUN"
    };

    String[] tea_poss = {"Professor",
            "Associate\nProfessor",
            "Associate\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Assistant\nProfessor",
            "Lecturer",
            "Lecturer",
            "Lecturer",
            "Computer\nOperator",
            "M.L.S.S",
            "M.L.S.S",
            "M.L.S.S"
    };

    String[] tea_pnumber = {"+8801738216922",
            "+8801748954530",
            "+8801717290288",
            "+8801718822545",
            "+8801716731968",
            "+8801712638920",
            "+8801712898678",
            "+8801712789817",
            "+8801715122814",
            "+8801734569680",
            "+8801724026549",
            "+8801762125218",
            "+8801719531813",
            "+8801861717541"
    };

    int[] tea_img = {R.drawable.phy_abdul_jalil_01,
            R.drawable.phy_nazim_uddin_02,
            R.drawable.phy_alladin_03,
            R.drawable.phy_durul_huda_04,
            R.drawable.phy_mahfuz_hasan_05,
            R.drawable.phy_tazamul_haque_06,
            R.drawable.phy_joy_kumar_das_07,
            R.drawable.phy_barik_mridha_08,
            R.drawable.phy_jesmine_fardaus_09,
            R.drawable.phy_mizanur_rahman_10,
            R.drawable.phy_ismail_hossain_11,
            R.drawable.phy_atiqur_rahman_12,
            R.drawable.phy_faruk_hossain_13,
            R.drawable.phy_arifa_khatun_14
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physich_department);

        phyTeacherList = (ListView)findViewById(R.id.Phyteacher_namee);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Physich_department.this,tea_nam,tea_pnumber,tea_poss,tea_img);
        phyTeacherList.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_physich_department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721775225"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rc1873physics@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Physich_department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Physich_department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/physics");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/physics"));
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
                Toast.makeText(Physich_department.this, "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}
