import java.util.ArrayList;

public interface Compute {
	
	public void view();
	
	public boolean add(String checkname);
		
	public boolean edit(String first, String last, String address, String city, String state,String email, String zip, String phoneNumber );
	
	public boolean delete(String first,String last);

}
