import java.util.Scanner;

public class Addressbook extends AddressBookOperations {
	public static void main(String[] args) {
		int numOfPerson = 0;
		System.out.println("! Welcome to Address Book !");
		AddressBookOperations Book = new AddressBookOperations();
		boolean flag=true;
		s: while(flag == true) {
			int choice = Book.chooseOption();
			s2: while(true) {
				if(choice == 1) {
					System.out.println("Enter number of Persons to add");
					numOfPerson = new Scanner(System.in).nextInt();
					for(int i =1;i <=numOfPerson;i++) {
						System.out.println("Enter the First name to check");
						String checkname = new Scanner(System.in).nextLine();
						if(Book.add(checkname) == false)
							break s2;
						System.out.println("Enter the First name for Person "+i);
						String first = new Scanner(System.in).nextLine();
						System.out.println("Enter last name for Person "+i);
						String last = new Scanner(System.in).nextLine();
						System.out.println("Enter Address for Person "+i);
						String address = new Scanner(System.in).nextLine();
						System.out.println("Enter city for person "+i);
						String city= new Scanner(System.in).nextLine();
						System.out.println("Enter state for person "+i);
						String state = new Scanner(System.in).nextLine();
						System.out.println("Enter zip for Person "+i);
						String zip = new Scanner(System.in).nextLine();
						System.out.println("Enter Phone number for Person "+i);
						String phoneNumber = new Scanner(System.in).nextLine();
						System.out.println("Enter email for Person "+i);
						String email = new Scanner(System.in).nextLine();
						Contact con = new Contact(first,last,address,city,state,zip,phoneNumber,email);
						list.add(con);
						System.out.println("Added Succesfully");
						}
					break;
				}
				else if(choice == 2){
					Book.view();
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
					if(Book.edit(first,last,address, city,state,zip,phoneNumber,email) == false)	
						break s2;
					else
						System.out.println("Edited Successfully");
					break;
				}
				else if(choice == 4) {
					System.out.println("Enter first name");
					String first = new Scanner(System.in).nextLine();
					System.out.println("Enter last name: ");
					String last = new Scanner(System.in).nextLine();
					if(Book.delete(first,last) == false) {
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
