import java.util.ArrayList;

public class ContactService {
	
	/* where the contact are stored*/
	private ArrayList<Contact> contacts;
	
	/*default constructor*/
	public ContactService() { 
		contacts = new ArrayList<>();
	}
	
	/*Adding a contact*/
	public boolean add(Contact contact) {
		/*Checking to see if this person is already in the contact list*/
		boolean alreadyPresent = false;
		for (Contact c : contacts) {
			if (c.equals(contact)) {
				alreadyPresent = true;
			}
		}
		
		/*If there is no duplicate then add the contact*/
		if (!alreadyPresent) {
			contacts.add(contact);
			System.out.println("Contact Added Sucessfully!");
			return true;
		}
		else {
			System.out.println("Contact already added");
			return false;
		}
	}
	
	/*removing a contact by contactID*/
	public boolean remove(String contactID) {
		for(Contact c : contacts) {
			if (c.getContactID().equals(contactID)) {
				contacts.remove(c);
				System.out.println("Contact successfully removed!");
				return true;
			}
		}
		System.out.println("Contact not found. Please try again.");
		return false;
	}
	
	/*updating the contact information by the given contactID of the person.*/
	public boolean update(String contactID, String firstName, String lastName, String number, String address) {
		for (Contact c : contacts) {
			if (c.getContactID().equals(contactID)) {
				if (!firstName.equals("")) {
					c.setFirstName(firstName);
				}
				if (!lastName.equals("")) {
					c.setLastName(lastName);
				}
				if (!number.equals("")) {
					c.setNumber(number);
				}
				if (!address.equals("")) {
					c.setAddress(address);
				}
				System.out.println("Contact successfully updated!");
				return true;
			}
		}
		System.out.println("Contact does not exist.");
		return false;
	}
}
