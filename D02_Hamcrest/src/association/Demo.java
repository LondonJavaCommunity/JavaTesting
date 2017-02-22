/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package association;

/**
 *  Section 3. Association
 */
public class Demo {

	public static void main(String[] args) {

		House h= new House( "Gables", 7 );
		System.out.println( h );


		// 1. House has a Door (or more)
		Door front= new Door( "Front", 82, true );
		System.out.println( front );
		h.addDoor( front );
		h.addDoor( new Door( "Back", 72, false) );
		System.out.println( h );	/* Dont expose / leak doors[] */


		// Slide: Design considerations: 
		// Custody: Who creates, owns, moves, removes the Door 
		//  What if I add my Door to your House?
		// Can 2 houses share same door (adjoining?) or might need methods to
		//  .removeDoor() .moveDoorNumber( 2, h2 )

	}

}
