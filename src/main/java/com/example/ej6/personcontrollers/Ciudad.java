package com.example.ej6.personcontrollers;

import java.io.Serializable;

public class Ciudad implements Serializable {

    private static final long serialVersionUID = 728893343137331159L;
    private String nombre;
    private int numeroHabitantes;

    public Ciudad(String nombre, int numeroHabitantes) {
        this.nombre = nombre;
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getNombre() {
        return nombre;
    }
    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }
}
