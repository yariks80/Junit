import com.sun.javafx.css.CalculatedValue;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;
import org.junit.runner.notification.RunListener;

import java.io.File;
import java.io.IOException;
import org.junit.runner.RunWith;

/**
 * Created by my on 05.05.2015.
 */
@RunWith(value = Runner.class)
public class TestRule {

    private static Calc MyTest;

       @BeforeClass
    public static void initMyTest() {
           MyTest = new Calc();
    }
    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();
    @Rule
    public final Timeout timeout = new Timeout(300);
    @Rule
    public final ExpectedException thrown = ExpectedException.none();
    @Test
    public void writeResultTest() throws IOException {
         MyTest.div(4,4);

    }
    @Test
    public void stepUpCoefficientCalculateTest() throws DivByZeroException {

        thrown.expect(DivByZeroException.class);
        MyTest.div(5,0);
    }

}



