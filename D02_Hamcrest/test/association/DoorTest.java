package association;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DoorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDoorIsAvalidThickness() {
		Door aDoor = new Door( "Tester", 15, true );
		assertThat( aDoor.getThickness(), anyOf(equalTo(5), equalTo(10), equalTo(15)) );
	}

}
