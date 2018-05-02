package com.example.hppc.rcderectory;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.preference.DialogPreference;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.hppc.rcderectory.database_option.User_Registration;
import com.example.hppc.rcderectory.notice_board.RC_NoticeBoard;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

import static com.example.hppc.rcderectory.R.styleable.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.opend, R.string.closed);

        mDrawerLayout.addDrawerListener(mToggle);   //should be addDrawerListener
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater =getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //Method for action Handburger icon(Toggle button)
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }

        //For actionbar
        switch (item.getItemId()){
            //01. Arts
            case R.id.id_bangla:
                Toast.makeText(getApplicationContext(), "Clicked on: "+item ,Toast.LENGTH_SHORT).show();
                Intent bengali = new Intent(MainActivity.this,Bengali_Department.class);
                startActivity(bengali);
                break;

            case R.id.id_english:
                Toast.makeText(getApplicationContext(), "Clicked on: "+item ,Toast.LENGTH_SHORT).show();
                Intent english = new Intent(MainActivity.this,English_Department.class);
                startActivity(english);
                break;

            case R.id.id_arabic_and_isalamic_studies:
                Toast.makeText(getApplicationContext(), "Clicked on: "+item ,Toast.LENGTH_SHORT).show();
                Intent iandis = new Intent(MainActivity.this,Arabic_and_Islamic_Studies.class);
                startActivity(iandis);
                break;

            case R.id.id_history:
                Toast.makeText(getApplicationContext(), "Clicked on: "+item ,Toast.LENGTH_SHORT).show();
                Intent history = new Intent(MainActivity.this,History_Department.class);
                startActivity(history);
                break;

            case R.id.id_philosophy:
                Toast.makeText(getApplicationContext(), "Clicked on: "+item ,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Philosophy_Department.class);
                startActivity(intent);
                break;

            case R.id.id_urdu:
                Toast.makeText(getApplicationContext(), "Clicked on: "+item,Toast.LENGTH_SHORT).show();
                Intent urdu = new Intent(MainActivity.this,Urdu_Department.class);
                startActivity(urdu);
                break;

           case R.id.id_sanskrit:
            Toast.makeText(getApplicationContext(), "Clicked on: "+item,Toast.LENGTH_SHORT).show();
            Intent sanskrit = new Intent(MainActivity.this,Sanskrit_Department.class);
            startActivity(sanskrit);
            break;

           //02. Business studies

            case R.id.id_accounting:
                Toast.makeText(getApplication(),"Clicked on: "+item,Toast.LENGTH_SHORT).show();
                Intent accounting = new Intent(MainActivity.this, Accounting_Department.class);
                startActivity(accounting);
                break;

            case R.id.id_finance_and_banking:
                Toast.makeText(getApplication(),"Clicked on: "+item,Toast.LENGTH_SHORT).show();
                Intent fandb = new Intent(MainActivity.this, Finance_and_Banking.class);
                startActivity(fandb);
                break;

            case R.id.id_management:
                Toast.makeText(getApplication(),"Clicked on: "+item, Toast.LENGTH_SHORT).show();
                Intent management = new Intent(MainActivity.this, Management_Department.class);
                startActivity(management);
                break;


            case R.id.id_marketing:
                Toast.makeText(getApplication(),"Clicked on: "+item, Toast.LENGTH_SHORT).show();
                Intent marketing = new Intent(MainActivity.this, Marketing_Department.class);
                startActivity(marketing);
                break;

            //03. Science

            case R.id.id_botany:
                Toast.makeText(getApplication(),"Clicked on: "+item, Toast.LENGTH_SHORT).show();
                Intent botany = new Intent(MainActivity.this, Botany_Department.class);
                startActivity(botany);
                break;

            case R.id.id_chemistry:
                Toast.makeText(getApplication(),"Clicked on: "+item, Toast.LENGTH_SHORT).show();
                Intent chemistry = new Intent(MainActivity.this, Chemistry_Department.class);
                startActivity(chemistry);
                break;

            case R.id.id_geography_and_environment:
                Toast.makeText(getApplication(),"Clicked on: "+item, Toast.LENGTH_SHORT).show();
                Intent geo_and_env = new Intent(MainActivity.this, Geography_and_Environment.class);
                startActivity(geo_and_env);
                break;

            case R.id.id_mathematics:
                Toast.makeText(getApplication(),"Clicked on: "+item, Toast.LENGTH_SHORT).show();
                Intent mathematics = new Intent(MainActivity.this, Mathematics_Department.class);
                startActivity(mathematics);
                break;

            case R.id.id_psychology:
                Toast.makeText(getApplication(),"Clicked on: "+item, Toast.LENGTH_SHORT).show();
                Intent psychology = new Intent(MainActivity.this, Psychology_Department.class);
                startActivity(psychology);
                break;

            case R.id.id_physic:
                Toast.makeText(getApplication(),"Clicked on: "+item, Toast.LENGTH_SHORT).show();
                Intent physic = new Intent(MainActivity.this, Physich_department.class);
                startActivity(physic);
                break;

            case R.id.id_statistics:
                Toast.makeText(getApplication(),"Clicked on: "+item, Toast.LENGTH_SHORT).show();
                Intent statistics = new Intent(MainActivity.this, Statistics_Department.class);
                startActivity(statistics);
                break;

            case R.id.id_zoology:
                Toast.makeText(getApplication(),"Clicked on: "+item, Toast.LENGTH_SHORT).show();
                Intent zoology = new Intent(MainActivity.this, Zoology_Department.class);
                startActivity(zoology);
                break;

            //04. Social Science

            case R.id.id_economics:
                Toast.makeText(getApplication(),"Clicked on: "+item, Toast.LENGTH_SHORT).show();
                Intent economics = new Intent(MainActivity.this, Economics_Department.class);
                startActivity(economics);
                break;

            case R.id.id_political_science:
                Toast.makeText(getApplication(),"Clicked on: "+item, Toast.LENGTH_SHORT).show();
                Intent political_science = new Intent(MainActivity.this, Political_Science_Department.class);
                startActivity(political_science);
                break;

            case R.id.id_social_work:
                Toast.makeText(getApplication(),"Clicked on: "+item, Toast.LENGTH_SHORT).show();
                Intent social_work = new Intent(MainActivity.this, Social_Work_Department.class);
                startActivity(social_work);
                break;

            case R.id.id_sociology:
                Toast.makeText(getApplication(),"Clicked on: "+item, Toast.LENGTH_SHORT).show();
                Intent sociology = new Intent(MainActivity.this, Sociology_Department.class);
                startActivity(sociology);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    //All_Facebook_Link
    public void facebook_button(View v){
        Toast.makeText(getApplicationContext(), "Clicked on Fb Page", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this, All_Facebook_Link.class);
        startActivity(i);
    }

    //Four emergency Button Starts
    //1. Principal Sir
    public void call_principal(View v){
        final CharSequence options[] = new CharSequence[]{"Call", "SMS", "Copy", "Details"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        //builder.setIcon(t_img[position]);
        builder.setIcon(R.drawable.principal_icon);
        builder.setTitle("Principal Professor Habibur Rahman");
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // the user clicked on options[which]

                //CALL
                if (which == 0) {
                    Toast.makeText(getApplicationContext(), "Call", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+8801761862964"));
                    try {
                        startActivity(in);
                    } catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(getApplicationContext(), "yourActivity is not founded", Toast.LENGTH_SHORT).show();
                    }
                }

                //SMS
                else if (which == 1) {
                    Toast.makeText(getApplicationContext(), "SMS", Toast.LENGTH_SHORT).show();

                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);

                    smsIntent.setData(Uri.parse("smsto:"));
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", new String("+8801761862964"));
                    smsIntent.putExtra("sms_body", "");

                    try {
                        startActivity(smsIntent);
                        Log.i("Finished sending SMS...", "");
                    } catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(getApplicationContext(), "SMS faild, please try again later.", Toast.LENGTH_SHORT).show();
                    }
                }

                //COPY
                else if(which == 2){
                    Toast.makeText(getApplicationContext(), "Number Copied", Toast.LENGTH_SHORT).show();
                    android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                    android.content.ClipData clip = android.content.ClipData.newPlainText("","8801761862964");
                    clipboard.setPrimaryClip(clip);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Details", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Principal.class);
                    startActivity(intent);
                }

            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //the user clicked on Cancel
                Toast.makeText(getApplicationContext(), "Cancel!", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }


    //2. Vice Principal Sir
    public void call_vice_principal(View v){
        final CharSequence options[] = new CharSequence[]{"Call", "SMS", "Copy", "Details"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        //builder.setIcon(t_img[position]);
        builder.setIcon(R.drawable.vice_principal_icon);
        builder.setTitle("Vice-Principal Professor Al Faruk Choudhury");
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // the user clicked on options[which]

                //CALL
                if (which == 0) {
                    Toast.makeText(getApplicationContext(), "Call", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+8801911600093"));
                    try {
                        startActivity(in);
                    } catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(getApplicationContext(), "yourActivity is not founded", Toast.LENGTH_SHORT).show();
                    }
                }

                //SMS
                else if (which == 1) {
                    Toast.makeText(getApplicationContext(), "SMS", Toast.LENGTH_SHORT).show();

                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);

                    smsIntent.setData(Uri.parse("smsto:"));
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", new String("+8801911600093"));
                    smsIntent.putExtra("sms_body", "");

                    try {
                        startActivity(smsIntent);
                        Log.i("Finished sending SMS...", "");
                    } catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(getApplicationContext(), "SMS faild, please try again later.", Toast.LENGTH_SHORT).show();
                    }
                }

                //COPY
                else if(which == 2){
                    Toast.makeText(getApplicationContext(), "Number Copied", Toast.LENGTH_SHORT).show();
                    android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                    android.content.ClipData clip = android.content.ClipData.newPlainText("","8801911600093");
                    clipboard.setPrimaryClip(clip);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Details", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Vice_Principal.class);
                    startActivity(intent);
                }

            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //the user clicked on Cancel
                Toast.makeText(getApplicationContext(), "Cancel!", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    //3. Notice_Board
    public void notice_board(View v){
        /*
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"rajshahicollegebd@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Subject of email");
        i.putExtra(Intent.EXTRA_TEXT   , "Body of email");
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
        */

        //Custome Notice Board
        Intent intent = new Intent(MainActivity.this, RC_NoticeBoard.class);
        startActivity(intent);

        //Show college notice board
        /*
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle("Rajshahi College Notice Board");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/all-notice");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ConnectivityManager cm = ((ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE));
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null && datac != null) && (wifi.isConnected() | datac.isConnected())){
                    //Connection is available
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/all-notice"));
                    startActivity(browserButton);
                }
                else {
                    //No connection
                    Toast toast = Toast.makeText(MainActivity.this, "No Internet Connection", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Cancel!!", Toast.LENGTH_SHORT);
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        */
    }
    //4. About College
    public void about_college(View v){
        Toast.makeText(getApplicationContext(), "Clicked On About College", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, About_College.class);
        startActivity(intent);
    }
    //Four emergency Button End

    //Continue
    public void continue_button(View v){
        Toast.makeText(getApplicationContext(), "Clicked on Continue", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this, All_Contact_List.class);
        startActivity(i);
    }

    //Alert dialog for Exit

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle("Attention");
        alertDialogBuilder.setMessage("Sure to close this Application?");
        alertDialogBuilder.setIcon(R.drawable.cross_sign);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this,"You Clicked No button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();

    }

        //Top four button
    //College Official Website
    public void web_button(View view) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle("Rajshahi College Website");
        alertDialogBuilder.setMessage("Want to visit www.rc.edu.bd?");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is available
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.rc.edu.bd"));
                    startActivity(browserButton);
                }else{
                    //no connection
                    Toast toast = Toast.makeText(MainActivity.this, "No Internet Connection",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Cancel!!", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }


    //RcBarta
    public void rc_barta(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle("Rajshahi College Barta");
        alertDialogBuilder.setMessage("Want to visit www.rcbarta.com?");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rcbarta.com/"));
                    startActivity(browserButton);
                }
                else{
                    //no connection
                    Toast toast = Toast.makeText(MainActivity.this, "No Internet Connection",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You press no button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }

    //Collage Radio
    public void radio(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle("Rajshahi College Radio");
        alertDialogBuilder.setMessage("Want to visit www.rcfmradio.com?");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rcfmradio.com/"));
                    startActivity(browserButton);
                }
                else{
                    //no connection
                    Toast toast = Toast.makeText(MainActivity.this, "No Internet Connection",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You Clicked No button", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }

    //About us button
    public void about_us(View view) {
        Toast.makeText(getApplicationContext(), "Location: Google Map", Toast.LENGTH_SHORT).show();
    }

    //For navigation ItemSelect
    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {

        switch (menuItem.getItemId()){

            case R.id.about_college:
                Intent intent = new Intent(this, About_College.class);
                startActivity(intent);
                break;

            case R.id.principal:
                Intent principal = new Intent(this, Principal.class);
                startActivity(principal);
                break;

            case R.id.vice_principal:
                Intent vprincipal = new Intent(this, Vice_Principal.class);
                startActivity(vprincipal);
                break;

            case R.id.all_fblink:
                Intent allFB = new Intent(this, All_Facebook_Link.class);
                startActivity(allFB);
                break;

            case R.id.continue_all:
                Intent allcontinue = new Intent(this, All_Contact_List.class);
                startActivity(allcontinue);
                break;

            case R.id.public_chat:
                Intent p_chat = new Intent(this, Public_Chat.class);
                startActivity(p_chat);
                break;

            case R.id.user_reg:
                //User Registration
                //Intent user_reg = new Intent(MainActivity.this, User_Registration.class);
                //startActivity(user_reg);
                Toast.makeText(this, "This feature is available soon..", Toast.LENGTH_LONG).show();
                break;

            case R.id.location:
                Intent intent1 = new Intent(this, Location_Rajshahi_College.class);
                startActivity(intent1);
                break;

            case R.id.share:
                Toast.makeText(getApplicationContext(), "This feature is available soon..",Toast.LENGTH_SHORT).show();
                break;

            case R.id.about_us:
                Intent aboutUs = new Intent(this, About_Us.class);
                startActivity(aboutUs);
                break;

            default:
                break;
        }

        DrawerLayout d1 = (DrawerLayout) findViewById(R.id.drawerLayout);
        if (d1.isDrawerOpen(GravityCompat.START))
            d1.closeDrawer(GravityCompat.START);

        return false;
    }

    //Location Button
    public void g_location(View view) {
        Toast.makeText(getApplicationContext(), "Location Rajshahi college!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, Location_Rajshahi_College.class);
        startActivity(intent);
    }
}
