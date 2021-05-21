import java.util.Random;
import java.util.Scanner;


public abstract class BasicDetails implements Baggage {
	
	String name;
	private int CNIC;
	private int seatNumber;
	private int ticketNo;
	private String arrival;
	private String departure;
	int weight;
	int ID;
	
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	
	public BasicDetails() {
		name = "Ali";
		setArrival("Peshawar");
		setDeparture("Lahore");
		setSeatNumber(rand.nextInt(50));
		setTicketNo(rand.nextInt(1234567));
		setCNIC(rand.nextInt(1234567891));
		
	}
	//------------------------Setter & Getters----------------------------
	
	public int getCNIC() {
		return CNIC;
	}
	public void setCNIC(int cNIC) {
		CNIC = cNIC;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	
	
	//--------------------------METHODS-----------------------
	

	
	public void setWeight() {
		System.out.println("Enter Luggage Weight: (If not applicable write 0) ");
		weight = input.nextInt();	
	}
	public void setID() {
		ID = rand.nextInt(5000);
	}
	
	public void printing() {
		System.out.println("Name: " + name);
		System.out.println("CNIC: " + getCNIC());
		System.out.println("Arrival: " + getArrival());
		System.out.println("Departure: " + getDeparture());
		System.out.println("Ticket No. " + getTicketNo());
		System.out.println("Seat No. " + getSeatNumber());
	}
}
