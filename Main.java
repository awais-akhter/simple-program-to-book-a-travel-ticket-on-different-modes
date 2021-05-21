import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		BasicDetails air;
		BasicDetails bus;
		BasicDetails train;
		
		String mode = null;
		int choice;
		Scanner input = new Scanner(System.in);
		
		
			System.out.println("Select Mode of Travel: \n1. Bus\n2. Train\n3. Air");
			choice = input.nextInt();
			if (choice == 1) {
				mode = "Bus";
			}else if (choice == 2) {
				mode = "Train";
			}else if (choice == 3) {
				mode = "Air";
			}
		
		
			if (mode.equals("Air")) {
				air = new ByAir();
			}else if (mode.equals("Train")) {
				train = new ByTrain();
			}else if (mode.equals("Bus")) {
				bus = new ByBus();
			}
			
			System.out.println("Mode of Travel: " + mode);
	}

}
