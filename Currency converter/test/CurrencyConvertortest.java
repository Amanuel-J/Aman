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
import currency.converter.*;
/**
 *
 * @author dell
 */
public class CurrencyConvertortest {
    CurrencyConverter cc;
    public CurrencyConvertortest() {
    }
    
    
    
    @Before
    public void setUp() {
        cc=new CurrencyConverter();
    }
    @Test
    public void TestBirr()
    {
        assertEquals(900,cc.convertBirr(30),0.00);
    }
    @Test
    public void TestYen()
    {
        assertEquals(120,cc.convertYen(30),0.00);
    }
    @Test
    public void TestEuro()
    {
        assertEquals(45,cc.convertEuro(30),0.00);
    }
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
