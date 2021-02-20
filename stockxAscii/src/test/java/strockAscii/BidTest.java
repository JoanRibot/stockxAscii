package strockAscii;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Offers.Bid;

public class BidTest {
    @Test
    public void ConstructorTest(){
        Bid bid1 = new Bid("xxx", 8);
        Bid bid2 = new Bid("1456", 89);
        assertEquals("bid=" + 8 + ", size=" + "xxx", bid1.toString());
        assertEquals("bid=" + 89 + ", size=" + "1456", bid2.toString());

        
    }
}
