package com.company.test.validator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OrderValidatorTest {

    private OrderValidator validator;

    @Before
    public void setUp() {
        this.validator = new OrderValidator();
    }

    @Test
    public void givenIsShopperAndNoCookingTimeWhenValidateThenItShouldBeNotValid() {
        // given
        Order order = Order.builder().shopper(true).cookingTime(0).partner(false).lat(10.0).lon(15.0).build();
        // when
        boolean isOrderValid = this.validator.validate(order);
        // then
        assertFalse(isOrderValid);
    }

    @Test
    public void givenIsPartnerAndNoCookingTimeWhenValidateThenItShouldBeNotValid() {
        // given
        Order order = Order.builder().partner(true).cookingTime(0).shopper(false).lat(10.0).lon(15.0).build();
        // when
        boolean isOrderValid = this.validator.validate(order);
        // then
        assertFalse(isOrderValid);
    }

    @Test
    public void givenHasNoLatLongWhenValidateThenItShouldBeNotValid() {
        // given
        Order order = Order.builder().partner(false).cookingTime(10).shopper(false).build();
        // when
        boolean isOrderValid = this.validator.validate(order);
        // then
        assertFalse(isOrderValid);
    }

    @Test
    public void givenAValidOrderWhenValidateThenItShouldBeValid() {
        // given
        Order order = Order.builder().partner(false).cookingTime(10).shopper(false).lat(10.0).lon(15.0).build();
        // when
        boolean isOrderValid = this.validator.validate(order);
        // then
        assertTrue(isOrderValid);
    }
}
