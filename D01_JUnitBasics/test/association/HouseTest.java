package association;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class HouseTest {

	@Test
	public void testAddDoor_DoorCountIsCorrect() {
		// Setup
		House aHouse = new House( "Brambles", 4 );
		// Invoke
		aHouse.addDoor( new Door("Front", 5, true) );
		// Verify
		int nDoors= aHouse.getNumDoors();	// Add getter!
		assertEquals(1, nDoors);
	}
	
}
