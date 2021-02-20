package strockAscii;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Offers.Ask;

public class AskTest {
    @Test
    public void ConstructorTest(){
        Ask ask1 = new Ask("xxx", 8);
        Ask ask2 = new Ask("1456", 89);
        assertEquals("\n\t\t" + "xxx" + "\t\t" + 8, ask1.toString());
        assertEquals("\n\t\t" + "1456" + "\t\t" + 89, ask2.toString());

        
    }
}

