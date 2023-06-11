/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.YearMonth;

/**
 *
 * @author BaPhuoc
 */
public class TestCheckDayInMonth {
    
    public TestCheckDayInMonth() {
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

    public int getDayInMonth(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year, month);

        return yearMonth.lengthOfMonth(); // Valid day
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void UTCID01() {
        int expectValue = getDayInMonth(2020, 1);
        int actualValue = 31;
        assertEquals(expectValue, actualValue);
    }
    
    @Test
    public void UTCID02() {
        int expectValue = getDayInMonth(2021, 2);
        int actualValue = 28;
        assertEquals(expectValue, actualValue);
    }
    
    @Test
    public void UTCID03() {
        int expectValue = getDayInMonth(2019, 2);
        int actualValue = 28;
        assertEquals(expectValue, actualValue);
    }
    
    @Test
    public void UTCID04() {
        int expectValue = getDayInMonth(2019, 1);
        int actualValue = 31;
        assertEquals(expectValue, actualValue);
    }
    
    @Test
    public void UTCID05() {
        int expectValue = getDayInMonth(10, 1);
        int actualValue = 31;
        assertEquals(expectValue, actualValue);
    }

    @Test
    public void UTCID06() {
        int expectValue = getDayInMonth(2019, 2);
        int actualValue = 28;
        assertEquals(expectValue, actualValue);
    }
    
    @Test
    public void UTCID07() {
        int expectValue = getDayInMonth(2020, 11);
        int actualValue = 30;
        assertEquals(expectValue, actualValue);
    }
    
    @Test
    public void UTCID08() {
        int expectValue = getDayInMonth(2021, 11);
        int actualValue = 30;
        assertEquals(expectValue, actualValue);
    }
    
    @Test
    public void UTCID09() {
        int expectValue = getDayInMonth(10, 11);
        int actualValue = 30;
        assertEquals(expectValue, actualValue);
    }
    
    @Test
    public void UTCID10() {
        int expectValue = getDayInMonth(2019, 11);
        int actualValue = 30;
        assertEquals(expectValue, actualValue);
    }
}
