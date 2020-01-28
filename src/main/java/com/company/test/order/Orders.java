package com.company.test.order;

import java.util.*;
import java.util.stream.Collectors;

public class Orders {

    NavigableMap<Integer, Integer> config;

    public Orders() {
        this.config = new TreeMap<>();
        config.put(1, 15);
        config.put(2, 10);
        config.put(3, 5);
        config.put(4, 0);
    }

    public List<Integer> x(int odTag, int odIt) {
        return this.config.descendingMap().entrySet().stream()
                .filter(e -> e.getKey() <= odTag && e.getValue() <= odIt)
                .map(Map.Entry::getKey).collect(Collectors.toList());
    }


}
