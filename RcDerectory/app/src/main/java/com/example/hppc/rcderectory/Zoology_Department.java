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

public class Zoology_Department extends AppCompatActivity {

    ListView zooTeacherList;

    final String d_name = "Zoology Department";

    final String bh = "Zoology department is one of the most important departments of science of Rajshahi College. It was established in 1957. There are about 1000 " +
            "students in this department. Boys and Girls are doing B.Sc, B.Sc (Hons) and M.Sc level in this department. There are about 13 teachers who always keep their " +
            "loving touch on their students head.<br></br>" +

            "We arrange exertion at different important places. Students are always happy with their different types of extra curricular activities like sports, " +
            "cultural week, debate etc. They used to show the good performance in every sector. There are 2 (two) branches in M.Sc level i.e. fisheries and Entomology. " +
            "Audio-visual system has been introduced in classroom teaching.";

    String[] tea_nam ={"01. Shamim Ara Begum\nId: 0778",
            "02. ABU NAYEEM MUHAMMAD FAZLUL KARIM\nId: ",
            "03. DR. MOST. JAHANARA AKTER BANU \nId: 4351",
            "04. MD. GOLAM KIBRIA \nId: 4895",
            "05. DR. MD. RABIUL ALAM \nId: 8493",
            "06. MAHFUZA CHAWDHURY\nId: 14148",
            "07. SHARMIN HAFIZ\nId: 15768",
            "08. MOSAMMAT FAHMIDA AKHTER KOSTORI\nId: 13335",
            "09. AFROZA BANU \nId: 22144",
            "10. SMRETY SAROWAR \nId: 22424",
            "11. GOUTOM SINGHA \nId: 23907",
            "12. TITONIUS HEMBROM\nId: 24487",
            "13. MD. ASADUJJAMAN",
            "14. MD. SAIDUR RAHMAN",
            "15. MD. KAZI AZMUL HAQUE"

    };

    String[] tea_poss={"Professor",
            "Associate Professor",
            "Associate Professor",
            "Associate Professor",
            "Assistant Professor",
            "Assistant Professor",
            "Assistant Professor",
            "Assistant Professor",
            "Lecturer",
            "Lecturer",
            "Lecturer",
            "Lecturer",
            "Computer Operator",
            "M.L.S.S",
            "M.L.S.S"
    };

    String[] tea_pnumber={"+8801712070918",
            "+8801832368949",
            "+8801712011072",
            "+8801739117448",
            "+8801711301587",
            "+8801556310309",
            "+8801552397397",
            "+8801715122812",
            "+8801710357035",
            "+8801736410923",
            "+8801819688641",
            "+8801715715247",
            "+8801737851108",
            "+8801722319668",
            "+8801867612285"

    };

    int[] tea_img ={R.drawable.zoo_shamim_ara_begum_01,
            R.drawable.zoo_abu_nayeem_02,
            R.drawable.zoo_jahanara_akter_03,
            R.drawable.zoo_golam_kibria_04,
            R.drawable.zoo_rabiul_islam_05,
            R.drawable.zoo_mahfuza_chawdhury_06,
            R.drawable.zoo_sharmin_hafiz_07,
            R.drawable.zoo_mst_fahmida_akhter_08,
            R.drawable.zoo_afroza_banu_09,
            R.drawable.zoo_smrety_sarowae_10,
            R.drawable.zoo_goutom_singha_11,
            R.drawable.zoo_titonius_hembrom_12,
            R.drawable.zoo_asadujjaman_13,
            R.drawable.zoo_saidur_rahman_14,
            R.drawable.zoo_kazi_azmul_haque_15
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoology__department);

        zooTeacherList = (ListView) findViewById(R.id.show_Zooteacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Zoology_Department.this,tea_nam,tea_pnumber,tea_poss,tea_img);
        zooTeacherList.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_zoology__department, menu);
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
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721770880"));
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"zoology_rc@yahoo.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Zoology_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Zoology_Department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit rc.edu.bd/zoology");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/zoology"));
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
                Toast.makeText(Zoology_Department.this, "You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}
