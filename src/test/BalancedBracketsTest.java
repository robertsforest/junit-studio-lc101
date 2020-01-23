package test;

import main.BalancedBrackets;
import org.junit.*;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    private static int numTestsRun = 0;

    @BeforeClass
    public static void setup() {
        System.out.println("Starting unit tests BalancedBracketsTest");
    }

    @Before
    public void init() {
        //Setup the variables needed before each test
    }

    @After
    public void finalize() {
        System.out.println("Test #" + ++numTestsRun + " run!");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Finished running " + numTestsRun + " unit tests in class BalancedBracketsTest!");
    }
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void singleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void doubleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void bracketsInText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Daft] [Punk]"));
    }

    @Test
    public void backwardBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void backwardBracketsInText() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("This]is [ not great brackets"));
    }

    @Test
    public void alternatingBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("text[is]a[cool]"));
    }

    @Test
    public void lessLeftBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void lessRightBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void noBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("The quick brown fox jumped a lazy Ciri"));
    }

    @Test
    public void manyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Can[You[Feel[The[Love[Tonight]There's]Magic]In]The]Air!"));
    }

    @Test
    public void specialCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("%&[(*^]$#"));
    }

    @Test
    public void leadingBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]MyTextIsAfterBrackets"));
    }

    @Test
    public void trailingBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("SoManyTestsToWrite[]"));
    }

    @Test
    public void oneAtTheEnd() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("How do you like these apples?]"));
    }

    @Test
    public void oneAtTheStart() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[ThisIsSoWrong"));
    }
}
