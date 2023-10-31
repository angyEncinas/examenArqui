package com.lostsys.sample.hexagonal.application;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.lostsys.sample.hexagonal.domain.IntentRequest;

import com.lostsys.sample.hexagonal.infra.inputport.intentRequestInputPort;
import com.lostsys.sample.hexagonal.infra.outputport.ClentRepository;

@Component
public class IntentRequestUseCase implements intentRequestInputPort {

    @Autowired
    ClentRepository clentRepository;

    @Override
    public IntentRequest generateIntent(String token, String productCode ,String amount) {
        IntentRequest request = IntentRequest.builder()
            .token( UUID.randomUUID().toString() )
            .productCode( productCode)
            .amount(amount)
            .build();

        return clentRepository.generateIntent( request );
    }
    
}

