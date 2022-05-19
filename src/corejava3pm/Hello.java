package corejava3pm;

public class Hello {
	/*static manages memory & we don't have to use objective to use class
	 * void is written type
	 * main method is called by JVM
	 * JVM 
	 */
	/*a> public   : access everywhere
	 *b> protected: access in same class, same package, child class in different package
	 *c> default (package private): access in same class and same package only
	 *d> private  : access in same class only
	 */
	static public void main(String[] args) {
		//...vary argument
		//command line argument
		//sysout+ctrl+space
		//args is a variable   
		System.out.println("Hello Java");
	}

}
