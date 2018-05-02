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

public class Urdu_Department extends AppCompatActivity {

    ListView urduTname;

    final String d_name = "Urdu Department";
    final String bh = "Something About Urdu Department";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urdu__department);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_urdu__department, menu);
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
        Toast.makeText(getApplicationContext(), "Clicked on Call button", Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+880721772523"));
//        try{
//            startActivity(intent);
//        }
//        catch (android.content.ActivityNotFoundException ex){
//            Toast.makeText(getApplicationContext(), "Activity is not founded", Toast.LENGTH_SHORT).show();
//        }
    }

    //2. E-mail
    public void send_mail(View view) {
        Toast.makeText(getApplicationContext(),"Clicked on E-mail button", Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setType("message/rfc822");
//        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"Economics.rajshahicollegebd@gmail.com"});
//        try{
//            startActivity(Intent.createChooser(intent, "Send mail..."));
//        }
//        catch(android.content.ActivityNotFoundException ex){
//            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
//        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(Urdu_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Urdu_Department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/urdu");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/urdu"));
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
