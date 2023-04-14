package Java.JavaBasic.ConditionalStatements;
import java.util.*;

public class CompareString {
	public static void main(String[]args) {
		System.out.print("Enter 1st String : ");
		Scanner input=new Scanner(System.in); 
		String name1=input.nextLine();
		System.out.print("Enter 2nd String : ");
		String name2=input.nextLine();
		
		if(name1.equals(name2)) {
			System.out.println("String matched");
		}
		
		else {
			System.out.println("String is not matched");
		}
		
		if(name1.equalsIgnoreCase(name2)) {
			System.out.println("String matched");
		}
		
		else {
			System.out.println("String is not matched");
		}
		
		if(name1.contains(name2)) {
			System.out.println("String matched");
		}
		
		else {
			System.out.println("String is not matched");
		}
		
		
	}

}

//Enter 1st String : Niloy
//Enter 2nd String : niloy
//String is not matched
//String matched
//String is not matched

