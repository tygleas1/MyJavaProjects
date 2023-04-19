package zoo.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import zoo.animal.*;

public class Zoo_Keeper_App {

	/**
	 * 
	 */
	private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.US);

	/**
	 * 
	 */
	private static List<Animal> animals = new ArrayList<Animal>();

	/**
	 * 
	 */
	public Zoo_Keeper_App() {
		// no house keeping items yet...
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		try {

			/*
			 * Animal a1 = new Animal(); Animal a2 = new Animal("12-31-2022", (float) 10.5);
			 * 
			 * LocalDate birthdate = LocalDate.parse("11-30-2022", FORMAT); Animal a3 = new
			 * Animal(birthdate, (float) 5.5);
			 * 
			 * System.out.println(a1); System.out.println(a2); System.out.println(a3);
			 * 
			 * System.out.println();
			 * 
			 * System.out.println(a1.getBirthdateStr() + " " + a1.getWeight());
			 * System.out.println(a2.getBirthdateStr() + " " + a2.getWeight());
			 * System.out.println(a3.getBirthdateStr() + " " + a3.getWeight());
			 * a2.setGender("Male"); a3.setGender(Gender.FEMALE);
			 * 
			 * System.out.println(a2.getGender()); System.out.println(a3.getGender());
			 */

			/*
			 * Bird b1 = new Bird(); Bird b2 = new Bird("12-31-2022", (float) 10.5); Bird b3
			 * = new Bird("12-31-2022", (float) 10.5, (float) 2.2);
			 * 
			 * System.out.println(b1); System.out.println(b2); System.out.println(b3);
			 * 
			 * b3.setWingspan((float) 5.5); System.out.println(b3.getWingspan());
			 * 
			 * /* no longer access protected fields in a different package b3.gender =
			 * Gender.MALE; System.out.println(b3.gender);
			 */

			Chicken c1 = new Chicken();
			Chicken c2 = new Chicken("12-31-2022", (float) 10.5);
			Chicken c3 = new Chicken("12-31-2022", (float) 10.5, (float) 2.2);

			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);

			c3.setWingspan((float) 5.5);
			System.out.println(c3.getWingspan());

			Sparrow s1 = new Sparrow();
			Sparrow s2 = new Sparrow("12-31-2022", (float) 10.5);
			Sparrow s3 = new Sparrow("12-31-2022", (float) 10.5, (float) 2.2);

			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);

			s3.setWingspan((float) 5.5);
			System.out.println(s3.getWingspan());

			/*
			 * Fish f1 = new Fish(); Fish f2 = new Fish("12-31-2022", (float) 10.5); Fish f3
			 * = new Fish("12-31-2022", (float) 10.5, Water.FRESH);
			 * 
			 * System.out.println(f1); System.out.println(f2); System.out.println(f3);
			 */

			Guppy g1 = new Guppy();
			Guppy g2 = new Guppy("12-31-2022", (float) 10.5);
			Guppy g3 = new Guppy("12-31-2022", (float) 10.5, "salt");

			System.out.println(g1);
			System.out.println(g2);
			System.out.println(g3);

			FlyingFish ff1 = new FlyingFish();
			FlyingFish ff2 = new FlyingFish("12-31-2022", (float) 10.5);
			FlyingFish ff3 = new FlyingFish("12-31-2022", (float) 10.5, Water.SALT);

			System.out.println(ff1);
			System.out.println(ff2);
			System.out.println(ff3);

			/*
			 * animals.add(a1); animals.add(a2); animals.add(a3);
			 */

			animals.add(c1);
			animals.add(c2);
			animals.add(c3);

			animals.add(s1);
			animals.add(s2);
			animals.add(s3);

			/*
			 * animals.add(f1); animals.add(f2); animals.add(f3);
			 */

			animals.add(g1);
			animals.add(g2);
			animals.add(g3);

			animals.add(ff1);
			animals.add(ff2);
			animals.add(ff3);

			System.out.println(animals.get(11));

			FlyingFish myFish = (FlyingFish) animals.get(11);
			System.out.println(myFish.getWater());

			myFish.propel();

		} catch (Exception e) {
			System.out.println("The following error has occurred: ");
			System.out.println(e.getMessage());

		}
	}

}
