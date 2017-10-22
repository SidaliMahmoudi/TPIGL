/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HELLAL
 */
public class VecteurHelperTest {
    
    public VecteurHelperTest() {
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
     * Test of trierVect method, of class VecteurHelper.
     */
    @Test
    public void testTrierVect() {
        System.out.println("trierVect");
        int[] vect1 = {1,2,19,45,25};
        int[] expResult1 = {1,2,19,25,45};
        int[] result1 = VecteurHelper.trierVect(vect1);
        assertArrayEquals(expResult1, result1);
        
        int[] vect2 = {1,2,19,45,25};
        int[] expResult2 = {1,2,19,25,45};
        int[] result2 = VecteurHelper.trierVect(vect2);
        assertArrayEquals(expResult2, result2);
        
        int[] vect3 = {1,2,19,45,25};
        int[] expResult3 = {1,2,19,25,45};
        int[] result3 = VecteurHelper.trierVect(vect3);
        assertArrayEquals(expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sommeDeuxVect method, of class VecteurHelper.
     */
    @Test
    public void testSommeDeuxVect() throws Exception {
        System.out.println("sommeDeuxVect");
        int[] vect1 = {0,1,2,3};
        int[] vect2 = {0,1,2,3};
        int[] expResult = {0,2,4,6};
        int[] result = VecteurHelper.sommeDeuxVect(vect1, vect2);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of reverse method, of class VecteurHelper.
     */
    @Test
    public void testReverse() {
        System.out.println("reverse");
        int[] vect ={0,1,2,3};
        int[] expResult = {3,2,1,0};
        int[] result = VecteurHelper.reverse(vect);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of minMaxVect method, of class VecteurHelper.
     */
    @Test
    public void testMinMaxVect() {
        System.out.println("minMaxVect");
        int[] vect = {0,1,2,3};
        int[] expResult = {0,3};
        int[] result = VecteurHelper.minMaxVect(vect);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of increamentVect method, of class VecteurHelper.
     */
    @Test
    public void testIncreamentVect() {
        System.out.println("increamentVect");
        int[] vect = {0,1,2,3};
        int in = 1;
        int[] expResult = {1,2,3,4};
        int[] result = VecteurHelper.increamentVect(vect, in);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
