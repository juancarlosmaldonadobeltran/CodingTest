package com.company.test.functional;

import com.company.test.functional.FunctionalProgramming;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionalProgrammingTest {

    @Test
    public void testResultado() {
        FunctionalProgramming fp = new FunctionalProgramming();
        int resultado = fp.f(1, 2);
        assertEquals(4, resultado);
    }
}
