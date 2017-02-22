package exercise03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	Person aPerson;
	Cat aCat;

	@Before
	public void setUp() throws Exception {
		aPerson = new Person( "Mike", 21, 5.7 );
		aCat = new Cat( "Millie", 4 );
	}

	@Test
	public void testAddCat_retrieveSameCat() {
		aPerson.addCat( aCat );
		Cat fetchedCat= aPerson.getCat(0);
		assertEquals( aCat,  fetchedCat );
		// Shouldn't have more that 1 assertion in each test, but this sets up a good case for later allOf() test:
		assertSame(aCat, fetchedCat);
	}

	@Test(expected=TooManyCatsException.class)
	public void testAddTooManyCatsThrows() {
		for (int i=0; i<4; i++) {
			aPerson.addCat( aCat );
		}
	}
}
