package org.git;

public class Swap {
	public static void main(String[] args) {
		String s="nilani";
		String s1="manju";
		
		System.out.println("before swapping:"+s);
		System.out.println("before swapping:"+s1);
		
		s=s+s1;
		
		s1=s.substring(0, s.length()-s1.length());
		s=s.substring(s1.length());
		
		System.out.println("after swapping:"+s);
		System.out.println("after swapping:"+s1);
	}

}
