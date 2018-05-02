package com.example.hppc.rcderectory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.hppc.rcderectory.extra_curriculum.ANINDITA;
import com.example.hppc.rcderectory.extra_curriculum.Abritti_Parishad;
import com.example.hppc.rcderectory.extra_curriculum.Anneshan;
import com.example.hppc.rcderectory.extra_curriculum.BNCC;
import com.example.hppc.rcderectory.extra_curriculum.Badhon;
import com.example.hppc.rcderectory.extra_curriculum.Barind_Theatre;
import com.example.hppc.rcderectory.extra_curriculum.MUNIARC;
import com.example.hppc.rcderectory.extra_curriculum.Mirror_English_Debating_Club;
import com.example.hppc.rcderectory.extra_curriculum.Natyo_Sangsad;
import com.example.hppc.rcderectory.extra_curriculum.Nritya_Charcha_Kendra;
import com.example.hppc.rcderectory.extra_curriculum.Photography_Club;
import com.example.hppc.rcderectory.extra_curriculum.RC_Community_Policing;
import com.example.hppc.rcderectory.extra_curriculum.RC_Creative_Club;
import com.example.hppc.rcderectory.extra_curriculum.RC_Reporters_Unity;
import com.example.hppc.rcderectory.extra_curriculum.Rajshahi_College_Business_Club;
import com.example.hppc.rcderectory.extra_curriculum.Rajshahi_College_Career_Club;
import com.example.hppc.rcderectory.extra_curriculum.Ranger;
import com.example.hppc.rcderectory.extra_curriculum.Redcrescent_Unit;
import com.example.hppc.rcderectory.extra_curriculum.Rotari_Club;
import com.example.hppc.rcderectory.extra_curriculum.Rover_Scout;
import com.example.hppc.rcderectory.extra_curriculum.Sangeet_Charcha_Kendra;
import com.example.hppc.rcderectory.extra_curriculum.Science_Club;
import com.example.hppc.rcderectory.extra_curriculum.Social_Work_Innovative_Club;
import com.example.hppc.rcderectory.extra_curriculum.Sociology_Debate_Club;
import com.example.hppc.rcderectory.notice_board.Office_Staff;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class All_Contact_List extends AppCompatActivity {

    private LinkedHashMap<String, GroupInfo> subjects = new LinkedHashMap<String, GroupInfo>();
    private ArrayList<GroupInfo> deptList = new ArrayList<GroupInfo>();

    private CustomAdapter listAdapter;
    private ExpandableListView simpleExpandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__contact__list);

        // add data for displaying in expandable list view
        loadData();

        //get reference of the ExpandableListView
        simpleExpandableListView = (ExpandableListView) findViewById(R.id.simpleExpandableListView_contact);
        // create the adapter by passing your ArrayList data
        listAdapter = new CustomAdapter(All_Contact_List.this, deptList);
        // attach the adapter to the expandable list view
        simpleExpandableListView.setAdapter(listAdapter);

        //expand all the Groups
        //expandAll();

        // setOnChildClickListener listener for child row click
        simpleExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                //get the group header
                GroupInfo headerInfo = deptList.get(groupPosition);
                //get the child info
                ChildInfo detailInfo = headerInfo.getProductList().get(childPosition);

                //Open my custom activity

                    //Office Staff Start
                if (detailInfo.getName().equals("Office Staff")){
                    Intent intent = new Intent(All_Contact_List.this, Office_Staff.class);
                    startActivity(intent);
                }
                    //Office Staff End

                        // (a) ARTS DIVISION START
                //01. Arabic and Islamic Studies Department
                if(detailInfo.getName().equals("Arabic and Islamic Studies")){
                    Intent intent = new Intent(All_Contact_List.this, Arabic_and_Islamic_Studies.class);
                    startActivity(intent);
                }

                //02. Bengali Department
                if(detailInfo.getName().equals("Bengali")){
                    Intent intent = new Intent(All_Contact_List.this, Bengali_Department.class);
                    startActivity(intent);
                }

                //03. English Department
                if(detailInfo.getName().equals("English")){
                    Intent intent = new Intent(All_Contact_List.this, English_Department.class);
                    startActivity(intent);
                }

                //04. History Department
                if(detailInfo.getName().equals("History")){
                    Intent intent = new Intent(All_Contact_List.this, History_Department.class);
                    startActivity(intent);
                }

                //05. Islamic History and Culture Department
                if(detailInfo.getName().equals("Islamic History and Culture")){
                    Intent intent = new Intent(All_Contact_List.this, Islamic_History_and_Culture.class);
                    startActivity(intent);
                }

                //06.  Philosophy Department
                if(detailInfo.getName().equals("Philosophy")){
                    Intent intent = new Intent(All_Contact_List.this, Philosophy_Department.class);
                    startActivity(intent);
                }

                //07. Sanskrit Department
                if(detailInfo.getName().equals("Sanskrit")){
                    Intent intent = new Intent(All_Contact_List.this, Sanskrit_Department.class);
                    startActivity(intent);
                }

                //08. Urdu Department
                if(detailInfo.getName().equals("Urdu")){
                    Intent intent = new Intent(All_Contact_List.this, Urdu_Department.class);
                    startActivity(intent);
                }

                        //(a) ARTS DIVISION END


                        //(b)BUSINESS STUDIES  DIVISION START
                //01. Accounting
                if(detailInfo.getName().equals("Accounting")){
                    Intent intent = new Intent(All_Contact_List.this, Accounting_Department.class);
                    startActivity(intent);
                }

                //02. Finance and Banking
                if(detailInfo.getName().equals("Finance and Banking")){
                    Intent intent = new Intent(All_Contact_List.this, Finance_and_Banking.class);
                    startActivity(intent);
                }

                //03. Management
                if(detailInfo.getName().equals("Management")){
                    Intent intent = new Intent(All_Contact_List.this, Management_Department.class);
                    startActivity(intent);
                }

                //04. Marketing
                if(detailInfo.getName().equals("Marketing")){
                    Intent intent = new Intent(All_Contact_List.this, Marketing_Department.class);
                    startActivity(intent);
                }
                        //(b)BUSINESS STUDIES  DIVISION END


                        // (c) SCIENCE DIVISION START
                //01. Botany Department
                if(detailInfo.getName().equals("Botany")){
                    Intent intent = new Intent(All_Contact_List.this, Botany_Department.class);
                    startActivity(intent);
                }

                //02. Chemistry Department
                if(detailInfo.getName().equals("Chemistry")){
                    Intent intent = new Intent(All_Contact_List.this, Chemistry_Department.class);
                    startActivity(intent);
                }

                //03. Geography and Environment Department
                if(detailInfo.getName().equals("Geography and Environment")) {
                    Intent intent = new Intent(All_Contact_List.this, Geography_and_Environment.class);
                    startActivity(intent);
                }

                //04. Mathematics Department
                if (detailInfo.getName().equals("Mathematics")) {
                    Intent intent = new Intent(All_Contact_List.this, Mathematics_Department.class);
                    startActivity(intent);
                }

                //05. Physics Department
                if (detailInfo.getName().equals("Physics")) {
                    Intent intent = new Intent(All_Contact_List.this,Physich_department.class);
                    startActivity(intent);
                }

                //06. Psychology Department
                if(detailInfo.getName().equals("Psychology")){
                    Intent intent = new Intent(All_Contact_List.this,Psychology_Department.class);
                    startActivity(intent);
                }


                //07. Statistics Department
                if(detailInfo.getName().equals("Statistics")){
                    Intent intent = new Intent(All_Contact_List.this, Statistics_Department.class);
                    startActivity(intent);
                }

                //08. Zoology Department
                if (detailInfo.getName().equals("Zoology")) {
                    Intent intent = new Intent(All_Contact_List.this,Zoology_Department.class);
                    startActivity(intent);
                }
                        // (c) SCIENCE DIVISION START


                        // (d) SOCIAL SCIENCE DIVISION START
                //01. Economics
                if (detailInfo.getName().equals("Economics")) {
                    Intent intent = new Intent(All_Contact_List.this,Economics_Department.class);
                    startActivity(intent);
                }

                //02. Political Science
                if (detailInfo.getName().equals("Political Science")) {
                    Intent intent = new Intent(All_Contact_List.this,Political_Science_Department.class);
                    startActivity(intent);
                }

                //03. Social Work
                if (detailInfo.getName().equals("Social Work")) {
                    Intent intent = new Intent(All_Contact_List.this,Social_Work_Department.class);
                    startActivity(intent);
                }

                //04. Sociology
                if (detailInfo.getName().equals("Sociology")) {
                    Intent intent = new Intent(All_Contact_List.this,Sociology_Department.class);
                    startActivity(intent);
                }
                            // (d) SOCIAL SCIENCE DIVISION END

                            //ICT Course START
                //01. NU One Year ICT Course
                if(detailInfo.getName().equals("NU One Year ICT Course")){
                    Intent intent = new Intent(All_Contact_List.this, NU_One_Year_ICT_Course.class);
                    startActivity(intent);
                }

                //02. Rajshahi College ICT Course
                if(detailInfo.getName().equals("Rajshahi College ICT Course")){
                    Intent intent = new Intent(All_Contact_List.this, Rajshahi_College_ICT_Course.class);
                    startActivity(intent);
                }
                            //ICT Course END



                //College Library
                if(detailInfo.getName().equals("Rajshahi College Central Library")){
                    Intent intent = new Intent(All_Contact_List.this, Library.class);
                    startActivity(intent);
                }

                        //Extra Curriculum
                //01. Rajshahi college business club
                if (detailInfo.getName().equals("Rajshahi College Business Club")){
                    Intent intent = new Intent(All_Contact_List.this, Rajshahi_College_Business_Club.class);
                    startActivity(intent);
                }

                //02. Mirror English Debating Club
                if(detailInfo.getName().equals("Mirror English Debating Club")){
                    Intent intent = new Intent(All_Contact_List.this, Mirror_English_Debating_Club.class);
                    startActivity(intent);
                }

                //03. BNCC Unit RC
                if (detailInfo.getName().equals("BNCC")){
                    Intent intent = new Intent(All_Contact_List.this, BNCC.class);
                    startActivity(intent);
                }

                //04. Rover Scout RC
                if (detailInfo.getName().equals("Rover Scout")){
                    Intent intent = new Intent(All_Contact_List.this, Rover_Scout.class);
                    startActivity(intent);
                }

                //05. Ranger Unit RC
                if (detailInfo.getName().equals("Ranger")){
                    Intent intent = new Intent(All_Contact_List.this, Ranger.class);
                    startActivity(intent);
                }

                //06. Badhon Unit RC
                if (detailInfo.getName().equals("Badhon")){
                    Intent intent = new Intent(All_Contact_List.this, Badhon.class);
                    startActivity(intent);
                }

                //07. Science Club Unit RC
                if (detailInfo.getName().equals("Science Club")){
                    Intent intent = new Intent(All_Contact_List.this, Science_Club.class);
                    startActivity(intent);
                }

                //08. Sangeet Charcha Kendra Club Unit RC
                if (detailInfo.getName().equals("Sangeet Charcha Kendra")){
                    Intent intent = new Intent(All_Contact_List.this, Sangeet_Charcha_Kendra.class);
                    startActivity(intent);
                }

                //09. Barind Theatre RC
                if (detailInfo.getName().equals("Barind Theatre")){
                    Intent intent = new Intent(All_Contact_List.this, Barind_Theatre.class);
                    startActivity(intent);
                }

                //10. Natyo Sangsad
                if (detailInfo.getName().equals("Natyo Sangsad")){
                    Intent intent = new Intent(All_Contact_List.this, Natyo_Sangsad.class);
                    startActivity(intent);
                }

                //11. Anneshan
                if (detailInfo.getName().equals("Anneshan")){
                    Intent intent = new Intent(All_Contact_List.this, Anneshan.class);
                    startActivity(intent);
                }

                //12. Abritti Parishad
                if (detailInfo.getName().equals("Abritti Parishad")){
                    Intent intent = new Intent(All_Contact_List.this, Abritti_Parishad.class);
                    startActivity(intent);
                }

                //13. Nritya Charcha Kendra
                if (detailInfo.getName().equals("Nritya Charcha Kendra")){
                        Intent intent = new Intent(All_Contact_List.this, Nritya_Charcha_Kendra.class);
                        startActivity(intent);
                }

                //14. Sociology Debate Club
                if (detailInfo.getName().equals("Sociology Debate Club (SDC)")){
                    Intent intent = new Intent(All_Contact_List.this, Sociology_Debate_Club.class);
                    startActivity(intent);
                }

                //15. Rajshahi College Career Club
                if (detailInfo.getName().equals("Rajshahi College Career Club")){
                    Intent intent = new Intent(All_Contact_List.this, Rajshahi_College_Career_Club.class);
                    startActivity(intent);
                }

                //16. Rajshahi Colleg Creative Club
                if (detailInfo.getName().equals("Rajshahi Colleg Creative Club")){
                    Intent intent = new Intent(All_Contact_List.this, RC_Creative_Club.class);
                    startActivity(intent);
                }

                //17. MUNIARC
                if (detailInfo.getName().equals("MUNIARC")){
                    Intent intent = new Intent(All_Contact_List.this, MUNIARC.class);
                    startActivity(intent);
                }

                //18. Redcrescent Unit
                if (detailInfo.getName().equals("Redcrescent Unit")){
                    Intent intent = new Intent(All_Contact_List.this, Redcrescent_Unit.class);
                    startActivity(intent);
                }

                //19. Photography Club
                if (detailInfo.getName().equals("Photography Club")){
                    Intent intent = new Intent(All_Contact_List.this, Photography_Club.class);
                    startActivity(intent);
                }


                //20. Rajshahi College  Reporters Unity
                if (detailInfo.getName().equals("Rajshahi College  Reporters Unity")){
                    Intent intent = new Intent(All_Contact_List.this, RC_Reporters_Unity.class);
                    startActivity(intent);
                }

                //21. Rotari Club
                if (detailInfo.getName().equals("Rotari Club")){
                    Intent intent = new Intent(All_Contact_List.this, Rotari_Club.class);
                    startActivity(intent);
                }

                //22. ANINDITA
                if (detailInfo.getName().equals("ANINDITA")){
                    Intent intent = new Intent(All_Contact_List.this, ANINDITA.class);
                    startActivity(intent);
                }

                //23. Social Work Innovative Club
                if (detailInfo.getName().equals("Social Work Innovative Club")){
                    Intent intent = new Intent(All_Contact_List.this, Social_Work_Innovative_Club.class);
                    startActivity(intent);
                }

                //24. Rajshahi College Community Policing
                if (detailInfo.getName().equals("RC Community Policing")){
                    Intent intent = new Intent(All_Contact_List.this, RC_Community_Policing.class);
                    startActivity(intent);
                }




                Toast.makeText(getBaseContext(), " Clicked on :: " + headerInfo.getName()
                        + "/" + detailInfo.getName(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        // setOnGroupClickListener listener for group heading click
        simpleExpandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                //get the group header
                GroupInfo headerInfo = deptList.get(groupPosition);
                //display it or do something with it
                Toast.makeText(getBaseContext(), " Header is :: " + headerInfo.getName(),
                        Toast.LENGTH_SHORT).show();

                return false;
            }
        });

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //method to expand all groups
    private void expandAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++){
            simpleExpandableListView.expandGroup(i);
        }
    }

    //method to collapse all groups
    private void collapseAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++){
            simpleExpandableListView.collapseGroup(i);
        }
    }

    //load some initial data into out list
    private void loadData(){

        addProduct("Office","Office Staff");

        addProduct("Arts","Arabic and Islamic Studies");
        addProduct("Arts","Bengali");
        addProduct("Arts","English");
        addProduct("Arts","History");
        addProduct("Arts","Islamic History and Culture");
        addProduct("Arts","Philosophy");
        addProduct("Arts","Sanskrit");
        addProduct("Arts","Urdu");

        addProduct("Business studies","Accounting");
        addProduct("Business studies","Finance and Banking");
        addProduct("Business studies","Management");
        addProduct("Business studies","Marketing");

        addProduct("Science","Botany");
        addProduct("Science","Chemistry");
        addProduct("Science","Geography and Environment");
        addProduct("Science","Mathematics");
        addProduct("Science","Physics");
        addProduct("Science","Psychology");
        addProduct("Science","Statistics");
        addProduct("Science","Zoology");

        addProduct("Social Science","Economics");
        addProduct("Social Science","Political Science");
        addProduct("Social Science","Social Work");
        addProduct("Social Science","Sociology");

        addProduct("ICT Course", "NU One Year ICT Course");
//        addProduct("ICT Course", "Rajshahi College ICT Course");

//        addProduct("Hostel","Girls' Hostel");
//        addProduct("Hostel","Maharani Hemontakumari Hostel");
//        addProduct("Hostel","Muslim Hostel");

        addProduct("Library","Rajshahi College Central Library");

        addProduct("Co-Curriculum", "Rajshahi College Business Club");
        addProduct("Co-Curriculum", "Mirror English Debating Club");
        addProduct("Co-Curriculum", "BNCC");
        addProduct("Co-Curriculum", "Rover Scout");
        addProduct("Co-Curriculum", "Ranger");
        addProduct("Co-Curriculum", "Badhon");
        addProduct("Co-Curriculum", "Science Club");
        addProduct("Co-Curriculum", "Sangeet Charcha Kendra");
        addProduct("Co-Curriculum", "Barind Theatre");
        addProduct("Co-Curriculum", "Natyo Sangsad");
        addProduct("Co-Curriculum", "Anneshan");
        addProduct("Co-Curriculum", "Abritti Parishad");
        addProduct("Co-Curriculum", "Nritya Charcha Kendra");
        addProduct("Co-Curriculum", "Sociology Debate Club (SDC)");
        addProduct("Co-Curriculum", "Rajshahi College Career Club");
        addProduct("Co-Curriculum", "Rajshahi Colleg Creative Club");
        addProduct("Co-Curriculum", "MUNIARC");
        addProduct("Co-Curriculum", "Redcrescent Unit");
        addProduct("Co-Curriculum", "Photography Club");
        addProduct("Co-Curriculum", "Rajshahi College  Reporters Unity");
        addProduct("Co-Curriculum", "Rotari Club");
        addProduct("Co-Curriculum", "ANINDITA");
        addProduct("Co-Curriculum", "Social Work Innovative Club");
        addProduct("Co-Curriculum", "RC Community Policing");



//        addProduct("Transport","Rajshahi College Transport");
    }



    //here we maintain our products in various departments
    private int addProduct(String department, String product){

        int groupPosition = 0;

        //check the hash map if the group already exists
        GroupInfo headerInfo = subjects.get(department);
        //add the group if doesn't exists
        if(headerInfo == null){
            headerInfo = new GroupInfo();
            headerInfo.setName(department);
            subjects.put(department, headerInfo);
            deptList.add(headerInfo);
        }

        //get the children for the group
        ArrayList<ChildInfo> productList = headerInfo.getProductList();
        //size of the children list
        int listSize = productList.size();
        //add to the counter
        listSize++;

        //create a new child and add that to the group
        ChildInfo detailInfo = new ChildInfo();
        detailInfo.setSequence(String.valueOf(listSize));
        detailInfo.setName(product);
        productList.add(detailInfo);
        headerInfo.setProductList(productList);

        //find the group position inside the list
        groupPosition = deptList.indexOf(headerInfo);
        return groupPosition;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_all__contact__list, menu);
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
}
