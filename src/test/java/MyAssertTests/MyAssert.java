package MyAssertTests;

import org.apache.http.util.Asserts;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.hasItems;
/**
 * Created by my on 05.05.2015.
 */
public class MyAssert {
    /*
    JUnit provides overloaded assertion methods for all primitive types and Objects and arrays (of primitives or Objects).
     The parameter order is expected value followed by actual value.Optionally the first parameter can be a String message that is output on failure.
     http://junit.org/apidocs/org/junit/Assert.html
     */

    @Test
    public void testAssertArrayEquals() {
        byte[] expected = "trial".getBytes();
        byte[] actual = "trial".getBytes();
      assertArrayEquals("failure - byte arrays not same", expected, actual);
    }

    @Test
    public void testAssertEquals() {
    assertEquals("failure - strings are not equal", "text", "text");
    }

    @Test
    public void testAssertFalse() {
      assertFalse("failure - should be false", false);
    }

    @Test
    public void testAssertNotNull() {
        assertNotNull("should not be null", new Object());
    }

    @Test
    public void testAssertNotSame() {
       assertNotSame("should not be same Object", new Object(), new Object());
    }

    @Test
    public void testAssertNull() {
        org.junit.Assert.assertNull("should be null", null);
    }

    @Test
    public void testAssertSame() {
        Integer aNumber = Integer.valueOf(768);
       assertSame("should be same", aNumber, aNumber);
    }
    @Test
    public void testAssertTrue() {
        assertTrue("failure - should be true", true);

    }

    // JUnit Matchers assertThat
    //http://tutorials.jenkov.com/java-unit-testing/matchers.html

    @Test
    public void testAssertThatBothContainsString() {
       /* public void assertThat(Object o, Matcher matcher){
            ...
        }*/
    assertThat("albumen", both(containsString("a")).and(containsString("b")));
    }

    @Test
    public void testAssertThathasItemsContainsString() {
    assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
    }

    @Test
    public void testAssertThatEveryItemContainsString() {
      assertThat(Arrays.asList(new String[]{"fun", "ban", "net"}), everyItem(containsString("n")));
    }

    // Core Hamcrest Matchers with assertThat
    @Test
    public void testAssertThatHamcrestCoreMatchers() {

        assertThat("this string", is("this string"));
        assertThat(123, is(123));
         //Chaining Matchers
        assertThat(123, not( is(345) ) );

                /*Core Matchers
        Core
            any() 	Matches anything
            is() 	A matcher that checks if the given objects are equal.
            describedAs() 	Adds a descrption to a Matcher
        Logical
            allOf() 	Takes an array of matchers, and all matchers must match the target object.
            anyOf() 	Takes an array of matchers, and at least one of the matchers must report that it matches the target object.
            not() 	Negates the output of the previous matcher.
        Object
            equalTo() 	A matcher that checks if the given objects are equal.
            instanceOf() 	Checks if the given object is of type X or is compatible with type X
            notNullValue() +
            nullValue() 	Tests whether the given object is null or not null.
            sameInstance() 	Tests if the given object is the exact same instance as another.
                 */

        assertThat("good", allOf(equalTo("good"), startsWith("good")));
        assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
        assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
        assertThat(7, not(CombinableMatcher.<Integer> either(equalTo(3)).or(equalTo(4))));
        assertThat(new Object(), not(sameInstance(new Object())));

    }


}

