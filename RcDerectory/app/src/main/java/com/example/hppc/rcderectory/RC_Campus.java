package com.example.hppc.rcderectory;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by HP PC on 11/19/2016.
 */

public class RC_Campus extends Fragment {

    WebView admnBuilding;
    WebView pB, tQ, pG, bGaN, aT, bB, tC, hC, gY, canT, sCr, Gar;


    View v2;

    //01. Administrative Building
    String rc_ad_building = "<b><u>Administrative Building:</u></b></br>" +
            "The college had no building at the beginning of the college. The leaders of Rajshahi Association took the initiative to construct the " +
            "colleges first building. The first building of the college (now serving as the administrative building) was constructed in 1884 (shown in the picture) " +
            "at the cost of taka 67,700.00 and planned by a skilled British engineer. In addition of this, woodwork of a Chinese handicraft has been used as exterior " +
            "sunshade.This 2 storied Building of Deep red color situated besides the oldest main roadway in the heart of the city representing the witness of the " +
            "glory of Rajshahi. This main administrative building is a good example of British Indian colonial architecture<br></br>" +

            "On the first floor of the building there are the principal`s office and vice-principals offices in the eastern part, a teacher's auditorium in the " +
            "southern part and an examination control room and a conference room in the western part. On the ground floor there are the offices of administrative " +
            "branch, accounts branch, examination branch and cash branch. On the western part of the ground floor there is a girl`s common room. Recently the " +
            "building has been equipped with modern amenities along with the air condition facility keeping the original architecture intact.</br></br>";

    //02. Principal`s Residence
    final String priBuilding = "<b><u>Principal`s Residence:</u></b></br>" +
            "The gorgeous and spacious Principal`s residence is situated in an idyllic environment beside the mighty Padma and just at the south end of the " +
            "college playground. This well-furnished duplex building has office facilities at the ground floor. This exquisite building, constructed in " +
            "1972 with unique architectural artifacts, still bears the sign of great honour and prestigious tradition of Rajshahi College among all the " +
            "colleges of Bangladesh.</br></br>";

    //03. Teacher`s Quarters
    final String teaQ = "<b><u>Teacher`s Quarters:</u></b></br>" +
            "The teacher`s quarters consisting of 12 apartments housed in two three storied buildings, is situated at the South-Eastern corner of the college " +
            "playground. For the lack of proper reformation and renovation, the quarters were about to be abandoned. But the present college administration has " +
            "made some renovation of these buildings from non-government fund to make them worth living in. Moreover, a modernization project for the teacher`s" +
            "quarters has been taken up from the development fund of the college.</br></br>";

    //04. Playground
    final String pGround = "<b><u>Playground:</u></b></br>" +
            "The large and wide rectangular playground is situated at the heart of the college compound. This eye-catching playground is a great attraction " +
            "not only of the college but also of the whole Rajshahi city. Many students who practiced various types of games and sports on this smooth green " +
            "ground have been successful to show their talents at different national and international sporting events. Students can practice various games " +
            "and sports and take physical exercise till 7:30 AM in the morning session and from 4:30 PM till sunset in the afternoon session.</br></br>" +

            "Because of the congenial atmosphere provided by the College Administration, this happy field remains busy with a variety of sporting activities. " +
            "However, in order to ensure quality academic environment, all kinds of sporting activities are prohibited during class hours. So, from 7:30 AM to " +
            "2:30 PM the college playground remains closed.</br></br>";

    //05. Botanical Garden and Natural Aquarium
    final String botGrden = "<b><u>Botanical Garden and Natural Aquarium:</u></b></br>" +
            "In the east of the oldest Hajji Muhammad Mushin Bhaban and behind the administrative building there is a botanical garden. There are many " +
            "rare plants and seasonal flowers in the garden. There is a pond like a natural aquarium to help increasing the practical knowledge of the " +
            "students of Zoology and Botany.</br></br>";

    //06. Auditorium
    final String aud = "<b><u>Auditorium:</u></b></br>" +
            "The auditorium of the college is on the first floor of the library building. Different cultural functions along with fresher`s receptions, fare " +
            "well programmers, debate competitions, drama and discussions on different national days are held in the auditorium. The auditorium can accommodate " +
            "about one thousand spectators.</br></br>";

    //07. Bank Booth
    final String bankBoth = "<b><u>Bank Booth:</u></b></br>" +
            "There is a bank booth at the ground floor of the library building of the college. Students can pay their admission and examination fees and " +
            "other educational charges with the help of this bank booth organized by Rupali Bank Limited. It is to be noted that all kinds of transactions " +
            "are digital and online based here in this bank booth.</br></br>";

    //08. Teacher`s Club
    final String teacherClub = "<b><u>Teacher`s Club:</u></b></br>" +
            "The activities of the teachers’ club are conducted in the teacher`s auditorium which is situated on the first floor of the Administration Building. " +
            "The teacher`s club offers various facilities for teachers including television, newspapers, indoor games and other evening time recreations. In 2014 " +
            "the teacher`s club had undergone a tremendous renovation and modernization with the installation of air conditioners and other extended modern " +
            "facilities.</br></br>";

