import java.time.LocalDate;
import java.util.Date;

public class Zoo_Keeper_App {

	public Zoo_Keeper_App() {
		// no housekeeping items yet...
	}

	public static void main(String[] args) throws Exception {

		try {
			Animal a1 = new Animal();
			Animal a2 = new Animal("12-31-2022", (float) 10.5);
			// Animal a3 = new Animal(Date.parse("2018-05-05"), (float) 5.5);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
