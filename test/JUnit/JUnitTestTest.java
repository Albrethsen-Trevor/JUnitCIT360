/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author trevoralbrethsen
 */
public class JUnitTestTest {
    
    public JUnitTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class JUnitTest.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String a1 = "2";
        String a2 = "2";
        JUnitTest instance = new JUnitTest();
        int expResult = 4;
        int result = instance.add(a1, a2);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testAdd2() {
        System.out.println("add");
        String a1 = "2";
        String a2 = "3";
        JUnitTest instance = new JUnitTest();
        int expResult = 5;
        int result = instance.add(a1, a2);
        assertEquals(expResult, result);

    }
    
    @Test(expected = NumberFormatException.class)
    public void testAdd3() {
        System.out.println("add");
        String a1 = "foo";
        String a2 = "2";
        JUnitTest instance = new JUnitTest();
        int result = instance.add(a1, a2);

    }
    
}
