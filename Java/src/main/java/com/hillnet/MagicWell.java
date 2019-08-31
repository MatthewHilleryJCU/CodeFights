package com.hillnet;

public class MagicWell {

    int getMagicWell(int a, int b, int n) {
        int money = 0;

        for (int i = n; i > 0; i--) {
            money += a * b;
            a++;
            b++;
        }
        return money;
    }
}
