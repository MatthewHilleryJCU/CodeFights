package com.hillnet;

public class LineUp {
    int getlineUp(String commands) {

        int count = 0;
        boolean facing = true;

        char[] arr = commands.toCharArray();

        for (char k : arr) {
            if (k == 'A' && facing){
                count++;
            }
            else if (k == 'L' || k == 'R'){
                facing = !facing;
                if (facing){
                    count++;
                }
            }
        }
        return count;
    }
}
