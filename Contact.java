public class Contact {
	
	/*member variables */
	private String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	/*constructor*/
	public Contact(String contactID, String firstName, String lastName, String number, String address) {
		
		if (contactID == null || contactID.length() >10) {
			throw new IllegalArgumentException("Contact ID is invaild, cannot be empty or greater than 10 characters.");
		}
		if (firstName == null || firstName.length()> 10) {
			throw new IllegalArgumentException("First Name is invaild, cannot be empty or greater than 10 characters.");
		}
		if (lastName == null || lastName.length()> 10) {
			throw new IllegalArgumentException("Last Name is invaild, cannot be empty or greater than 10 characters.");
		}
		if (number == null || number.length()> 10) {
			throw new IllegalArgumentException("Number is invaild, cannot be empty or greater than 10 digits.");
		}
		if (address == null || address.length()> 30) {
			throw new IllegalArgumentException("Address is invaild, cannot be empty or greater than 30 characters.");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
	}
	
	/*setters and getters*/
	public String getContactID() {
		return contactID;
	}
	
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	
	public String getFirstName() { 
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contact [" + "Contact ID = " + contactID + ", First Name = " + firstName + ", Last Name = " + lastName + 
				" Number = " + number + ", Address = " + address + "]";
	}
}

