// Class used to create Account objects
/** 
 * // Class used to create Account objects
 * 
 * @author tygleas1
 * @version beta 0.0
 * @since 2023.02.10
 */
public class Account {
	
	/**
	 * the last account number used
	 * this is a class-level field-shared across all accounts
	 */
	private static int lastNumber = 0;
	
	// instance level fields - unique per account
	// a field can also be called attribute or property
	
	/**
	 * the unique account number assigned by the default constructor
	 */
	private int number;
	private String firstName;
	private String lastName;
	private double balance;
	
	/**
	 * The default constructpr sets a unique account number based on the last
	 * account number and also sets the initial values for instance level field
	 * Default constructor that will return a unique account object
	 */
	public Account() {
		System.out.println("Default constructor");
		
		this.number = ++Account.lastNumber;
		this.balance = 0;
		this.firstName = "Unknown";
		this.lastName = "Unknown";
	} // end of default

	/**
	 * The overload constructor calls the default constructor
	 * and then allows overriding the default values
	 * overload constructor that allows setting the object's fields
	 * @param firstName the account owner's first
	 * @param lastName  the account owner's last name
	 * @param balance   the account balance
	 */
	public Account(String firstName, String lastName, double balance) {
		this(); // call the default constructor
		
		// can not run this before calling default constructor
		System.out.println("Overload constructor");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	} // end of overload constructor
	
	/**
	 * Allow retrieval of the account number
	 * @return the account number
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Allow setting the account owner's first name but only if it's not blank
	 * @param firstName account owner's first name
	 */
	public void setFirstName(String firstName) {
		
		if (firstName == "")
			System.out.println("Invalid name! Name cannot be blank");
		else
			this.firstName = firstName;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBalance() {
		return balance;
	}
	
	/**
	 * Allow making a deposit for amounts greater than zero
	 * @param amount The amount to add to the balance
	 */
	public void deposit(double amount) {
		if (amount <= 0)
			System.out.println("Invalid amount[" + amount + "] Must be greater than 0");
		else
			this.balance += amount;
	}

	/**
	 * Allow making a deposit for amounts greater than zero
	 * and NOT greater than the account balance
	 * @param amount The amount to reduce from the balance
	 */
	public void withdrawal(double amount) {
		if (amount <= 0)
			System.out.println("Invalid amount[" + amount + "] Must be greater than 0");
		else if (amount > this.balance)
			System.out.println("Invalid amount[" + amount + "] Cannot be greater than balance");
		else
			this.balance += amount;
	}
	
	/**
	 * Allow getting the last account number used
	 * @return The last account number used
	 */
	public static int getLastNumber() {
		return lastNumber;
	}

	
	
	
} // end of Account class
