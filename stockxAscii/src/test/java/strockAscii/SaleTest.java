package strockAscii;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Offers.Sale;

public class SaleTest {
    @Test
    public void ConstructorTest(){
        Sale sale1 = new Sale("xxx", 8);
        Sale sale2 = new Sale("1456", 89);
        assertEquals("price=" + 8 + ", size=" + "xxx", sale1.toString());
        assertEquals("price=" + 89 + ", size=" + "1456", sale2.toString());

        
    }
}

