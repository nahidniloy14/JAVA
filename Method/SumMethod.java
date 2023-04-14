package Method;

import java.util.Scanner;

public class SumMethod {
	public void sum(int a, int b) {
		int sum=a+b;
		System.out.println("Summation of the numbers are "+sum);
		}

	public static void main(String[] args) {
		SumMethod s=new SumMethod();
		s.sum(36,63);
		s.sum(86,81);
		s.sum(96,62);

		
	}

}
