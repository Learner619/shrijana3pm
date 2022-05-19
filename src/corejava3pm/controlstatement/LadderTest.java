package corejava3pm.controlstatement;

public class LadderTest {
	/*
	 * ======if-else ladder (else if)======
	 * if(condition-1){
	 * }
	 * else if(condition-3){
	 * }
	 */
public static void main(String[] args) {
	int marks=87;
	if(marks>=90) {
		System.out.println("A+");
	}
	else if(marks>=80) {
		System.out.println("B+");
	}
	else if(marks>=60) {
		System.out.println("B");
	}
}
}
