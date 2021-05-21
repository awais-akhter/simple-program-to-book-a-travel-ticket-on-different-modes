import java.time.LocalDate;
import java.util.Random;

public class ByTrain extends BasicDetails{
	
	
	public ByTrain() {
		super();
		super.setWeight();
		super.setID();
		printing();
	}
	
	LocalDate date = LocalDate.now();
	Random rand = new Random();
	
	@Override
	public void printing() {
		System.out.println("---------Haramain Western Railway-------\n");
		super.printing();
		System.out.println("\n--------------------------------");
		System.out.println("Gate No." + rand.nextInt(23));
		System.out.println("Train No. " + "JIN-" + rand.nextInt(999));
		System.out.println("Luggage Weight: " + super.weight);
		System.out.println("Luggage Weight: " + super.ID);
		System.out.println("Todays Date " + date);
}
	
}
