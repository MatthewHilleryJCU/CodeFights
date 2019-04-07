package com.hillnet;

public class LateRide {

	public int xlateRide(int n) {
		return (n/60)/10 + (n/60)%10 + (n%60)/10+(n%60)%10;
	}
}