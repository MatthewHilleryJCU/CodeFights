package com.hillnet;


/**
 * Hello world!
 *
 */
public class App {

    static AdditionWithoutCarrying k = new AdditionWithoutCarrying();

    public static void main(String[] args) {

        int a =456;
        int b = 1734;

        System.out.println(k.getadditionWithoutCarrying(a,b));
    }
}
