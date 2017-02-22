package association;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class HouseTest {

	House aHouse;

	@Before
	public void setUp() throws Exception {
		aHouse = new House( "Brambles", 4 );
	}

	@After
	public void tearDown() {
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
	
	@Test
	public void testAdd2Doors_CountIsCorrect() {
		aHouse.addDoor( new Door("Front", 5, true) );
		aHouse.addDoor( new Door("Back", 10, true) );
		assertThat( aHouse.getNumDoors(), equalTo(2) );
	}
	
}
