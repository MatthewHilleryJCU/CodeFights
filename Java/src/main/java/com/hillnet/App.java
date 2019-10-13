package com.hillnet;



import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {

    static SpamDetection k = new SpamDetection();

    public static void main(String[] args) {

//        String [][] messages =  {{"Sale today!", "2837273"},
//                                {"Unique offer!", "3873827"},
//                                {"Only today and only for you!", "2837273"},
//                                {"Sale today!", "2837273"},
//                                {"Unique offer!", "3873827"}};
//
//        String [] spamSignals = {"sale", "discount", "offer"};
//
//        System.out.println(Arrays.toString(k.spamDetection(messages, spamSignals)));


        ArrayList<String> strs = new ArrayList<>();
        strs.add("hello 2");
        strs.add("bOWEN");
        strs.add("League");

        strs.forEach(str -> System.out.println(str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase()));


    }
}
