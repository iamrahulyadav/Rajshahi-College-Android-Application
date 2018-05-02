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

public class Marketing_Department extends AppCompatActivity {

    ListView marketingD;

    final String d_name = "Marketing Department";
    final String bh = "Change is occurring at an accelerating rate due to development of globalization, technological advancement and deregulation of economic sector. " +
            "In result, today is not like yesterday and tomorrow will be different from today. Therefore, Companies are facing immense challenges to continue with " +
            "existing strategy and so are turning to new strategy. However, the above mentioned three issues (globalization, technology and deregulation of economic " +
            "sector) also spell endless opportunities for the companies as well. How come marketing can help us to deal with these issues? Marketing, more than any " +
            "other business functions, deals with customers’ satisfaction. Creating customer value and satisfaction are at the very heart of modern marketing thinking " +
            "and practice. In short, marketing is the delivery of customer satisfaction by stretching limited resources for profitability. Philip Kotler, the father of " +
            "marketing, has put in this way: Marketing as a social and managerial process by which individuals and groups obtain what they need and want through creating " +
            "and exchanging products and value with others.<br></br>" +

            "Some people think that only large business organizations are operating in highly developed economies by using marketing, but sound marketing is critical " +
            "to the success of every organization – whether large or small, for –profit or nonprofit, domestic or global. Marketing operates within a dynamic global " +
            "environment. Every decade calls upon marketing managers to think freshly about their marketing objectives and practices.<br></br>" +

            "Rapid changes can quickly make yesterday’s winning strategies out of date. As management thought-leader Peter F. Drucker once observed, a company’s winning " +
            "formula for the last decade will probably be its undoing in the next decade. What are the marketing challenges in the 21st century? Today’s companies are " +
            "wrestling with changing customer values and orientations; economic stagnation; environmental decline; increased global competitors; and a host of other " +
            "economic, political, and social problems. However, these problems also provide marketing opportunities. So, a sensible marketing manager must look deeply " +
            "into several key trends and forces that are the marketing landscape and challenging marketing strategy: growth of nonprofit marketing, rapid globalization, " +
            "the changing world economy, and the call for more socially responsible actions. <br></br>" +

            "At present, marketing is being practiced throughout the world. Even in Eastern Europe and the former Soviet republics, where marketing has long had a bad name, " +
            "but the dramatic political and social changes have created new opportunities for marketing. Business and government leaders in most of the nations are eager to " +
            "learn everything they can about modern marketing practices. Bangladesh has also been performing to boost marketing knowledge and practice at various spheres " +
            "after independence. Universities and Government Colleges have noticed the increasing needs of marketing intelligence and have modernized course contents and " +
            "teaching methods in this regard.<br></br>" +

            "Rajshahi College has also introduced four-year marketing honours program and inaugurated a separate discipline namely ‘Marketing Department’ in 2013 under " +
            "Business Faculty. Honorable Former Principal professor Dr. Ali Reza Md. Abdul Mazid and Current Principal professor Md. Habibur Rahman played a dynamic role " +
            "for opening of this department. <br></br>" +

            "At present four teachers are carrying out both the academic and departmental activities with deep dedication. The academic functions of the department are " +
            "conducting efficiently by Dr. Biplab Kumar Mozumder, Associate Professor and Head of the department. Marketing department is determined to achieve a remarkable " +
            "success by producing dedicated marketing graduates with the view to serve the society in the long run.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketing__department);

        marketingD = (ListView) findViewById(R.id.marketingTeacher_name);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_marketing__department, menu);
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
        Toast.makeText(getApplicationContext(), "Clicked on E-mail button", Toast.LENGTH_SHORT).show();
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
        Intent intent = new Intent(Marketing_Department.this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details Info
    public void department_details(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Marketing_Department.this);
        alertDialogBuilder.setTitle("Rajshahi College Contact Info");
        alertDialogBuilder.setMessage("Want to visit http://rc.edu.bd/marketing");

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null)
                        && (wifi.isConnected() | datac.isConnected())) {
                    //connection is avlilable
                    Intent browserButton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rc.edu.bd/marketing"));
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
