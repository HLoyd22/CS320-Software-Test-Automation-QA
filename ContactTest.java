import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	//test ContactID
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("22H03K091711","Joe","Coffee","1015550309","22 W Claw St Hogwarts WA 50576");
		});
	}
	
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact(null, "Joe","Coffee", "1015550309", "22 W Claw St Hogwarts WA 50576");
		});
	}
	
	/*Test First Name*/
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("22H03K0917","Joesph Anthony","Coffee", "1015550309","22 W Claw St Hogwarts WA 50576");
		});
	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("22H03K0917",null,"Coffee", "1015550309","22 W Claw St Hogwarts WA 50576");
		});
	}
	
	//test Last Name
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("22H03K0917","Joe","Coffee Creamer", "1015550309","22 W Claw St Hogwarts WA 50576");
		});
	}
	
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("22H03K0917","Joe", null, "1015550309","22 W Claw St Hogwarts WA 50576");
		});
	}
	
	//Test Number
	@Test
	void testNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("22H03K0917","Joe","Coffee", "101555030922","22 W Claw St Hogwarts WA 50576");
		});
	}
	@Test
	void testNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("22H03K0917","Joe","Coffee", null,"22 W Claw St Hogwarts WA 50576");
		});
	}
	
	//Test Address
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("22H03K0917","Joe","Coffee", "1015550309","22 West Claw St Hogwarts WA 50576");
		});
	}
	
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("22H03K0917","Joe","Coffee", "1015550309", null);
		});
	}

}