    //09. Health Center
    final String helthCenter = "<b><u>Health Centre:</u></b></br>" +
            "A health centre has been functioning in the college since its inception to provide healthcare to the teachers, college staff and students. An " +
            "expert medical officer provides suggestion for health service. </br></br>";

    //10. Gymnasium
    final String gymnasium = "<b><u>Gymnasium:</u></b></br>" +
            "A gymnasium was established in the college keeping the motto Sound mind in a sound body. The gymnasium is situated in the southern part of " +
            "<b><i>Hajji Muhammad Mushin Bhaban</i></b>, in the western part of Botanical Garden of the college. The gymnasium has modern facilities for physical exercise. " +
            "The students take regular exercise to build up their body.";

    //11. Canteen
    final String canteen = "<b><u>Canteen:</u></b></br>" +
            "For the refreshment of the students, there is a canteen in the college campus. The canteen is situated at the Eastern side of the Physics " +
            "building. </br></br>";

    //12. Student Common-Room
    final String sCommonRoom = "<b><u>Students Common-Room:</u></b></br>" +
            "There is a common room for students at the ground floor of the Political Science Department. During the leisure periods and class intervals, students " +
            "can take part in various indoor games in this common-room. Physical education teacher supervises the activities in this room.</br></br>";

    //13. Garage
    final String garage = "<b><u>Garage:</u></b></br>" +
            "There is a spacious garage behind the college library for proper management of the vehicles of the teachers and students.</br></br>";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v2 = inflater.inflate(R.layout.fragment_about_campus, container, false);

        admnBuilding = (WebView) v2.findViewById(R.id.wv_adbuilding);
        pB = (WebView) v2.findViewById(R.id.wv_Principal_Building);
        tQ = (WebView) v2.findViewById(R.id.wv_Tq_Building);
        pG = (WebView) v2.findViewById(R.id.wv_play_ground);
        bGaN = (WebView) v2.findViewById(R.id.wv_Bg_Na);
        aT = (WebView) v2.findViewById(R.id.wv_auditorium);
        bB = (WebView) v2.findViewById(R.id.wv_bank_booth);
        tC = (WebView) v2.findViewById(R.id.wv_teacher_club);
        hC= (WebView) v2.findViewById(R.id.wv_health_center);
        gY= (WebView) v2.findViewById(R.id.wv_gymnasium);
        canT= (WebView) v2.findViewById(R.id.wv_canteen);
        sCr= (WebView) v2.findViewById(R.id.wv_student_common_room);
        Gar= (WebView) v2.findViewById(R.id.wv_garage);

        //01. Administrative Building
        String text = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + rc_ad_building+
                "</p> " +
                "</body>" +
                "</html>";
        admnBuilding.loadData(text, "text/html", "utf-8");

        //02. Principal`s Residence
        String text_pb = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + priBuilding+
                "</p> " +
                "</body>" +
                "</html>";
        pB.loadData(text_pb, "text/html", "utf-8");

        //03. Teacher`s Quarters
        String text_tQ = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + teaQ+
                "</p> " +
                "</body>" +
                "</html>";
        tQ.loadData(text_tQ, "text/html", "utf-8");

        //04. Playground
        String text_pG = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + pGround+
                "</p> " +
                "</body>" +
                "</html>";
        pG.loadData(text_pG, "text/html", "utf-8");

        //05. Botanical Garden and Natural Aquarium
        String text_bG = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + botGrden+
                "</p> " +
                "</body>" +
                "</html>";
        bGaN.loadData(text_bG, "text/html", "utf-8");


        //06. Auditorium
        String text_aUd = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + aud+
                "</p> " +
                "</body>" +
                "</html>";
        aT.loadData(text_aUd, "text/html", "utf-8");

        //07. Bank Booth
        String text_bB = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + bankBoth+
                "</p> " +
                "</body>" +
                "</html>";
        bB.loadData(text_bB, "text/html", "utf-8");

        //08. Teacher`s Club
        String text_tC = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + teacherClub+
                "</p> " +
                "</body>" +
                "</html>";
        tC.loadData(text_tC, "text/html", "utf-8");

        //09. Health Center
        String text_hC = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + helthCenter+
                "</p> " +
                "</body>" +
                "</html>";
        hC.loadData(text_hC, "text/html", "utf-8");

        //10. Gymnasium
        String text_gC = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + gymnasium+
                "</p> " +
                "</body>" +
                "</html>";
        gY.loadData(text_gC, "text/html", "utf-8");

        //11. Canteen
        String text_CanT = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + canteen+
                "</p> " +
                "</body>" +
                "</html>";
        canT.loadData(text_CanT, "text/html", "utf-8");

        //12. Student Common-Room
        String text_sC = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + sCommonRoom+
                "</p> " +
                "</body>" +
                "</html>";
        sCr.loadData(text_sC, "text/html", "utf-8");

        //13. Garage
        String text_gaR = "<html> " +
                "<body>" +
                "<p align=\"justify\">"
                + garage+
                "</p> " +
                "</body>" +
                "</html>";
        Gar.loadData(text_gaR, "text/html", "utf-8");

        return  v2;
    }
}