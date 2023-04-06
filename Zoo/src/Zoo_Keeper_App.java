import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Zoo_Keeper_App {

	private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.US);

	public Zoo_Keeper_App() {
		// no house keeping items yet...
	}

	public static void main(String[] args) throws Exception {

		try {
			Animal a1 = new Animal();
			Animal a2 = new Animal("12-31-2022", (float) 10.5);

			LocalDate birthdate = LocalDate.parse("11-30-2022", FORMAT);
			Animal a3 = new Animal(birthdate, (float) 5.5);

			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);

			System.out.println();

			System.out.println(a1.getBirthdateStr() + " " + a1.getWeight());
			System.out.println(a2.getBirthdateStr() + " " + a2.getWeight());
			System.out.println(a3.getBirthdateStr() + " " + a3.getWeight());

			a2.setGender("Male");
			a3.setGender(Gender.FEMALE);

			//System.out.println(a2)

		} catch (Exception e) {
			System.out.println("The following error has occurred: ");
			System.out.println(e.getMessage());

		}
	}

}
