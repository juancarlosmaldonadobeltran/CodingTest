package com.company.test.validator.rule;

import com.company.test.validator.Order;

import java.util.Optional;

public abstract class Rule {

    private Rule next;

    public abstract boolean check(Order order);


    Rule setNext(Rule next) {
        this.next = next;
        return next;
    }

    boolean checkNext(Order order) {
        return this.getNext().map(rule -> rule.check(order)).orElse(true);
    }

    private Optional<Rule> getNext() {
        return Optional.ofNullable(this.next);
    }
}
