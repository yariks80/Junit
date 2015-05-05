package Fixtures;

import org.junit.*;


import java.io.Closeable;
import java.io.IOException;

/**
 * Created by my on 05.05.2015.
 */
/*‘икстура (Fixture)
        Ч состо€ние среды тестировани€, которое требуетс€ дл€
        успешного выполнени€ тестового метода. ћожет быть представлено набором
        каких-либо объектов, состо€нием базы данных, наличием определенных файлов,
        соединений и  проч.*/
public class estFixturesExample {


    private ManagedResource myManagedResource;
    private static ExpensiveManagedResource myExpensiveManagedResource;

    static class ExpensiveManagedResource implements Closeable {
        @Override
        public void close() throws IOException {}
    }

    static class ManagedResource implements Closeable {
        @Override
        public void close() throws IOException {}
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("@BeforeClass setUpClass");
        myExpensiveManagedResource = new ExpensiveManagedResource();
    }

    @AfterClass
    public static void tearDownClass() throws IOException {
        System.out.println("@AfterClass tearDownClass");
        myExpensiveManagedResource.close();
        myExpensiveManagedResource = null;
    }



    private void println(String string) {
        System.out.println(string);
    }

    @Before
    public void setUp() {
        this.println("@Before setUp");
        this.myManagedResource = new ManagedResource();
    }

    @After
    public void tearDown() throws IOException {
        this.println("@After tearDown");
        this.myManagedResource.close();
        this.myManagedResource = null;
    }

    @Test
    public void test1() {
        this.println("@Test test1()");
    }

    @Test
    public void test2() {
        this.println("@Test test2()");
    }
}
