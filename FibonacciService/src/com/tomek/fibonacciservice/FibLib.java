package com.tomek.fibonacciservice;


public class FibLib {
	
	public long fibJ(long n)
	{
		if(n==0) return 0;
		if(n==1) return 1;
		return fibJ(n-1)+fibJ(n-2);	
	}
	
	public native static long fibN(long n);

}
