package Testy;

import Klasy.Calc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void mult() {
        double a = -3.0;
        double expResult = -6.0;
        double result = Calc.mult(a);
        assertEquals(expResult, result, 0.01);
    }

    @Test
    void add() {
        double a = 4;
        double b = 3;
        double expResult = 7.0;
        double result = Calc.add(a, b);
        assertEquals(expResult, result, 0.001);
    }
}