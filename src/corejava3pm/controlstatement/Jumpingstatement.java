package corejava3pm.controlstatement;

public class Jumpingstatement {
	/*
	 * a>break; =>exit from loop (it applies only inside loop)
	 * b>continue;=>skip values (it applies only inside loop)
	 * c>return;=>exit from method (it only focus in method)
	 */
public static void main(String[] args) {
	for(int i=1; i<=10; i++) {
		if(i==5) {
			return;
}
	System.out.println(i);
}
	System.out.println("end for loop");
}
}
