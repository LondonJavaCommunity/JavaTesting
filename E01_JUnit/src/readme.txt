E01_JUnit - JUnit exercises

1. Open the Person class and add a new JUnit test case which does the following.
Create a Person and a Cat.
Call the Person's addCat() method to add the Cat to the Person, then call the Person's getCat() method to retrieve their first cat. 
Check that the returned cat is a) Equal to the original cat and b) is the same actual instance as the original cat.

2. Declare a new class for TooManyCatsException which should be a subclass of RuntimeException. Consider which constructors to write.
Add a test to your PersonTest class which tries to add more than 3 Cats to a Person, 
and check that a TooManyCatsException gets thrown.

3. Refactor any code that is common between all of your test methods, into an @Before method.

