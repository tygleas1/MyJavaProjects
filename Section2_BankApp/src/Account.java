
public class Account {

	// this is a class-level field - shared across all accounts
	public static int lastNumber = 0;
	
	// instance-level fields - unique per account
	public int number;
	public double balance;
	public String firstName;
	public String lastName;
	
	// this is the default constructor
	public Account() {
		this.number = ++Account.lastNumber;
		this.balance = 0;
		this.firstName = "Unknown";
		this.lastName = "Unknown";
	}
	
	// this is the overload constructor
	public Account(double balance, String firstName, String lastName) {
		this();
		this.balance = balance;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
