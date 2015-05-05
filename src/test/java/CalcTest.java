import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

 @Category(AcceptanceTest.class)
public class CalcTest {

    @Test
    public void testMult() {
        Calc calc = new Calc();
        Assert.assertEquals(25, calc.mult(5, 5));
    }

    @Test(expected = DivByZeroException.class)
    public void testDiv()
    {
        Calc calc = new Calc();
        Assert.assertEquals("Incorrect division", 6, calc.div(36, 0));
    }
}