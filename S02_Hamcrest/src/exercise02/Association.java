/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package exercise02;

/**
 *  Solution to Exercise 3. Association
 */
public class Association {

	public static void main(String[] args) {

		// 1. Add a Cat class with fields for name and weight, and a .feed( mealSize ) method which increases the Cat's weight
		//    Test by coding: 
		// 	Cat c= new Cat( "Elsa", 4 ); c.eat( 2 );  and display the Cat's details
		Cat c= new Cat( "Elsa", 4 ); 
		c.eat( 2 );
		System.out.println( c );

		// 2. People can own Cats (or is it the other way round?!) 
		//	  So add to the Person class that you coded before (or from exercise 2 solution):
		//	  a field for their Cat (if any) and an .addCat(aCat) method.
		//    Test by adding code like:
		//	me.addCat( c );
		//	syso( me ); 	// Should also display my Cat
		Person me= new Person( "Mike", 21, 5.6);
		me.addCat( c );
		System.out.println( me );

		// 3. Cat food is not cheap, and should be accounted for, so add to the Person class:
		//    a field for the person's bank balance and a .buyCatFood(amount) method
		//    Test by adding code like:
		//	me.buyCatFood( 20 );
		//	me.getCat(0).eat(10);		// Then display me and myCat again
		me.buyCatFood( 20 );
		me.getCat(0).eat(10);		// Then display me and myCat again
		System.out.println( me );

		// 4. If time, allow a Person to own more than one Cat, 
		//	  and add a Person.feedCat(catNumber,mealSize) method, to avoid leaking encapsulation of the Person's Cat

		// 5. If time, explore "navigability". Currently a Person "knows" which is their Cat, 
		//    but a Cat might also need to identify / gain access to their person

	}

}
