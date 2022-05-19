package corejava3pm.controlstatement;

public class Methodnoreturntypewithargrument {
	public static void main(String[] args) {
		printTable(8);
		
	}//no return type with arguments
	 static void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"X"+i+"="+(n*i));
		}
	}
	

}
