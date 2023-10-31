package com.lostsys.sample.hexagonal.infra.outputport;

public interface ClentRepository {

    <T> String generateIntent(T request);
    
}
