import static org.junit.Assert.*;
import org.junit.Test;

/*This will help in test ContactService class*/
public class ContactServiceTest {
	
	/*Testing the add method when it should work*/
	@Test
	public void testMethodAddPass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("22B07F6", "Harry", "Williams", "1015559977", "11 W Grif St Hogwarts WA 50576");
		Contact c2 = new Contact("37D14G7", "Bob", "Truman", "1015556173", "32 E Ball Rd Hogwarts WA 50576");
		Contact c3 = new Contact("25C51F4", "Darla", "Fish", "1015553287", "49 N Park Dr Hogwarts WA 50576");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
	}
	
	/*Testing the add method when it should not work*/
	@Test
	public void testMethodAddFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("22B07F6", "Harry", "Williams", "1015559977", "11 W Grif St Hogwarts WA 50576");
		Contact c2 = new Contact("37D14G7", "Bob", "Truman", "1015556173", "32 E Ball Rd Hogwarts WA 50576");
		Contact c3 = new Contact("25C51F4", "Darla", "Fish", "1015553287", "49 N Park Dr Hogwarts WA 50576");
		assertEquals(true, cs.add(c1));
		assertEquals(false, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
	}
	
	/*Testing the add method when it should not work*/
	@Test
	public void testMethodDeletePass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("22B07F6", "Harry", "Williams", "1015559977", "11 W Grif St Hogwarts WA 50576");
		Contact c2 = new Contact("37D14G7", "Bob", "Truman", "1015556173", "32 E Ball Rd Hogwarts WA 50576");
		Contact c3 = new Contact("25C51F4", "Darla", "Fish", "1015553287", "49 N Park Dr Hogwarts WA 50576");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		
		assertEquals(true, cs.remove("37D14G7"));
		assertEquals(true, cs.remove("25C51F4"));
	}
	
	@Test
	public void testMethodDeleteFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("22B07F6", "Harry", "Williams", "1015559977", "11 W Grif St Hogwarts WA 50576");
		Contact c2 = new Contact("37D14G7", "Bob", "Truman", "1015556173", "32 E Ball Rd Hogwarts WA 50576");
		Contact c3 = new Contact("25C51F4", "Darla", "Fish", "1015553287", "49 N Park Dr Hogwarts WA 50576");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		
		assertEquals(false, cs.remove("37D14G9"));
		assertEquals(true, cs.remove("25C51F4"));
	}
	
	@Test
	public void testMethodUpdatePass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("22B07F6", "Harry", "Williams", "1015559977", "11 W Grif St Hogwarts WA 50576");
		Contact c2 = new Contact("37D14G7", "Bob", "Truman", "1015556173", "32 E Ball Rd Hogwarts WA 50576");
		Contact c3 = new Contact("25C51F4", "Darla", "Fish", "1015553287", "49 N Park Dr Hogwarts WA 50576");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		
		assertEquals(true, cs.update("22B07F6", "John", "Smith", "1015559977", ""));
		assertEquals(true, cs.update("37D14G7", "Bobby", "Truman", "1015556173", "32 E Ball Rd Hogwarts WA 50576"));
	}
	
	@Test
	public void testMethodUpdateFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("22B07F6", "Harry", "Williams", "1015559977", "11 W Grif St Hogwarts WA 50576");
		Contact c2 = new Contact("37D14G7", "Bob", "Truman", "1015556173", "32 E Ball Rd Hogwarts WA 50576");
		Contact c3 = new Contact("25C51F4", "Darla", "Fish", "1015553287", "49 N Park Dr Hogwarts WA 50576");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		
		assertEquals(false, cs.update("22B07F63", "John", "Smith", "1015559977", ""));
		assertEquals(true, cs.update("37D14G7", "Bobby", "Truman", "1015556173", "32 E Ball Rd Hogwarts WA 50576"));
	}
	
}
