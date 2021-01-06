import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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

    static int[] d = new int[] { 1, 4, 45, 6, 0, 19, 12, 23, 42, 32, 11, 23};
    static int dx = 51;

    static int[] e = new int[] { 1, 4, 6};
    static int ex = 200;

    static int[] f = new int[] { 7, 2, 5, 10, 1};
    static int fx = 9;

    static int[] g = new int[] {};
    static int gx = 0;

    static int[] h = new int[] {4, 2, 9, 21};
    static int hx = 6;

    static int[] i = new int[] {12, 122, 99, 201};
    static int ix = 301;

    static int[] j = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    static int jx = 54;

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

    boolean [][] mat8 =  {
            { true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false },
            { false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
            { true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, true },
            { false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true },
            { true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false },
            { false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false },
            { true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false },
            { false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false },
            { true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false },
            { false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false },
            { true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false },
            { false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false },
            { true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false },
            { false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false },
            { true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false },
            { false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false },
            { false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false },
        }; 
    
    private ByteArrayOutputStream baos;
    private PrintStream outBackup;
    
    /**
     * Default constructor for test class Ex14Test
     */
    public Ex14Test()
    {
    }

    private void redirectOutput()
    {
        // Create a stream to hold the output
        baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        if (outBackup == null) outBackup = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
    }
    
    private String readOutput()
    {
        if (baos == null) return null;
    
        var output = baos.toString(); // Read
        System.out.flush(); // Clear
        redirectOutput(); // Recreate stream (making sure it's cleared)
        return output;
    }
    
    private void restoreOutput()
    {
        System.out.flush();
        System.setOut(outBackup);
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
        assertEquals(Ex14.smallestSubSum(d, dx), 2);
        assertEquals(Ex14.smallestSubSum(e, ex), -1);
        assertEquals(Ex14.smallestSubSum(f, fx), 1);
        assertEquals(Ex14.smallestSubSum(g, gx), -1);
        assertEquals(Ex14.smallestSubSum(h, hx), 1);
        assertEquals(Ex14.smallestSubSum(i, ix), 3);
        assertEquals(Ex14.smallestSubSum(j, jx), 10);
    }

    @Test
    public void question3Tester() {
        assertEquals(Ex14.solutions(5), 6);
        assertEquals(Ex14.solutions(3), 1);
        assertEquals(Ex14.solutions(32), 0);
        assertEquals(Ex14.solutions(2), 0);
        
        String o1,o2,o3,o4,o5;
    
        // Check outputs
        try {
            redirectOutput();
    
            Ex14.solutions(5);
            o1 = readOutput();
    
            Ex14.solutions(3);
            o2 = readOutput();
            
            Ex14.solutions(10);
            o3 = readOutput();
            
            Ex14.solutions(32);
            o4 = readOutput();
            
            Ex14.solutions(2);
            o5 = readOutput();
    
            restoreOutput();
    
            assertEquals("1 + 1 + 3\r\n1 + 2 + 2\r\n1 + 3 + 1\r\n2 + 1 + 2\r\n2 + 2 + 1\r\n3 + 1 + 1\r\n", o1);
            assertEquals("1 + 1 + 1\r\n", o2);
            assertEquals("1 + 1 + 8\r\n1 + 2 + 7\r\n1 + 3 + 6\r\n1 + 4 + 5\r\n1 + 5 + 4\r\n1 + 6 + 3\r\n1 + 7 + 2\r\n1 + 8 + 1\r\n2 + 1 + 7\r\n2 + 2 + 6\r\n2 + 3 + 5\r\n2 + 4 + 4\r\n2 + 5 + 3\r\n2 + 6 + 2\r\n2 + 7 + 1\r\n3 + 1 + 6\r\n3 + 2 + 5\r\n3 + 3 + 4\r\n3 + 4 + 3\r\n3 + 5 + 2\r\n3 + 6 + 1\r\n4 + 1 + 5\r\n4 + 2 + 4\r\n4 + 3 + 3\r\n4 + 4 + 2\r\n4 + 5 + 1\r\n5 + 1 + 4\r\n5 + 2 + 3\r\n5 + 3 + 2\r\n5 + 4 + 1\r\n6 + 1 + 3\r\n6 + 2 + 2\r\n6 + 3 + 1\r\n7 + 1 + 2\r\n7 + 2 + 1\r\n8 + 1 + 1\r\n", o3);
            assertEquals("", o4);
            assertEquals("", o5);
    
        } catch (Exception e) {
            System.out.println("Failed to check question 3 outputs.");
        }
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
        assertEquals(Ex14.cntTrueReg(mat8), 13);
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