package com.company.test.validator.rule;


public class RuleChainFactory {

    public static Rule getChain() {
        Rule chain = new IsPartnerAndNoCookingTimeRule();
        chain.setNext(new IsShopperAndNoCookingTimeRule())
                .setNext(new HasNoLatLongRule());
        return chain;
    }
}