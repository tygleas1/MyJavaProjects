
public class BankApp {
	public static void main(String[] args) {

		Account debbieAccount = new Account();
		
		debbieAccount.balance = 2000.20;
		
		System.out.println(debbieAccount.number);
		System.out.println(debbieAccount.firstName);
		System.out.println(debbieAccount.lastName);
		System.out.println(debbieAccount.balance);
		
		
		Account tylerAccount = new Account(1000.10, "Tyler", "Gleason");
		
		System.out.println(tylerAccount.number);
		System.out.println(tylerAccount.firstName);
		System.out.println(tylerAccount.lastName);
		System.out.println(tylerAccount.balance);


	}
	
}
