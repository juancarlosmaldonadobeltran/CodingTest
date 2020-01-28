package com.company.test.order;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrdersTest {

    @Test
    public void givenOdTag4AndOdIte0WhenExecuteXThenShouldReturn4() {
        // given
        Orders orders = new Orders();
        // when
        List<Integer> result = orders.x(4, 0);
        // then
        assertEquals(Arrays.asList(4), result);
    }

    @Test
    public void givenOdTag4AndOdIte5WhenExecuteXThenShouldReturn4() {
        // given
        Orders orders = new Orders();
        // when
        List<Integer> result = orders.x(4, 5);
        // then
        assertEquals(Arrays.asList(4, 3), result);
    }

    @Test
    public void givenOdTag4AndOdIte10WhenExecuteXThenShouldReturn4() {
        // given
        Orders orders = new Orders();
        // when
        List<Integer> result = orders.x(4, 10);
        // then
        assertEquals(Arrays.asList(4, 3, 2), result);
    }

    @Test
    public void givenOdTag4AndOdIte15WhenExecuteXThenShouldReturn4() {
        // given
        Orders orders = new Orders();
        // when
        List<Integer> result = orders.x(4, 15);
        // then
        assertEquals(Arrays.asList(4, 3, 2, 1), result);
    }
}
