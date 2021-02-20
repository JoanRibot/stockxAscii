package strockAscii;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Offers.Bid;

public class BidTest {
    @Test
    public void ConstructorTest(){
        Bid bid1 = new Bid("xxx", 8);
        Bid bid2 = new Bid("1456", 89);
        assertEquals("\n\t\t" + "xxx" + "\t\t" + 8, bid1.toString());
        assertEquals("\n\t\t" + "1456" + "\t\t" + 89, bid2.toString());

        
    }
}
