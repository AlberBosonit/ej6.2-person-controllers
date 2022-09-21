package com.example.ej6.personcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value="/controlador1")
public class Controlador1 {

    @Autowired
    @Qualifier("persona")
    Person person;

    @Autowired
    ArrayList<Ciudad> listaCiudades;

    //Parte1
    @GetMapping(value= "/addPersona")
    public Person addPersona(@RequestHeader(value="nombre") String name,
                             @RequestHeader(value="poblacion") String city,
                             @RequestHeader(value="edad") Integer age) {
        person.setNombre(name);
        person.setPoblacion(city);
        person.setEdad(age);
        return person;
    }

    //Parte2
    @PostMapping(value= "/addCiudad")
    public void useradd(@RequestBody Ciudad ciudad) {
        listaCiudades.add(ciudad);
    }
}

/*
        {
            "nombre":"Barcelona",
            "numeroHabitantes":850000
        }
*/
