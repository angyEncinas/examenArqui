package com.lostsys.sample.hexagonal.infra.inputadapter.http;

import org.springframework.stereotype.Component;
import com.lostsys.sample.hexagonal.domain.IntentRequest;
@Component
public class APIRepository {



    public String generateIntent(IntentRequest intentRequest) {
   
        String token = intentRequest.getToken();
        String productCode = intentRequest.getProductCode();
        double amount = intentRequest.getAmount();

        String intentKey = generateIntentKey(token, productCode, amount);

      
        return intentKey;
    }


    private String generateIntentKey(String token, String productCode, double amount) {

        return token + "_" + productCode + "_" + amount;
    }
}

