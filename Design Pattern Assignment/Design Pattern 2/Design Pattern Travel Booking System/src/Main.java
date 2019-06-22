import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int choice = 1;
		while(choice == 1)
		{
			Journey journey = new Journey();
			System.out.println(new String(new char[50]).replace('\0', '*'));
			System.out.println(new String(new char[50]).replace('\0', '*'));
			System.out.println("Welcome to XYZ Travel Booking System");
			System.out.println();
			System.out.println("Enter user name: ");
			journey.setName(scan.nextLine());
			System.out.println();
			System.out.println("Enter password: ");
			journey.setPwd(scan.nextLine());
			System.out.println();
			System.out.println("Enter source city: ");
			journey.setSrc(scan.nextLine());
			System.out.println();
			System.out.println("Enter destination city: ");
			journey.setDest(scan.nextLine());
			System.out.println();
			System.out.println("Enter day of journey(dd/mm/yyyy): ");
			journey.setDay(scan.nextLine());
			System.out.println();
			System.out.println(new String(new char[50]).replace('\0', '-'));
			System.out.println("Choose your mode of travel: ");
			System.out.println("1. Car");
			System.out.println("2. Bus");
			System.out.println("3. Train");
			System.out.println("4. Flight");
			System.out.println("5. Cruise Ship");
			int i = scan.nextInt();
			switch(i) {
			case 1: 
				journey.setVehicle(new Car());
				break;
			case 2:	
				journey.setVehicle(new Bus());
				break;
			case 3:	
				journey.setVehicle(new Train());
				break;	
			case 4:	
				journey.setVehicle(new Flight());
				break;
			case 5:	
				journey.setVehicle(new Ship());
				break;
			default:
				journey.setVehicle(new Car());
				break;
			}
			System.out.println();
			System.out.println(new String(new char[50]).replace('\0', '-'));
			System.out.println("Choose your mode of payment: ");
			System.out.println("1. Netbanking");
			System.out.println("2. E-Wallet");
			System.out.println("3. UPI");
			System.out.println("4. Debit/Credit Card");
			i = scan.nextInt();
			System.out.println();
			switch(i)
			{
			case 1:
				journey.setPaymode("Netbanking");
				break;
			case 2:
				journey.setPaymode("E-Wallet");
				break;
			case 3:
				journey.setPaymode("UPI");
				break;
			case 4:
				journey.setPaymode("Debit/Credit Card");
				break;
			default:
				journey.setPaymode("N/A");
				break;
			}
			System.out.println();
			System.out.println(new String(new char[50]).replace('\0', '*'));
			System.out.println(new String(new char[50]).replace('\0', '*'));
			System.out.println("Ticket Booked!!!");
			System.out.println(new String(new char[50]).replace('\0', '*'));
			System.out.println("Traveller's name : " + journey.name);
			System.out.println("Travelling from : " + journey.src);
			System.out.println("Travelling to : " + journey.dest);
			System.out.println("Date of Journey : " + journey.day);
			System.out.println("Mode of travelling :  " + journey.vName);
			System.out.println("Mode of Payment : " + journey.paymode);
			System.out.println(new String(new char[50]).replace('\0', '*'));	
			System.out.println(new String(new char[50]).replace('\0', '*'));	
			System.out.println();
			System.out.println("Do you want to book another ticket?(y/n)");
			System.out.println("1. Yes");
			System.out.println("2. No");
			choice = scan.nextInt();
		}
		System.out.println(new String(new char[50]).replace('\0', '*'));	
		System.out.println("Thanks for uisng XYX travel booking system!!!");
		System.out.println(new String(new char[50]).replace('\0', '*'));	
	}
}
