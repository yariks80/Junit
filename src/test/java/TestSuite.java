import org.junit.experimental.categories.Categories;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
/**
 * Created by my on 22.04.2015.
 */
@RunWith(Suite.class)
@Categories.IncludeCategory(AcceptanceTest.class)
@Suite.SuiteClasses(value = {CalcTest.class ,Test_a.class })
public class TestSuite {
}
