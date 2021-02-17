import java.util.Iterator;
import java.util.Scanner;
public class AddressBookOperations implements Compute {
	Scanner scan =new Scanner(System.in);
	
	public void view() {
		if (list.size() == 0) {
			System.out.println("*No contact information!!*");
			return;
		} else {
			Iterator<Contact> iter = list.iterator();
			while (iter.hasNext()) 
				System.out.println(iter.next());}
	}
	
	public boolean add(String checkname) {
		String check=checkname;
		if (list.size() == 0)
			return true;
		for (Contact con : list) {
			if (con.getFirstName().equals(check)) {
				System.out.println("Contact with same name already exists*");
				return false;
			}
		}
		return true;
	}
	
	public boolean edit(String first, String last, String address, String city, String state,String email, String zip, String phoneNumber ) {
		if (list.size() == 0)
			return false;
		int count = 0;
		for (Contact con : list) {
			count++;
			if (con.getFirstName().equals(first) && con.getLastName().equals(last)) {
				con.setAddress(address);
				con.setcity(city);
				con.setState(state);
				con.setzip(zip);
				con.setphoneNumber(phoneNumber);
				con.setemail(email);
				list.set(count-1, con);
				return true;
			}
		}
		if (true)
			System.out.println("There is no information about the contact in the system!!");
		return false;
	}
	public boolean delete(String first,String last) {
		if (list.size() == 0)
			return false;	
		int count=0;
		for (Contact con : list) {
			count++;
			if (con.getFirstName().equals(first) && con.getLastName().equals(last)) {
				list.remove(count - 1);
				System.out.println("Deleted successful");
				return true;
			}
		}
		System.out.println("This contact number does not exist!!");
		return true;
	}
	
	
	int chooseOption() {
		System.out.println("Enter 1 to add contact");
		System.out.println("Enter 2 to view contact");
		System.out.println("Enter 3 to edit contact");
		System.out.println("Enter 4 to delete contact");
		System.out.println("Enter 0 to abort!");
		int n = scan.nextInt();
		return n;
	}
	
	
	
	
}
