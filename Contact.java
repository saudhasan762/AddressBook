import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
	private String first;
	private String last;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;
	
	
	Scanner scan = new Scanner(System.in);
	
	Contact(String first, String last, String address, String city, String state,String email, String zip, String phoneNumber ){
		this.first = first;
		this.last = last;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
		
	}
	public String getFirstName() {
		return first;
	}
	public void setFirstName(String first) {
		this.first=first;
	}
	public String getLastName() {
		return last; 
	}
	public void setLastName(String last) {
		this.last = last;
	}	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city=city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getzip() {
		return zip;
	}
	public void setzip(String zip) {
		this.zip=zip;
	}
	public String getphoneNumber() {
		return phoneNumber;
	}
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String toString() {
		return "Contact [Name: " +this.first +"  Surname: " +this.last+ "  address: " +this.address+"  city: " +this.city+ "  State: " +this.state+ "  Zip: " +this.zip+ "  Phone Number: " +this.phoneNumber+ "  email: " +this.email +"]";
	}
	

}
