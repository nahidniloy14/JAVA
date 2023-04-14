package Java.JavaBasic.ConditionalStatements;
import java.util.*;

public class ComapreNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		int number1=input.nextInt();
		System.out.print("Enter 2nd Number:");
		int number2=input.nextInt();
		
		if(number1>number2) {
			System.out.println(number1+ " is greater than " +number2);
		}
		else if(number2>number1) {
			System.out.println(number2+ " is greater than " +number1);
		}
		else if(number1==number2) {
			System.out.println(number1+" is equal to "+number2);
		}
		else {
			System.out.println("Invalid Input");
		}

	}

}
