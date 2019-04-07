package com.fdm.codefights;

public class MaxMultiple {
	public int findMaxMultiple(int divisor, int bound) {

		int i = 1;
		int x = 0;

		while (i <= bound) {
			if (i % divisor == 0) {
				x = i;
			}i++;
		}return x;
		
//		return bound/divisor*divisor;   //Also Works
	}
}
