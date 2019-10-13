package com.hillnet;

import org.junit.Assert;
import org.junit.Test;

public class SpamDetectionTest {

    private SpamDetection spam = new SpamDetection();

    @Test
    public void test1() {

        String[][] messages =   {{"Sale today!", "2837273"},
                                {"Unique offer!", "3873827"},
                                {"Only today and only for you!", "2837273"},
                                {"Sale today!", "2837273"},
                                {"Unique offer!", "3873827"}};

        String[] spamSignals = {"sale", "discount", "offer"};

        String[] result = {"passed", "failed: 2837273 3873827", "passed", "failed: offer sale"};

        Assert.assertArrayEquals(result, spam.spamDetection(messages, spamSignals));
    }


    @Test
    public void failIfNintyPercentOfMessagesHaveFewerThanFiveWords(){

        String[][] messages =
                {{"Sale today!", "2837273"},
                {"Unique offer!", "3873827"},
                {"Only today and only for you!", "2837273"},
                {"Sale today!", "2837273"},
                {"Unique offer!", "3873827"}};

        String[] spamSignals = {};

        String[] result = {"passed"};

        Assert.assertArrayEquals(result, spam.spamDetection(messages, spamSignals));

    }

}