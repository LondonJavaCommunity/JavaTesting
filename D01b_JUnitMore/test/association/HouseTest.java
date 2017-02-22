package association;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class HouseTest {

	House aHouse;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println( "in setUpBeforeClass()" );
	}

	@Before
	public void setUp() throws Exception {
		System.out.println( "in setUp()" );
		aHouse = new House( "Brambles", 4 );
	}

	@After
	public void tearDown() {
		System.out.println( "in tearDown()" ); 	// AVOID prints in Tests, who will read them??!
	}
	
	@AfterClass
	public static void shutdown() {
		System.out.println( "in shutdown()" ); 	// AVOID prints in Tests, who will read them??!
	}
	
	@Test
	public void testAddDoor_tooMany_rejected() {
		try {
			for (int i=0; i<=4; i++) {
				aHouse.addDoor( new Door("Front", i, true));
			}
		}
		catch (IllegalStateException ex) {
			return; // Test passed
		}
		fail("expected IllegalStateException");
	}

	@Test(expected=IllegalStateException.class)
	public void testAddDoor_tooMany_rejected_v2() {
		for (int i=0; i<=4; i++) {
			aHouse.addDoor( new Door("Front", i, true));
		}
	}
	
}
