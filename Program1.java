package com.p1;
import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		float basic,hra,da,gross;
		Scanner sc=new Scanner(System.in);
		basic=sc.nextFloat();
		hra=basic*0.4f;
		da=basic*0.2f;
		gross=basic+hra+da;
		System.out.println("gross salary="+gross);
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
