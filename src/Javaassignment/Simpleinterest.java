package Javaassignment;

import java.util.Scanner;

public class Simpleinterest {
public static void main(String[] args) {
	int p,t,r,SI;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of p");
	p=sc.nextInt();
	System.out.println("Enter the value of t");
	t=sc.nextInt();
	System.out.println("Enter the value of r");
	r=sc.nextInt();
	if (p!=0) {
		SI=p*t*r/100;
		System.out.println("SI="+SI);
	}
}

}
