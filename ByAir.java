import java.util.Random;
import java.time.LocalDate;


public class ByAir extends BasicDetails {
	
	public ByAir() {
		super();
		super.setWeight();
		super.setID();
		printing();
	}
	
	LocalDate date = LocalDate.now();
	Random rand = new Random();
	
	@Override
	public void printing() {
		System.out.println("---------TURKISH AIRLINES-------\n");
		super.printing();
		System.out.println("\n--------------------------------");
		System.out.println("Gate No." + rand.nextInt(12));
		System.out.println("Flight No. " + rand.nextInt(15));
		System.out.println("Luggage Weight: " + super.weight);
		System.out.println("Luggage Weight: " + super.ID);
		System.out.println("Todays Date " + date);
}
}