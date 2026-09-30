package com.example;

public abstract class Figura implements Dibujar{
    protected String nombre;

    public Figura (String nombre){
        this.nombre =  nombre;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public void getNombre(){
        System.out.println(nombre);
    }
}
