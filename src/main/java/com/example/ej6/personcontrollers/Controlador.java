package com.example.ej6.personcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

//Parte3
@RestController
public class Controlador {

    @Autowired
    @Qualifier("bean1")
    Person bean1;

    @Autowired
    @Qualifier("bean2")
    Person bean2;

    @Autowired
    @Qualifier("bean3")
    Person bean3;

    @GetMapping(value= "controlador/bean/{bean}")
    public Person giveBean(@PathVariable String bean) {
        return switch (bean) {
            case "bean1" -> bean1;
            case "bean2" -> bean2;
            case "bean3" -> bean3;
            default -> null;
        };

    }
}
