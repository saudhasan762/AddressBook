import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
	private String first;
	private String last;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;
	static ArrayList<String> information = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	
	public AddressBook(String first, String last, String address, String city, String state,String email, String zip, String phoneNumber ){
		this.first = first;
		this.last = last;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	void displayContacts() {
//		System.out.println("Contact" +contacts[i]);
		System.out.println("First name is: "+first);
		System.out.println("Last name is: "+last);
		System.out.println("Address is: "+address);
		System.out.println("City is: "+city);
		System.out.println("State is: "+state);
		System.out.println("zip is: "+zip);
		System.out.println("Phone number: "+phoneNumber);
		System.out.println("Email is: "+email);	
	}
	void getAddress() {
		System.out.println("Enter first name");
		first = scan.nextLine();
		System.out.println("Enter last name");
		last = scan.nextLine();
		System.out.println("Enter the address");
		address = scan.nextLine();
		System.out.println("Enter the city");
		city = scan.nextLine();
		System.out.println("Enter the state");
		state = scan.nextLine();
		System.out.println("Enter the email");
		email = scan.nextLine();
		System.out.println("Enter the zip");
		zip = scan.nextLine();
		System.out.println("Enter the phone number");
		phoneNumber = scan.nextLine();
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		AddressBook Book = new AddressBook("","","","","","","","");
		Book.getAddress();
		Book.displayContacts();
	}
}