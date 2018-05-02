package com.example.hppc.rcderectory;

/**
 * Created by HP PC on 8/7/2016.
 */

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.Settings.Global.getString;

/**
 * Created by HP PC on 8/3/2016.
 */
public class CustomAdapter_TL extends BaseAdapter{

    Context ct;
    String[] tea_name;
    String[] teaPnumber;
    String[] tea_poss;
    int[] t_img;
    private static LayoutInflater inflater = null;

            //(a)ARTS DIVISION START
    //01. Constructor for Arabic and Islamic Studies Department
    public CustomAdapter_TL(Arabic_and_Islamic_Studies Arb_and_IS, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = Arb_and_IS;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //02. Constructor for Bengali Department
    public CustomAdapter_TL(Bengali_Department benD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = benD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //03. Constructor for English Department
    public CustomAdapter_TL(English_Department engD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img) {
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = engD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //04. Constructor for History Department
    public CustomAdapter_TL(History_Department histD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img) {
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = histD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //05. Constructor for Islamic History and Culture Department
    public CustomAdapter_TL(Islamic_History_and_Culture ihacD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = ihacD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    //06. Constructor for Philosophy Department
    public CustomAdapter_TL(Philosophy_Department psophyD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = psophyD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //07. Constructor for Sanskrit Department
    //08. Constructor for Urdu Department
            //(a)ARTS DIVISION END


            //(b)BUSINESS STUDIES DIVISION START
    //01. Constructor for Accounting Department
    public CustomAdapter_TL(Accounting_Department accD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] t_img) {
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.t_img = t_img;
        this.tea_poss = tea_poss;
        ct = accD;
        inflater = (LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //01. Constructor for Finance and Banking Department
    public CustomAdapter_TL(Management_Department manD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] t_img) {
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.t_img = t_img;
        this.tea_poss = tea_poss;
        ct = manD;
        inflater = (LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

            //(b)BUSINESS STUDIES DIVISION END


            //(c)SCIENCE DIVISION START
    //01. Constructor for Botany Department
    public CustomAdapter_TL(Botany_Department bD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = bD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //02. Constructor for Chemistry Department
    public CustomAdapter_TL(Chemistry_Department CheD,String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){

        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = CheD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //03. Constructor for Geography and Environment Department
    public CustomAdapter_TL(Geography_and_Environment gAeD, String[] tea_name, String[] teaPnumber,String[] tea_poss, int[] img){

        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = gAeD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //04. Constructor for Mathematics Department
    public CustomAdapter_TL(Mathematics_Department Md, String[] tea_name, String[] teaPnumber,String[] tea_poss, int[] img){

        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = Md;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //05. Constructor for Physics Department
    public CustomAdapter_TL(Physich_department Pd, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img) {
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = Pd;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //06. Constructor for Psychology Department
    public CustomAdapter_TL(Psychology_Department PsyD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = PsyD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //07. Constructor for Statistics Department
    public CustomAdapter_TL(Statistics_Department StD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = StD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //08. Constructor for Zoology Department
    public CustomAdapter_TL(Zoology_Department ZoD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = ZoD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
            //(c)SCIENCE DIVISION END


            //(d)SOCIAL SCIENCE DIVISION START
    //01. Economics
    public CustomAdapter_TL(Economics_Department econoD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = econoD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    //02. Political Science
    public CustomAdapter_TL(Political_Science_Department polsD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = polsD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //03. Social Work
    public CustomAdapter_TL(Social_Work_Department sowD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = sowD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    //04. Sociology
    public CustomAdapter_TL(Sociology_Department slogyD, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = slogyD;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
            //(d)SOCIAL SCIENCE DIVISION END

            //CustomAdapter for ICT START
            public CustomAdapter_TL(NU_One_Year_ICT_Course nuICT, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){
                this.t_img = img;
                this.tea_name = tea_name;
                this.teaPnumber = teaPnumber;
                this.tea_poss = tea_poss;
                ct = nuICT;
                inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            }
            //CustomAdapter for ICT END

            //CustomAdapter for Library START
    public CustomAdapter_TL(Library clibrary, String[] tea_name, String[] teaPnumber, String[] tea_poss, int[] img){
        this.t_img = img;
        this.tea_name = tea_name;
        this.teaPnumber = teaPnumber;
        this.tea_poss = tea_poss;
        ct = clibrary;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
            //CustomAdapter for Library END
    @Override
    public int getCount() {
        return tea_name.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class MyHolder{
        TextView tvs_1;
        TextView tvs_2;
        TextView tvs_3;
        ImageView img;
    }

    @Override
    public View getView(final int position, View convertView,ViewGroup parent) {

        MyHolder myh = new MyHolder();
        View myview;

        myview = inflater.inflate(R.layout.activity_show_teacher_list,null);
        myh.tvs_1 = (TextView) myview.findViewById(R.id.teacher_name);
        myh.tvs_2 = (TextView) myview.findViewById(R.id.teacher_pnumber);
        myh.tvs_3 = (TextView) myview.findViewById(R.id.teacher_possition);
        myh.img = (ImageView) myview.findViewById(R.id.teacherImg);

        myh.tvs_1.setText(tea_name[position]);
        myh.tvs_2.setText(teaPnumber[position]);
        myh.tvs_3.setText(tea_poss[position]);
        myh.img.setImageResource(t_img[position]);


        //AlertDialog for CALL, SMS and COPY
        myview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ct, tea_name[position], Toast.LENGTH_SHORT).show();
                final CharSequence options[] = new CharSequence[]{"Call", "SMS", "Copy"};

                AlertDialog.Builder builder = new AlertDialog.Builder(ct);
                builder.setCancelable(false);
                builder.setIcon(t_img[position]);
                builder.setTitle(tea_name[position]);
                builder.setItems(options, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // the user clicked on options[which]

                        //CALL
                        if(which == 0){
                            Toast.makeText(ct,"Call", Toast.LENGTH_SHORT).show();
                            Intent in = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + teaPnumber[position]));
                            try {
                                ct.startActivity(in);
                            } catch (android.content.ActivityNotFoundException ex) {
                                Toast.makeText(ct.getApplicationContext(), "yourActivity is not founded", Toast.LENGTH_SHORT).show();
                            }
                        }

                        //SMS
                        else if(which == 1){
                            Toast.makeText(ct,"SMS", Toast.LENGTH_SHORT).show();

                            Log.i("Send SMS", "");
                            Intent smsIntent = new Intent(Intent.ACTION_VIEW);

                            smsIntent.setData(Uri.parse("smsto:"));
                            smsIntent.setType("vnd.android-dir/mms-sms");
                            smsIntent.putExtra("address", new String(teaPnumber[position]));
                            smsIntent.putExtra("sms_body", "");

                            try {
                                ct.startActivity(smsIntent);
                                Log.i("Finished sending SMS...", "");
                            }
                            catch (android.content.ActivityNotFoundException ex) {
                                Toast.makeText(ct.getApplicationContext(),"SMS faild, please try again later.", Toast.LENGTH_SHORT).show();
                            }
                        }

                        //COPY
                        else{
                            Toast.makeText(ct,"Number Copied", Toast.LENGTH_SHORT).show();
                            android.content.ClipboardManager clipboard = (android.content.ClipboardManager) ct.getSystemService(ct.CLIPBOARD_SERVICE);
                            android.content.ClipData clip = android.content.ClipData.newPlainText("", teaPnumber[position]);
                            clipboard.setPrimaryClip(clip);
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //the user clicked on Cancel
                        Toast.makeText(ct,"Cancel!", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();

            }
        });

        return myview;
    }
}