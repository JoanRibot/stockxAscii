package strockAscii;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Items.Sneaker;

public class SneakerTest {
    Sneaker sneaker1;
    Sneaker sneaker2;

    @Before
    public void setup(){
        sneaker1 = new Sneaker("1525-1053", "DC Vintage");
        sneaker2 = new Sneaker("19Lml0", "Adidas abstractas");

    }

    @Test
    public void constructorTest(){
        assertEquals("1525-1053", sneaker1.getStyle());
        assertEquals("DC Vintage", sneaker1.getName());
        assertEquals("19Lml0", sneaker2.getStyle());
        assertEquals("Adidas abstractas", sneaker2.getName());
    }

    @Test
    public void saleTest(){
        sneaker1.setSale(298);
        assertEquals(298, sneaker1.getSale());
        sneaker2.setSale(3002);
        assertEquals(3002, sneaker2.getSale());

    }
}
