package wk05junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestRectangulo {
    Rectangulo miRectangulo;
    
    @Test
    public void testAreaPositivos() {
        miRectangulo = new Rectangulo(3, 4);
        assertEquals(12.0, miRectangulo.getArea(), 0.000000001);
    }
    
    @Test
    public void testAreaAnchoCero() {
        miRectangulo = new Rectangulo(5, 0);
        assertEquals(0, miRectangulo.getArea(), 0.000000001);
    }
    
    @Test
    public void testAreaLargoCero() {
        miRectangulo = new Rectangulo(0, 6);
        assertEquals(0, miRectangulo.getArea(), 0.000000001);
    }
    
    @Test
    public void testAreaCeros() {
        miRectangulo = new Rectangulo(0, 0);
        assertEquals(0, miRectangulo.getArea(), 0.000000001);
    }
}
