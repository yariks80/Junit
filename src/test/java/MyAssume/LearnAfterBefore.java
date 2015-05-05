package MyAssume;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by my on 05.05.2015.
 */
public class LearnAfterBefore {
    public static boolean checkThisBeforeRunThisClass(){
       //return true;
       return false;
    }


    @BeforeClass
    public static void testLoadConfiguration(){
        System.out.println("Load configuration files");
        System.out.println("initilize Excel files object");

        Assume.assumeTrue(checkThisBeforeRunThisClass());
    }

    @Before
    public void testsetUp() {
        System.out.println("Open browser");
        System.out.println("Navigate URL");

    }

    @Ignore
    @Test
    public void testAdvancedSearch() {
        System.out.println("Search on website");
    }


    @Test
    public void testVerifySearchResult(){
        System.out.println("Verify search result&quot");
    }



    @After
    public void testtearDown() {
        System.out.println("Close Browser");
    }

    @AfterClass
    public static void testReportResult(){
        System.out.println("Report result");
    }
}
