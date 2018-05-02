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

public class Library extends AppCompatActivity {

    ListView librayContList;

    final String d_name = "Rajshahi College Central Library";
    final String bh = "The Institution has distinction for its Library containing both classics and recent edition of the books, journals and periodicals and it is " +
            "acclaimed internationally the reliable source for the information available from the print matters.<br></br>" +

            "The college library is rich with many rare books, gazettes, encyclopaedias, manuscripts, and ancient puthi manuscripts. At present, the library has a " +
            "more than 80,000 books";

    String[] tea_nam = {"01. Mohammad Mohiuddin",
            "02. Md. Zeher Ali Shah",
            "03. Mst. Sharifa Khatun",
            "04. Md. Sirajul Haque Chowdhury",
            "05. Mst. Rasheda Begum",
            "06. Md. Nazmul Islam",
            "07. Md. Iqbal Hossain Sohel",
            "08. Md. Ariful Islam"
    };

    String[] tea_poss = {"Librarian",
            "Assistant\nLibrarian",
            "M.L.S.S",
            "",
            "",
            "Photocopier",
            "",
            ""
    };

    String[] tea_pnumber = {"+8801714232236",
            "+8801718786423",
            "+8801717-205118",
            "+8801986233623",
            "+8801718931804",
            "+8801933213406",
            "+8801716-066365",
            "+8801987214450"
    };

    int[] tea_img = {R.drawable.lib_mohidduin_01,
            R.drawable.lib_zeher_ali_02,
            R.drawable.lib_sharifa_khatun_03,
            R.drawable.lib_sirajul_haque_04,
            R.drawable.lib_rasheda_begum_05,
            R.drawable.lib_nazmul_islam_06,
            R.drawable.lib_iqbal_hossain_07,
            R.drawable.lib_ariful_islam_08
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        librayContList = (ListView)findViewById(R.id.libraryPnumber);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(Library.this,tea_nam, tea_pnumber,tea_poss, tea_img);
        librayContList.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_library, menu);
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
        Toast.makeText(getApplicationContext(), "Clicked on Call Button", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721774409"));
        try{
            startActivity(intent);
        }
        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "Activity is not founded", Toast.LENGTH_SHORT).show();
        }
    }

    //2. E-mail
    public void send_mail(View view) {
        Toast.makeText(Library.this, "Clicked on E-mail Button", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"rclibrarybd@yahoo.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Library.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Library.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/library");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/library"));
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
