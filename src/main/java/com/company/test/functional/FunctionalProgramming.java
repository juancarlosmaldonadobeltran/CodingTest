package com.company.test.functional;

import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

public class FunctionalProgramming {

    public int f(int x, int y) {
        IntBinaryOperator mul = (a, b) -> a * b;
        IntBinaryOperator sub = (a, b) -> a - b;
        return Stream.of(Integer::sum, mul, sub)
                .map(f -> f.applyAsInt(x, y))
                .reduce(0, Integer::sum);
    }
}
