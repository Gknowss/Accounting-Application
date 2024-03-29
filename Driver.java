import java.io.BufferedReader;   
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Driver {

	static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		boolean exit = false;
		
		System.out.print("Welcome to Grade A Accounting");
		
		System.out.println("What would you like? \n" 
				+ "0. Exit Program \n"
				+ "1. Create an Invoice"
				+ "2. Delete an Invoice");
		
		while (!exit) {
			
			System.out.println("\n Select your option: ");

		int user = Integer.parseInt(read.readLine());
		
		switch (user) {
		case 1:
			System.out.println("Enter InvoiceID");
			int id = Integer.parseInt(read.readLine());
			System.out.println("Enter InvoiceID");
			String custid = read.readLine();
			System.out.println("Enter InvoiceID");
			double cost = Double.parseDouble(read.readLine());
			System.out.println("Enter InvoiceID");
			String department = read.readLine();
			System.out.println("Enter InvoiceID");
			String cashier = read.readLine();
			Invoice invoice = new Invoice(id, custid, cost, department, cashier);
			
		case 2:
			// Somewhere in this, make JavaFX work
			UserCreate userCreation = new UserCreate(null,null);
			userCreation.makeUser("Dude", "Guy");
		case 0:
			exit = true;
			System.out.println("Ending Program");
			break;
		default:
			System.out.println("Not a valid input");
			break;
		}
		
	}

}
}

/*
Example for JavaFX

User create button click
upon doing, make a new screen
Connect that to userCreation class, make a new user


*/
