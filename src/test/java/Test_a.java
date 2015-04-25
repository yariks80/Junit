import org.junit.*;

/**
 * Created by my on 23.04.2015.
 */

public class Test_a {

   @BeforeClass
   public static void setUpClass() throws Exception {
        System.out.println("Before Class");
        Assert.assertTrue(true);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("After Class");
        Assert.assertTrue(true);
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Befor method");
        Assert.assertTrue(true);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After method");
        Assert.assertTrue(true);

    }


    @Test
    public void testTestA() throws Exception {
        System.out.println("TestA");
        Assert.assertTrue(true);

    }
    @Ignore("Not Ready to Run")
    @Test//(timeout = 1000)
    public void testTestB() throws Exception {
        System.out.println("TestB");
        Assert.assertTrue(true);

    }

    @Test
    public void testTestC() throws Exception {
        System.out.println("TestC");
        Assert.assertTrue(true);
    }

}


