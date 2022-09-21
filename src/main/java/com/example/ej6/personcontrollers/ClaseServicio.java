package com.example.ej6.personcontrollers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ClaseServicio {

    @Bean
    @Qualifier("persona")
    Person creaPersona(){
        return new Person();
    }


}
