package strockAscii;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Offers.Sale;

public class SaleTest {
    @Test
    public void ConstructorTest(){
        Sale sale1 = new Sale("xxx", 8);
        Sale sale2 = new Sale("1456", 89);
        assertEquals("\n\t\t" + "xxx" + "\t\t" + 8, sale1.toString());
        assertEquals("\n\t\t" + "1456" + "\t\t" + 89, sale2.toString());

        
    }
}

