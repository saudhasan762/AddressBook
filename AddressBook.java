import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
	Scanner scan =new Scanner(System.in);
	public static ArrayList<Contact> list = new ArrayList<>();
	
	public void findAll() {
		if (list.size() == 0) {
			System.out.println("*No student information!!*");
			return;
		} else {
			Iterator<Contact> iter = list.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
			}
		}
	}
	public boolean add(String first) {
		if (list.size() == 0) {
			return true;
		}
		for (Contact con : list) {
			if (con.getFirstName() == first) {
				System.out.println("*Student ID already exists*");
				return false;
			}
		}
		return true;
	}
	
	public boolean edit(String first, String last, String address, String city, String state,String email, String zip, String phoneNumber ) {
		if (list.size() == 0) {
			return false;
		}
		int count = 0;
		for (Contact con : list) {
			count++;
			if (con.getFirstName() == first) {
				con.setAddress(address);
				con.setcity(city);
				con.setState(state);
				con.setzip(zip);
				con.setphoneNumber(phoneNumber);
				con.setemail(email);
				//list.set(count-1, con);
				return true;
			}
		}
		if (true) {
			System.out.println("There is no information about the contact in the system!!");
		}
		return false;
	}
	
	public boolean delete(String first) {
		if (list.size() == 0) {
			return false;
		}
		int count=0;
		for (Contact con : list) {
			count++;
			
			if (con.getFirstName() == first) {
				list.remove(count);
				System.out.println("Delete successful");
				return true;
			}
		}
		System.out.println("This student number does not exist!!");
		return true;
	}
	
	int chooseOption() {
		System.out.println("Enter 1 to add contact");
		System.out.println("Enter 2 to view contact");
		System.out.println("Enter 3 to edit contact");
		System.out.println("Enter 4 to edit contact");
		int n = scan.nextInt();
		return n;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		AddressBook Book = new AddressBook();
		boolean flag=true;
		s: while(flag == true) {
			int choice = Book.chooseOption();
			s2: while(true) {
				if(choice == 1) {
					System.out.println("Enter the First name");
					String first = new Scanner(System.in).nextLine();
					if(Book.add(first) == false)
						break s2;
					System.out.println("Enter last name: ");
					String last = new Scanner(System.in).nextLine();
					System.out.println("Enter Address: ");
					String address = new Scanner(System.in).nextLine();
					System.out.println("Enter city: ");
					String city = new Scanner(System.in).nextLine();
					System.out.println("Enter state");
					String state = new Scanner(System.in).nextLine();
					System.out.println("Enter zip");
					String zip = new Scanner(System.in).nextLine();
					System.out.println("Enter Phone number :");
					String phoneNumber = new Scanner(System.in).nextLine();
					System.out.println("Enter email: ");
					String email = new Scanner(System.in).nextLine();
					Contact con = new Contact(first,last, address,city, state,email,zip,phoneNumber );
					list.add(con);
					System.out.println("Added Succesfully");
					break;
				}
				else if(choice == 2){
					Book.findAll();
					break;
				}
				else if(choice == 3) {
					System.out.println("Enter first name: ");
					String first = new Scanner(System.in).nextLine();
					System.out.println("Enter last name: ");
					String last = new Scanner(System.in).nextLine();
					System.out.println("Enter Address: ");
					String address = new Scanner(System.in).nextLine();
					System.out.println("Enter city: ");
					String city = new Scanner(System.in).nextLine();
					System.out.println("Enter state");
					String state = new Scanner(System.in).nextLine();
					System.out.println("Enter zip");
					String zip = new Scanner(System.in).nextLine();
					System.out.println("Enter Phone number :");
					String phoneNumber = new Scanner(System.in).nextLine();
					System.out.println("Enter email: ");
					String email = new Scanner(System.in).nextLine();
					if(Book.edit(first,"","", "","","","","") == false)	
						break s2;
					else
						System.out.println("Added Successfull");
					break;
				}
				else if(choice == 4) {
					System.out.println("Enter the first name");
					String first = new Scanner(System.in).nextLine();
					if(Book.delete(first) == false) {
						break s2;
					}
				    break;
				}
				else if(choice == 0) {
					System.out.println("System Existed");
					System.exit(0);
					break s;
				}
				else
					System.out.println("Invalid choice");
					
			}	
		}
		
	}
}
