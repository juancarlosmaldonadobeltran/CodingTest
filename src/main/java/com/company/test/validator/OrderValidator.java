package com.company.test.validator;

import com.company.test.validator.rule.RuleChainFactory;

public class OrderValidator {
    public boolean validate(Order order) {
        boolean isValid = RuleChainFactory.getChain().check(order);
        printValidationMessage(isValid);
        return isValid;
    }

    public void printValidationMessage(boolean isValid) {
        System.out.println(isValid? "puede asignarse" : "no puede asignarse en esta iteracion");
    }

    public static void main(String[] args) {
        OrderValidator validator = new OrderValidator();
        Order validOrder = Order.builder().partner(false).cookingTime(10).shopper(false).lat(10.0).lon(15.0).build();
        validator.validate(validOrder);
        Order inValidOrder = Order.builder().shopper(true).cookingTime(0).partner(false).lat(10.0).lon(15.0).build();
        validator.validate(inValidOrder);
    }
}
