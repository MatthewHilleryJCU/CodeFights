package com.fdm.codefights;

public class PhoneCall {

	public int findTime(int min1, int min2_10, int min11, int s) {

		int x = 0;

		while (s > 0) {
			if (x < 1) {
				x = x + 1;
				s = s - min1;
			}
			if (x < 11) {
				s = s - min2_10;
				x = x + 1;
			}
			if (x > 10) {
				x = x + 1;
				s = s - min11;

			}
			return x;
		}
		return x;
	}
}
