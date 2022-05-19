package Javaassignment;
import java.util.Scanner;

public class Evenoroddnumber {
	public static void main(String[] args) {
		int i=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a number");
		i=sc.nextInt();
		
        if(i % 2 == 0) {
		
        	System.out.println("It is a even number");
        }
        else {
        	System.out.println("It is a odd number");
        	
        }
	}
	

}