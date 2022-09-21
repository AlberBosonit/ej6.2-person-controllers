package com.example.ej6.personcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping(value="/controlador2")
public class Controlador2 {

    @Autowired
    @Qualifier("persona")
    Person person;

    @Autowired
    ArrayList<Ciudad> ciudades;

    //Parte1
    @GetMapping(value= "/getPersona")
    public Person getPersona() {
        Integer edadPorDos = person.getEdad() * 2;
        person.setEdad(edadPorDos);
        return person;
    }

    //Parte2
    @GetMapping(value= "/getCiudad")
    public ArrayList<Ciudad> getCiudad() {
        return ciudades;
    }
}
