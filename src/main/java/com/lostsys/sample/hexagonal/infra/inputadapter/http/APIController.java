package com.lostsys.sample.hexagonal.infra.inputadapter.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/intents")
public class APIController {

    @Autowired
    private APIRepository apiRepository;

    @PostMapping("/generate")
    public String generateIntent(@RequestBody IntentRequest intentRequest) {
       
        String intentKey = apiRepository.generateIntent(intentRequest);

        // Puedes devolver la clave de solicitud u otra respuesta según tus necesidades
        return intentKey;
    }
}

