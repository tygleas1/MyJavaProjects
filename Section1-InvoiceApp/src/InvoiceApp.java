import java.util.Scanner;

/*********************************************************************************************
Description: 		This invoice app calculates the discount amount.
Programmer’s name: 	Tyler Gleason
Date Written: 		2023.01.27
GitHub: 			https://github.com/tygleas1/MyJavaProjects/tree/main/Section1-InvoiceApp
 *********************************************************************************************/
public class InvoiceApp {

	public static void main(String[] args) {

		// create a Scanner object named sc
		Scanner sc = new Scanner(System.in);

		// initialize variables for use in calculating averages
		double invoiceTotal = 0.0;
		double discountAmount = 0;
		double discountPercent = 0.0;
		double discountTotal = 0.0;
		double invoiceDiscountTotal = 0.0;
		double subtotal = 0.0;

		int invoiceCount = 0;
		int numLineItems = 0;

		// perform invoice calculations until choice is "n" or "N" 
		String choice = "y"; // perform invoice calculations until choice is "n" or "N"
		String message = "?";

		// welcome the user to the program
		System.out.println("==========================================");
		System.out.println("Welcome to the Invoice Total Calculator v2");
		System.out.println("==========================================");
		System.out.println();  // print a blank line


		while (!choice.equalsIgnoreCase("n")) {

			// get the number of line items from the user
			System.out.print("Enter the number of line items:   ");
			numLineItems = sc.nextInt();
			System.out.println();
			System.out.println("==========================================");
			System.out.println();

			for (int i = 1; i <= numLineItems; i++) {
				System.out.print("Enter #" + i + " line item amount: ");
				subtotal += sc.nextDouble();
			}

			System.out.println();    
			System.out.println("==========================================");
			System.out.println();

			// calculate the discount amount and total
			if (subtotal >= 500) {
				discountPercent = .25;
			} else if (subtotal >= 200) {
				discountPercent = .2;
			} else if (subtotal >= 100) {
				discountPercent = .1;
			} else {
				discountPercent = 0.0;
			}
			
			discountAmount = subtotal * discountPercent;
			invoiceDiscountTotal = subtotal - discountAmount;

			// accumulate the invoice count and invoice total
			invoiceTotal += invoiceDiscountTotal;
			discountTotal += discountAmount;
			invoiceCount++;  

			// display the discount amount and total
			// better is to use printf
			/*
            message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + invoiceDiscountTotal + "\n";            
            System.out.println(message);
			 */

			System.out.println();
			System.out.printf("%20s: %,10.2f\n", "Subtotal", subtotal);
			System.out.printf("%20s: %,10.2f\n", "Discount percent", discountPercent);
			System.out.printf("%20s: %,10.2f\n", "Discount amount", discountAmount);
			System.out.printf("%20s: %,10.2f\n", "Invoice total", invoiceDiscountTotal);

			sc.nextLine(); // empty the input buffer getting rid of the leftover return character

			// see if the user wants to continue
			System.out.println();
			System.out.println("==========================================");
			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
			System.out.println("==========================================");
			System.out.println();
		}

		// calculate and display invoice count, average invoice, and average discount
		// better way is to use printf
		/*
        message = "Number of invoices: " + invoiceCount + "\n"
                       + "Average invoice:    " + invoiceTotal / invoiceCount + "\n"
                       + "Average discount:   " + discountTotal / invoiceCount + "\n";
        System.out.println(message);
		 */


		System.out.printf("%20s: %,10.2f\n", "Number of invoices", invoiceCount);
		System.out.printf("%20s: %,10.2f\n", "Average invoice", invoiceTotal / invoiceCount);
		System.out.printf("%20s: %,10.2f\n", "Average discount", discountTotal / invoiceCount);

		//System.out.print();

		sc.close();
	} // end of main
} // end of InvoiceApp class