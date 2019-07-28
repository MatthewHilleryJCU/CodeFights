package com.hillnet;

public class PhoneCall {

	public static void main(String[] args) {
		PhoneCall pc = new PhoneCall();
		System.out.println(pc.findTime(3, 1, 2, 20));

	}

	public int findTime(int min1, int min2_10, int min11, int s) {

		if (s < min1) {
			return 0;
		}
		s -= min1;
		if (s < min2_10 * 9) {
			return 1 + (s / min2_10);
		}
		s -= min2_10 * 9;
		return 10 + (s / min11);
	}
}