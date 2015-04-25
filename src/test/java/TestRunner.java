import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by my on 22.04.2015.
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CalcTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
