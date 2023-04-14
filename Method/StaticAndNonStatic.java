package Method;

public class StaticAndNonStatic {
	//Static(Variable,Method) --> Static/NonStatic
	//Non Static(Variable,Method)--> Static(with the help of object)/Non Static
	
	//Non Static
	public void sum(int a ,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	
	//Static
	public static void mul(int c ,int d) {
		int mul=c*d;
		System.out.println(mul);
	}
	
	
	//Non Static Method
	public void test() {
		sum(10,20);
		mul(10,20);
	}
	
	//Static Method
	public static void test2() {
		//sum(10,20);//need to make an object for this at first
		StaticAndNonStatic obj=new StaticAndNonStatic();
		obj.sum(10,20);
		mul(10,20);
	}
	
	static {
		System.out.println("I am a Block");
		System.out.println("I will execute before main method");
	}
	
	
	public static void main(String[]args) {
		System.out.println("I am a method");
		
		System.out.println("Static Method Data:");
		StaticAndNonStatic t=new StaticAndNonStatic();
		t.test();
		
	
		System.out.println("Non Static Method Data:");
		
		test2();
		
		
	}



}
