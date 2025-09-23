package com.p1;

public class Count {

	public static void main(String[] args) {
		String str="banana";
		char ch='a';
		int count=0;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==ch){
				count++;
			}
			System.out.println("Frequency of="+count);
		}
		// TODO Auto-generated method stub



}
