package corejava3pm.controlstatement;

public class Nestedif {
public static void main(String[] args) {
	String citizen="Nepali";
	int age=45;
	String voterid= "no";
	if(citizen.equals("nepali")) {
		if(age>=18) {
		
	}else {
		System.out.println("You can vote");
	
	}
	
	}else {
		System.out.println("You are not Nepali");
	}
}
}
