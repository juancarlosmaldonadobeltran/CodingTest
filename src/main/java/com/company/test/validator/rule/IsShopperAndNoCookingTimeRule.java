package com.company.test.validator.rule;

import com.company.test.validator.Order;

public class IsShopperAndNoCookingTimeRule extends Rule {

    @Override
    public boolean check(Order order) {
        Integer cookingTime = 0;
        Boolean shopper = true;
        if (shopper.equals(order.getShopper()) && cookingTime.equals(order.getCookingTime())) {
            return false;
        }
        return this.checkNext(order);
    }
}
