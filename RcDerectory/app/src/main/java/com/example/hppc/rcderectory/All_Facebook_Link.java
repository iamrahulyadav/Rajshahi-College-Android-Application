package com.example.hppc.rcderectory;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class All_Facebook_Link extends AppCompatActivity {

    private LinkedHashMap<String, GroupInfo> subjects = new LinkedHashMap<String, GroupInfo>();
    private ArrayList<GroupInfo> deptList = new ArrayList<GroupInfo>();

    private CustomAdapter listAdapter;
    private ExpandableListView simpleExpandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__facebook__link);

        // add data for displaying in expandable list view
        loadData();

        //get reference of the ExpandableListView
        simpleExpandableListView = (ExpandableListView) findViewById(R.id.simpleExpandableListView);
        // create the adapter by passing your ArrayList data
        listAdapter = new CustomAdapter(All_Facebook_Link.this, deptList);
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
                //display it or do something with it

                //Facebook Link Added


                //Official Facebook Page Start
                if (detailInfo.getName().equals("Official facebook page")) {

                    String facebookUrl = "https://web.facebook.com/RajshahiCollegeOfficial";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + "https://web.facebook.com/RajshahiCollegeOfficial");
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/RajshahiCollegeOfficial")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }
                //Official Facebook Page End

//                //Public Group Start
//                if (detailInfo.getName().equals("Public Group \n" +
//                        "https://web.facebook.com/groups/rajshahicollege")) {
//
//                    String facebookUrl = "https://web.facebook.com/groups/rajshahicollege";
//                    try {
//                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
//                        if (versionCode >= 3002850) {
//                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
//                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
//                            ;
//                        } else {
//                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
//                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/groups/rajshahicollege")));
//                        }
//                    } catch (PackageManager.NameNotFoundException e) {
//                        // Facebook is not installed. Open the browser
//                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
//                    }
//                }
//                //Public Group End

                //Arts Group Start

                //1. Bengali
                if (detailInfo.getName().equals("Bengali")) {

                    String facebookUrl = "https://www.facebook.com/bengalirc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/bengalirc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //2. English
                if (detailInfo.getName().equals("English")) {

                    String facebookUrl = "https://www.facebook.com/englishrcofficial";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/englishrcofficial")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //3. Arabic & Islamic Studies
                if (detailInfo.getName().equals("Arabic and Islamic Studies")) {

                    String facebookUrl = "http://www.facebook.com/arabicrc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/arabicrc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //4. History
                if (detailInfo.getName().equals("History")) {

                    String facebookUrl = "http://www.facebook.com/history.rc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/history.rc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //5. Islamic History and Culture
                if (detailInfo.getName().equals("Islamic History and Culture")) {

                    String facebookUrl = "https://www.facebook.com/Islamichistoryrajshahicollege";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Islamichistoryrajshahicollege")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //6. Philosophy
                if (detailInfo.getName().equals("Philosophy")) {

                    String facebookUrl = "https://www.facebook.com/doprc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/doprc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //7. Sanskrit
                if (detailInfo.getName().equals("Sanskrit")) {

                    String facebookUrl = "https://www.facebook.com/sanskritrc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/sanskritrc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

//                //8. Urdu
                if (detailInfo.getName().equals("Urdu")) {

//                    String facebookUrl = "";
//                    try {
//                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
//                        if (versionCode >= 3002850) {
//                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
//                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
//                            ;
//                        } else {
//                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
//                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                        }
//                    } catch (PackageManager.NameNotFoundException e) {
//                        // Facebook is not installed. Open the browser
//                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
//                    }
                    Toast.makeText(getApplicationContext(), "This Page Is Available Soon", Toast.LENGTH_SHORT).show();
                }

                //Arts Group End

                //Business studies Group Start

                //1. Accounting
                if (detailInfo.getName().equals("Accounting")) {

                    String facebookUrl = "http://www.facebook.com/rc.accounting";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/rc.accounting")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //2. Finance and Banking
                if (detailInfo.getName().equals("Finance and Banking")) {

//                    String facebookUrl = "";
//                    try {
//                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
//                        if (versionCode >= 3002850) {
//                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
//                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
//                            ;
//                        } else {
//                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
//                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                        }
//                    } catch (PackageManager.NameNotFoundException e) {
//                        // Facebook is not installed. Open the browser
//                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
//                    }
                    Toast.makeText(getApplicationContext(), "This Page Is Available Soon", Toast.LENGTH_SHORT).show();
                }

                //3. Management
                if (detailInfo.getName().equals("Management")) {

                    String facebookUrl = "http://www.facebook.com/managementrc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/managementrc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //4. Marketing
                if (detailInfo.getName().equals("Marketing")) {

                    String facebookUrl = "http://www.facebook.com/marketingdeptrc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/marketingdeptrc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }
                //Business studies Group End

                //Science Group Start
                //1. Botany
                if (detailInfo.getName().equals("Botany")) {

                    String facebookUrl = "http://www.facebook.com/rcbotany";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/rcbotany")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //2. Chemistry
                if (detailInfo.getName().equals("Chemistry")) {

                    String facebookUrl = "https://www.facebook.com/chemistryrcofficial";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/chemistryrcofficial")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //3. Geography and Environment
                if (detailInfo.getName().equals("Geography and Environment")) {

                    String facebookUrl = "http://www.facebook.com/geography.rc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/geography.rc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //4. Mathematics
                if (detailInfo.getName().equals("Mathematics")) {

                    String facebookUrl = "https://www.facebook.com/rcmath";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rcmath")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //5. Physics
                if (detailInfo.getName().equals("Physics")) {

                    String facebookUrl = "https://www.facebook.com/physicsrajshahi";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/physicsrajshahi")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //6. Psychology
                if (detailInfo.getName().equals("Psychology")) {

                    String facebookUrl = "https://www.facebook.com/psyrc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/psyrc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //7. Statistics
                if (detailInfo.getName().equals("Statistics")) {

                    String facebookUrl = "https://www.facebook.com/StatisticsOfficial";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/StatisticsOfficial")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //8. Zoology
                if (detailInfo.getName().equals("Zoology")) {

                    String facebookUrl = "https://www.facebook.com/dozrc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/dozrc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //Science Group End

                //Social Science Start
                //1. Economics
                if (detailInfo.getName().equals("Economics")) {

                    String facebookUrl = "https://www.facebook.com/economicsrc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/economicsrc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //2. Political Science
                if (detailInfo.getName().equals("Political Science")) {

                    String facebookUrl = "https://www.facebook.com/dopsrc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/dopsrc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //3. Social Work
                if (detailInfo.getName().equals("Social Work")) {

                    String facebookUrl = "https://www.facebook.com/doswrc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/doswrc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //4. Sociology
                if (detailInfo.getName().equals("Sociology")) {

                    String facebookUrl = "https://www.facebook.com/sociorc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/sociorc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }
                //Social Science End

                        //ICT Course START
                if (detailInfo.getName().equals("NU one year ICT course")) {

                    String facebookUrl = "https://web.facebook.com/ictRajshahiCollege";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }
                        //ICT Course END

                //HSC Start
                if (detailInfo.getName().equals("HSC Rajshahi College")) {

                    String facebookUrl = "https://www.facebook.com/hscrajshahicollege";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/hscrajshahicollege")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }
                //HSC End

                //Library Start
                if (detailInfo.getName().equals("Central Library")) {

                    String facebookUrl = "https://www.facebook.com/Libraryrc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Libraryrc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }
                //Library End

                //Extra Curriculum Start

                //1. Rajshahi College BNCC UNIT
                if (detailInfo.getName().equals("Rajshahi College BNCC UNIT")) {

                    String facebookUrl = "https://web.facebook.com/rajshahicollegebnccunit";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/rajshahicollegebnccunit")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }
                //2. Rajshahi College Business Club

                if (detailInfo.getName().equals("Rajshahi College Business Club")) {

                    String facebookUrl = "https://web.facebook.com/groups/RCBC.Rc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/groups/RCBC.Rc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }
                //3. Rajshahi College Career Club

                if (detailInfo.getName().equals("Rajshahi College Career Club")) {

                    String facebookUrl = "https://web.facebook.com/groups/RCCareerClub";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/groups/RCCareerClub")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //4. Mirror English Debating Club
                if (detailInfo.getName().equals("Mirror English Debating Club")) {

                    String facebookUrl = "https://web.facebook.com/groups/medcrc";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/groups/medcrc")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }

                //5. Rajshahi College Photography Club
                if (detailInfo.getName().equals("Rajshahi College Photography Club")) {

                    String facebookUrl = "https://web.facebook.com/rcphotographyclub";
                    try {
                        int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                        if (versionCode >= 3002850) {
                            Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                            startActivity(new Intent(Intent.ACTION_VIEW, uri));
                            ;
                        } else {
                            // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/rcphotographyclub")));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        // Facebook is not installed. Open the browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                    }
                }
                //Extra Curriculum End

                Toast.makeText(getBaseContext(), " Clicked on :: " + headerInfo.getName() +
                        "/" + detailInfo.getName(), Toast.LENGTH_LONG).show();
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
                Toast.makeText(getBaseContext(), " Header is :: " + headerInfo.getName(), Toast.LENGTH_LONG).show();
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

        addProduct("Rajshahi College Official Page","Official facebook page");

        //addProduct("College Public Group","Public Group \nhttps://web.facebook.com/groups/rajshahicollege");

        addProduct("Arts","Bengali");
        addProduct("Arts","English");
        addProduct("Arts","Arabic and Islamic Studies");
        addProduct("Arts","History");
        addProduct("Arts","Islamic History and Culture");
        addProduct("Arts","Philosophy");
        addProduct("Arts","Sanskrit");
        addProduct("Arts","Urdu");

        addProduct("Business studies","Accounting");
        addProduct("Business studies","Finance and Banking");
        addProduct("Business studies","Management");
        addProduct("Business studies","Marketing");

        addProduct("Science", "Botany");
        addProduct("Science", "Chemistry");
        addProduct("Science", "Geography and Environment");
        addProduct("Science", "Mathematics");
        addProduct("Science", "Physics");
        addProduct("Science", "Psychology");
        addProduct("Science", "Statistics");
        addProduct("Science", "Zoology");

        addProduct("Social Science", "Economics");
        addProduct("Social Science","Political Science");
        addProduct("Social Science","Social Work");
        addProduct("Social Science","Sociology");

        addProduct("ICT Course", "NU one year ICT course");
        //addProduct("ICT Course", "Rajshahi College ICT course");

        addProduct("Library","Central Library");

        addProduct("HSC","HSC Rajshahi College");

        addProduct("Co-Curriculum", "Rajshahi College Business Club");
        addProduct("Co-Curriculum", "Mirror English Debating Club");
        addProduct("Co-Curriculum", "Rajshahi College BNCC UNIT");
        addProduct("Co-Curriculum", "Rajshahi College Career Club");
        addProduct("Co-Curriculum", "Rajshahi College Photography Club");
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
        getMenuInflater().inflate(R.menu.menu_all__facebook__link, menu);
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
