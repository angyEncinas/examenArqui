package com.lostsys.sample.hexagonal.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Builder
@Getter
@Setter
public class IntentRequest {
    private String token;
    private String productCode;
    private String amount;
}
