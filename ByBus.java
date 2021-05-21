import java.time.LocalDate;
import java.util.Random;

public class ByBus extends BasicDetails{
	
	
	public ByBus() {
		super();
		super.setWeight();
		super.setID();
		printing();
	}
	
	LocalDate date = LocalDate.now();
	Random rand = new Random();
	
	@Override
	public void printing() {
		System.out.println("---------COMSATS TRAVELS SERVICE-------\n");
		super.printing();
		System.out.println("\n--------------------------------");
		System.out.println("Bus No. " + "LXY-" + rand.nextInt(21) + "-" + rand.nextInt(9999));
		System.out.println("Luggage Weight: " + super.weight);
		System.out.println("Luggage Weight: " + super.ID);
		System.out.println("Todays Date " + date);
}

}
