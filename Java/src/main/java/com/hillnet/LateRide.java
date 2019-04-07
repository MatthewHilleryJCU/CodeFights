package com.fdm.codefights;


public class LateRide {

	public int xlateRide(int n) {
		return (n/60)/10 + (n/60)%10 + (n%60)/10+(n%60)%10;
	}
}