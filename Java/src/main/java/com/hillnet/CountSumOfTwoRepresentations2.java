package com.hillnet;

public class CountSumOfTwoRepresentations2 {

    int getcountSumOfTwoRepresentations2(int n, int l, int r) {
        int count = 0;
        while (l <= r) {
            if (n == l + r) {
                count++;
                l++;
                r--;
            } else if (n > l + r) {
                l++;
            } else {
                r--;
            }
        }
        return count;
    }
}
