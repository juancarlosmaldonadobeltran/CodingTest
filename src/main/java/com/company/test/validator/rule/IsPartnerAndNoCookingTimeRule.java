package com.company.test.validator.rule;

import com.company.test.validator.Order;

public class IsPartnerAndNoCookingTimeRule extends Rule {

    @Override
    public boolean check(Order order) {
        Integer cookingTime = 0;
        Boolean partner = true;
        if (partner.equals(order.getPartner()) && cookingTime.equals(order.getCookingTime())) {
            return false;
        }
        return this.checkNext(order);
    }
}
