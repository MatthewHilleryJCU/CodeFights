package com.hillnet;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SpamDetection {

    private static final double NINTY_PERCENT = .90;
    private static final double FIFTY_PERCENT = .50;
    private static final String PASSED = "passed";
    private static final String FAILED = "failed: ";



    public String[] spamDetection(String[][] messages, String[] spamSignals) {

        String[] result = new String[] {};
        List<String> everything = new ArrayList<>();
        List<String> words = new ArrayList<>();

        for (String[] messageArray : messages) {
            for (String message : messageArray) {
                everything.add(message);
            }
        }

        for (int i = 0; i < messages.length; i++) {
            words.add(everything.remove(i));
        }



        return result;
    }
}
