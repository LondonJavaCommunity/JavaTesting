E02_Hamcrest

1. Extend the E01_JUnit project that you worked on earlier, or use the E02_Hamcrest starter project as a basis for the following work.

2. Modify the "add a single cat" test (or copy it to a new test if you prefer to keep both versions) 
so as to use assertThat instead of assertEquals. Combine the "equals" and "same instance" tests into a single assertion by using allOf() .

3. See what happens when you create another (but equal) Cat and compare against that instead.

4. "Test the test" by temporarily changing the expected result to deliberately make it fail, 
and observe the descriptive failure message that Hamcrest produces.
