import java.util.Scanner;

public class Calculator {
	
	public int add(int a, int b) {
		return a+b; //this return the sum of a+b to the int add()
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;   //this return the sum of a+b+c to the int add()
		                 // the concept of method overloading are in use here
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator Calc = new Calculator();
		
		System.out.print("Enter the two integers : ");
		int int1 = sc.nextInt();
		int int2 = sc.nextInt();
		int sum1 = Calc.add(int1, int2);
		System.out.println("The sum of two integers : " + sum1);
		
		System.out.println("Enter the three integers values : ");
		int int3 = sc.nextInt();
		int int4= sc.nextInt();
		int int5= sc.nextInt();
		int sum2 = Calc.add(int3, int4, int5);
		System.out.println("The sum of three integers =  " +  sum2);
		
		System.out.println("Enter the two numbers : ");
		double double1 = sc.nextDouble();
		double double2 = sc.nextDouble();
		double sum3 = sc.nextDouble();
		System.out.println("The sum of two number : " +sum3 );
		
		

	}

}
