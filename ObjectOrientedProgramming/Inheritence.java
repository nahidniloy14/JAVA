package ObjectOrientedProgramming;

import Method.StaticAndNonStatic;

public class Inheritence extends Method.StaticAndNonStatic{

	public static void main(String[] args) {
		mul(10,20);
		
		//We can create an object of  a child class to call static/non static method 
		Inheritence i=new Inheritence();
		i.sum(30, 20);
		
		//Or We can create an object of  a parent class to call static/non static method
		StaticAndNonStatic iobj=new StaticAndNonStatic();
		iobj.sum(10,20);

	}

}
