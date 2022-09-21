package com.example.ej6.personcontrollers;

public class Person {

    private String nombre;
    private String poblacion;
    private Integer edad;

    public Person() {}

    public Person(String name, String city, Integer age) {
        nombre = name;
        poblacion = city;
        edad = age;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setEdadPorDos(Integer edad) {
        this.edad = edad * 2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public Integer getEdad() {
        return edad;
    }

}
