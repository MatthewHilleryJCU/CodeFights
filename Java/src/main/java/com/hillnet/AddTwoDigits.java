package com.hillnet;

public class AddTwoDigits {

	public int sumTwoDigits(int j) {
		
		
        int sum = 0;
        while (j > 0) {
            sum = sum + j % 10;
            j = j / 10;
        }
        return sum;
	}
}
