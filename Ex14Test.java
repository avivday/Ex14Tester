import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Ex14Test.
 *
 * @author  Aviv Day
 * @version (a version number or a date)
 */
public class Ex14Test
{
    // question 1
    static int[] a = new int[] {6, 6, 18, 18, -4, -4, 12, 9, 9};
    static int[] b = new int[] {8, 8, -7, -7, 3, 3, 0, 0, 10, 10, 5, 5, 4};
    static int[] c = new int[] {5};
    static int[] anotherOne = new int[] {4, 8, 8};
    // question 2

    static int[] d = new int[] { 1, 4, 45, 6, 0, 19};
    static int dx = 51;

    static int[] e = new int[] { 1, 4, 6};
    static int ex = 200;

    static int[] f = new int[] { 7, 2, 5, 10, 1};
    static int fx = 9;

    static int[] g = new int[] {};
    static int gx = 0;

    // question 4 
    boolean[][] mat1 = 
        {
            { false, false, false, false, true },
            { false, true, true, true, false },
            { false, false, true, true, false },
            { true, false, false, false, false },
            { true, true, false, false, false },
        };
    // 3
    boolean [][] mat2 =  {
            { false, false, false, false, false },
            { false, true, true, true, true },
            { false, true, true, false, false },
            { true, false, false, false, false },
            { true, true, false, false, false },
        };
    // 2
    boolean [][] mat3 =  {
            { false, false, false, false, false },
            { false, false, false, false, false },
            { false, false, false, false, false },
            { false, false, false, false, false },
            { false, false, false, false, false },
        };
    // 0
    boolean [][] mat4 =  {
            { true, false, false, false, true },
            { false, true, true, true, false },
            { false, true, true, false, false },
            { true, false, false, false, false },
            { true, true, false, false, true },
        };
    //5

    boolean [][] mat5 =  {
            { true, false, false, false, true },
            { false, true, true, true, false },
            { false, true, true, false, true },
            { true, false, true, true, false },
            { true, true, false, false, true },
        };
    // 6

    boolean [][] mat6 =  {
            { true, false, false, false, false },
            { false, false, false, false, false },
            { false, true, true, true, false },
            { false, false, true, false, false },
            { false, false, false, false, true },
        }; // 3

    boolean [][] mat7 =  {
            { false, false, false, false, false },
            { false, true, true, true, false },
            { false, false, true, false, false },
            { false, false, false, false, false },
            { false, false, false, false, false },
        }; // 1
    /**
     * Default constructor for test class Ex14Test
     */
    public Ex14Test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    @Test
    public void question1Tester() {
        assertEquals(Ex14.findSingle(a), 12);
        assertEquals(Ex14.findSingle(b), 4);
        assertEquals(Ex14.findSingle(c), 5);
        assertEquals(Ex14.findSingle(anotherOne), 4);
    }

    @Test
    public void question2Tester() {
        assertEquals(Ex14.smallestSubSum(d, dx), 3);
        assertEquals(Ex14.smallestSubSum(e, ex), -1);
        assertEquals(Ex14.smallestSubSum(f, fx), 1);
        assertEquals(Ex14.smallestSubSum(g, gx), -1);
    }

    @Test
    public void question3Tester() {
        assertEquals(Ex14.solutions(5), 6);
        assertEquals(Ex14.solutions(3), 1);
        assertEquals(Ex14.solutions(32), 0);
        assertEquals(Ex14.solutions(2), 0);
    }

    @Test
    public void question4Tester() {
        assertEquals(Ex14.cntTrueReg(mat1), 3);
        assertEquals(Ex14.cntTrueReg(mat2), 2);
        assertEquals(Ex14.cntTrueReg(mat3), 0);
        assertEquals(Ex14.cntTrueReg(mat4), 5);
        assertEquals(Ex14.cntTrueReg(mat5), 6);
        assertEquals(Ex14.cntTrueReg(mat6), 3);
        assertEquals(Ex14.cntTrueReg(mat7), 1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
