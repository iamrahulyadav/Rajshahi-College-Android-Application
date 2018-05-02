package com.example.hppc.rcderectory;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class NU_One_Year_ICT_Course extends AppCompatActivity {

    ListView itTeachersName;

    final String d_name = "NU one year ICT course";
    final String bh = "Information and Communications Technology (ICT) has an important role in the modern world since we are now in the information age era. It is the " +
            "backbone of any digital initiative. It is also very important in our daily lives.<br></br>"+

            "ICT is also a combination of physical backbone and intellect. Computer systems, network machineries, software, wire and wireless connectivity systems, " +
            "broadcast hardware and many other hardware and accessories are the physical backbone.<br></br>"+

            "For ensure the ICT knowledge of the students National University launch the ICT course (an optional course of Masters Program under PILOT project) in the year " +
            "2011. At first National University launch the course in 10 College and Rajshahi College is one of them.<br></br>"+

            "This course was started in 2011 (2007-2008 sessions) and the subject code is 6666. After 3 years in 2014 this course runs under National University. At first only " +
            "720 students get opportunity from the course, now the number is more than 1000.<br></br>"+

            "Any student of master`s course can take the course, in Rajshahi College";

    final String as = "Syllabus: One Year ICT Course";

    final String ictSyllabus = "<b><u>Subject:</u> Information and Communication Technology</b></br>" +
            "<b><u>Subject Code:</u></b>  6666</br>" +
            "<b><u>Total Marks:</u></b>  100</br>" +
            "<b><u>Theory:</u></b> 60</br>" +
            "<b><u>Laboratory:</u></b> 40</br></br>" +

            "Theory: 60 Lectures, Class Test/Tutorials/Class Assessment: 10 marks, Final Examination: 50 marks and " +
            "Duration of Exam: 2.30 hours</br></br>" +

            "<b><u>Course Details:</u> </b></br></br>" +

            "<b>01. Introduction to Computer and ICT:</b></br> Computer and its Historical Evaluation, Classification of Computers, " +
            "Introduction to Computer System, Information and Communication Technology (ICT), Applications of Computer " +
            "and ICT. (4 lectures)</br></br>" +

            "<b>02. Software:</b></br> Introduction, Classification, System Software, Application Software, Package Program, " +
            "Relationship between Hardware and Software, Introduction to Word Processor - Microsoft Word, Desktop Publishing, " +
            "Spreadsheet Analysis - Microsoft Excel, Presentation Packages - Microsoft PowerPoint, Database " +
            "Fundamentals - Microsoft Access, Photo Editor - Photoshop, Computer Languages, Software Development Life Cycle. " +
            "(12 lectures)</br></br>" +

            "<b>03. Number System and Digital Logic:</b></br> Number System - Binary, Octal, Decimal and Hexadecimal, Number " +
            "Conversations, Binary Arithmetic, Data representation - Data, Information and Codes, ASCII and Unicode. Logic Gates, " +
            "Truth tables, Universal Gates, Boolean Theorems, De-Morgans Theorems, Clock Signal. (6 lectures)</br></br>"+

            "<b>04. Hardware:</b></br>Microcomputer components, Working Principle of Microcomputer, Motherboard, Cards, Ports, " +
            "Buses, Computer Speed. Memory and Storage Devices: General Properties, Memory Hierarchic, Measure of memory capacity, " +
            "Primary and Secondary Memory. Input and Output Devices: Keyboard, Mouse, Scanner, Monitor, Printer, Webcam, Speaker, " +
            "Projector. CPU and Microprocessor: Organization of Microprocessor, Arithmetic and Logic Unit, Control Unit, " +
            "Registers, Commercial Microprocessor. (10 lectures)</br></br>"+

            "<b>05. Operating System and Utility Software:</b></br>Introduction, Classification and task of Operating System, " +
            "File Management and Utility Software, Some Commercial and Open Source OS. (4 lectures)</br></br>"+

            "<b>06. Computer Communication and Network:</b></br>Introduction, Types of Network, Network Terminologies, Network " +
            "Devices, LAN Topology, Transmission Media, Submarine Cable, Optical Fiber Backbone, Network Interface Cards and " +
            "Protocols, WAN Characteristics, Bandwidth and Switching, Telecommunications - Telephone, Satellite, Wireless System, " +
            "GPS, VSAT, Mobile Systems. (8 lectures)</br></br>"+

            "<b>07. Internet and E-mail:</b></br>Evolution of Internet, Important Terminologies, Working Principle of the " +
            "Internet, Internet Services, Internet Address, Internet Protocol, Electronic Mail, World Wide Web. " +
            "(3 lectures)</br></br>"+

            "<b>08. Web Development:</b></br>How Web works, HTTP Protocol Basic, HTML Overview, Website Development Tools " +
            "Overview, Introduction to Cascade Style Sheet (CSS), Content Management System (CMS), Website Design, Website " +
            "Hosting. (7 lectures)</br></br>"+

            "<b>09. Computers and Society:</b></br>E-commerce - Benefits and Drawbacks, Technologies, Electronic Payment " +
            "System and Security, Various Aspects of E-governance and Digital Bangladesh, Social and Ethical Issues of " +
            "Computing. (4 lectures)</br></br>"+

            "<b>10. Computer Trouble Shooting and Maintenance:</b></br>Trouble shooting concept, Hardware Maintenance, " +
            "Software Maintenance, Security Problems, Protective measures, Virus and Anti-Virus. (2 lectures)" +
            "</br></br>"+

            "";

    String[] tea_nam ={"01. Md. Kafilar Rahman",
            "02. Md. Nurul Islam",
            "03. Shamim Ara Jesmin",
            "04. Mohammed Saiful Islam",
            "05. Md. Zahirul Islam",
            "06. Md. Abdul Hakim",
            "07. Mst. Lailatul Kadri",
            "08. Md. Kamruzzaman",
            "09. Shake Shalauddin",
            "10. Md. Mozaharul Islam"
    };

    String[] tea_poss = {"Mathematics",
            "Mathematics",
            "Accounting",
            "Psychology",
            "Geography",
            "Geography",
            "Mathematics",
            "Geography",
            "Office",
            "M.L.S.S"
    };

    String[] tea_pnumber ={"+8801716386576",
            "+8801721755339",
            "+8801717882972",
            "+8801714459202",
            "+8801749907907",
            "+8801711467367",
            "+8801735675402",
            "+8801717135653",
            "+8801743444402",
            "+88017477096029"
    };

    int[] tea_img = {R.drawable.math_03,
            R.drawable.math_04,
            R.drawable.accounting_03,
            R.drawable.psy_shaiful_islam_07,
            R.drawable.geo_zahirul_islam_04,
            R.drawable.geo_abdul_hakim_08,
            R.drawable.math_12,
            R.drawable.geo_kamruzzaman_03,
            R.drawable.ict_salladuin,
            R.drawable.ict_majurul
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nu__one__year__ict__course);

        itTeachersName = (ListView)findViewById(R.id.ictTeacher_name);

        CustomAdapter_TL myAdap = new CustomAdapter_TL(NU_One_Year_ICT_Course.this, tea_nam, tea_pnumber, tea_poss, tea_img);
        itTeachersName.setAdapter(myAdap);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //Bottom 4 buttons
    //01. Call button for call ict
    public void d_call(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+8801743444402"));
        try{
            startActivity(intent);
        }
        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(),"Activity is not founded", Toast.LENGTH_SHORT).show();
        }
    }

    //2. E-mail
    public void send_mail(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"salauddinict@gmail.com"});
        try{
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    //3. Brief History
    public void about_depaetment(View view) {
        Intent intent = new Intent(this, Brief_History.class);
        intent.putExtra("dname",d_name);
        intent.putExtra("message", bh);
        startActivity(intent);
    }

    //04. Details
    public void department_details(View view){
        Toast.makeText(getApplicationContext(), "Details About ICT", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Brief_History.class);
        intent.putExtra("dname",as);
        intent.putExtra("message", ictSyllabus);
        startActivity(intent);
    }
}
