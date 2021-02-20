package strockAscii;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Offers.Ask;

public class AskTest {
    @Test
    public void ConstructorTest(){
        Ask ask1 = new Ask("xxx", 8);
        Ask ask2 = new Ask("1456", 89);
        assertEquals("ask=" + 8 + ", size=" + "xxx", ask1.toString());
        assertEquals("ask=" + 89 + ", size=" + "1456", ask2.toString());

        
    }
}

