package com.hillnet;

import java.util.ArrayList;

public class AdditionWithoutCarrying {

    int getadditionWithoutCarrying(int param1, int param2) {
        int sum = 0;
        StringBuilder builder = new StringBuilder();

        String strParam1 = String.valueOf(param1);
        String strParam2 = String.valueOf(param2);

        ArrayList<Character> a = new ArrayList<>();
        ArrayList<Character> b = new ArrayList<>();

        for (int i = 0; i < strParam1.length(); i++) {
            a.add(strParam1.charAt(i));
        }

        for (int i = 0; i < strParam2.length(); i++) {
            b.add(strParam2.charAt(i));
        }

        if (a.size() == b.size()) {
            return addDigits(builder, a, b);

        } else if (a.size() < b.size()) {
            int extra = b.size() - a.size();
            for (int x = 0; x < extra; x++){
                a.add(x, '0');
            }
            return addDigits(builder, a, b);

        }else if (a.size() > b.size()) {
            int extra = a.size() - b.size();
            for (int x = 0; x < extra; x++) {
                b.add(x, '0');
            }
            return addDigits(builder, a, b);
        }

        return sum;
    }

    private int addDigits(StringBuilder builder, ArrayList<Character> a, ArrayList<Character> b) {
        for (int i = 1; i <= b.size(); i++) {
            builder.append((Integer.parseInt(a.get(a.size() - i).toString()) + Integer.parseInt(b.get(b.size() - i).toString())) % 10);
        }
        return Integer.parseInt(builder.reverse().toString());
    }
}
