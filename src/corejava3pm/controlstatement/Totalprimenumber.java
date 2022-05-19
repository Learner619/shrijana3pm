package corejava3pm.controlstatement;

public class Totalprimenumber {
	public static void main(String[] args) {
	
	}
		int n=89002;
		int cnt=0;
		boolean isPrime =true;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.println(n+" is prime number");
			
		}else {
			System.out.println(n+" is not prime number");
	}

}
	
