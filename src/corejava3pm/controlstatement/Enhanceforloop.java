package corejava3pm.controlstatement;

public class Enhanceforloop {
	/*
	 * ==Enhance For Loop==
	 * use to read date from collection
	 * syntax:
	 * for(data_type var : collection){
	 *   //statements
	 *   
	 */
	public static void main(String[] args) {
		int date[]= {29,37,49,58,74,87,5,68,76,52,34}; 
		int s=0;
		for(int x:date) {
			System.out.println(x);
			s+=x;
		}

		System.out.println("Total = "+s);
	}
	
}
