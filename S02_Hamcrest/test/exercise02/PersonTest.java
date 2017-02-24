package exercise02;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exercise02.Cat;
import exercise02.Person;
import exercise02.TooManyCatsException;

public class PersonTest {

	Person aPerson;
	Cat aCat;

	@Before
	public void setUp() throws Exception {
		aPerson = new Person( "Mike", 21, 5.7 );
		aCat = new Cat( "Millie", 4 );
	}

	@Test(expected=TooManyCatsException.class)
	public void testAddTooManyCatsThrows() {
		for (int i=0; i<4; i++) {
			aPerson.addCat( aCat );
		}
	}

	@Test
	public void testAddCat_retrieveSameCat() {
		aPerson.addCat( aCat );
		Cat fetchedCat= aPerson.getCat(0);
		assertEquals( aCat,  fetchedCat );
		// Shouldn't have more that 1 assertion in each test, but this sets up a good case for later allOf() test:
		assertSame( aCat, fetchedCat );
	}

	@Test
	public void testAddCat_retrieveSameCat_hamcrest() {
		aPerson.addCat( aCat );
		Cat fetchedCat= aPerson.getCat(0);
		assertThat ( fetchedCat, allOf(equalTo(aCat), sameInstance(aCat)) );
	}

	@Test
	public void testAddCat_retrieveSameCat_hamcrest2() {
		aPerson.addCat( aCat );	// To check it still passes, even using CopyCat
		Cat aCatCopy = new Cat( "Millie", 4 );
		Cat fetchedCat= aPerson.getCat(0);
		assertThat ( fetchedCat, allOf(equalTo(aCat), sameInstance(aCat)) );
//		assertThat ( fetchedCat, allOf(equalTo(aCatCopy), sameInstance(aCatCopy)) );	// But this would fail.
	}
	
}
