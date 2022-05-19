package corejava3pm.controlstatement;

import java.util.Scanner;

public class Ifexample {
	public static void main(String[] args) {
		int principle,t,r,SI;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your principle");
		principle = sc.nextInt();
		System.out.println("Enter your t");
		t = sc.nextInt();
		System.out.println("Enter your r");
		r = sc.nextInt();
		if(principle!=0) {
			SI=principle*t*r/100;
			
			
			System.out.println("SI="+SI);
	
		}
	
	}

}
