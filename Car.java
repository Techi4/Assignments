import java.util.Scanner;
public class Car {
	private String make;
	private String model;
	private Short year;
	private int price;
	
	public Car(String make, String model, Short year, int price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price =  price;
	}
	
		public void InformationDisplay() {
			System.out.println("Car Information: ");
			System.out.println("Make : "+ make);
			System.out.println("Model : "+ model);
			System.out.println("Year : " + year);
			System.out.println("Price : " + price);
		}
		
		public static void main(String args[]) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the Car details ");
			
			System.out.print("Make : ");
			String make = scanner.nextLine();
			
			System.out.print("Model : ");
			String model = scanner.nextLine();
			
			System.out.print("Year : ");
			Short year = scanner.nextShort();
			
			System.out.print("Price : ");
			int price = scanner.nextInt();
			
			Car cr = new Car(make, model, year, price);
			cr.InformationDisplay();
			
			
		
		}
	
	
}