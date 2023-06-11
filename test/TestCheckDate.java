/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BaPhuoc
 */
public class TestCheckDate {
    
    public TestCheckDate() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    public boolean isValidDate(int day, int month, int year) {
        boolean isValidDate = true;
        try {
          LocalDate.of(year, month, day);
        } catch (Exception e) {
            isValidDate = false;
        } finally {
            return isValidDate;
        }
    }
    
    @Test
    public void UTCID01() {
        assertTrue(isValidDate(29, 2, 2000));
    }
    
    @Test
    public void UTCID02() {
        assertFalse(isValidDate(29, 2, 2009));
    }
    
    @Test
    public void UTCID03() {
        assertFalse(isValidDate(31, 2, 2020));
    }
    
    @Test
    public void UTCID04() {
       assertTrue(isValidDate(31, 3, 2009));
    }
    
    @Test
    public void UTCID05() {
       assertFalse(isValidDate(31, 4, 2020));
    }
    
    @Test
    public void UTCID06() {
       assertFalse(isValidDate(30, 2, 2009));
    }
    
    @Test
    public void UTCID07() {
       assertTrue(isValidDate(30, 3, 2009));
    }
    
    @Test
    public void UTCID08() {
       assertTrue(isValidDate(30, 4, 2020));
    }
    
    @Test
    public void UTCID09() {
       assertTrue(isValidDate(29, 3, 2009));
    }
    
    @Test
    public void UTCID010() {
       assertTrue(isValidDate(29, 4, 2000));
    }
    
}
