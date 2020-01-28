package com.company.test.validator;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
public class Order {
    @NonNull
    Boolean shopper;
    @NonNull
    Integer cookingTime;
    @NonNull
    Boolean partner;
    Double lat;
    Double lon;
}
