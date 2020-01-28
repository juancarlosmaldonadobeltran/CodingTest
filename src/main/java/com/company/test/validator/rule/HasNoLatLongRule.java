package com.company.test.validator.rule;

import com.company.test.validator.Order;

public class HasNoLatLongRule extends Rule {

    @Override
    public boolean check(Order order) {
        if (order.getLat() == null && order.getLon() == null) {
            return false;
        }
        return this.checkNext(order);
    }
}
