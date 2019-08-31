package com.hillnet;

public class LeastFactorials {

    int getLeastFactorial(int n) {

        int factorial = 1;


            for (int i = 2; i <= n; i++) {
                factorial = factorial * i;
                if (factorial >= n){
                    return factorial;
                }
            }
        return factorial;
    }
}
