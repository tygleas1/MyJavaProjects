import java.util.Scanner;

/*********************************************************************************************
Description: 		The invoice app calculates the discount amount
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
        double discountTotal = 0.0;
        double discountPercent = 0.0;
        double discountAmount = 0;
        double invoiceDiscountTotal = 0.0;
        double subtotal = 0.0;
        int invoiceCount = 0;

        // perform invoice calculations until choice is "n" or "N" 
        String choice = "y";
        String input = sc.nextLine();
        String message = "?";
        
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator Version 1");
        System.out.println();  // print a blank line

        while (!choice.equalsIgnoreCase("n")) {
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");
            input = sc.nextLine();
            subtotal = Double.parseDouble(input);

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
            invoiceTotal = invoiceTotal + invoiceDiscountTotal;
            discountTotal = discountTotal + discountAmount;
            invoiceCount = invoiceCount + 1;  

            // display the discount amount and total
            message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + invoiceDiscountTotal + "\n";            
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        
        // calculate and display invoice count, average invoice, and average discount
        message = "Number of invoices: " + invoiceCount + "\n"
                       + "Average invoice:    " + invoiceTotal / invoiceCount + "\n"
                       + "Average discount:   " + discountTotal / invoiceCount + "\n";
        System.out.println(message);
    }
}