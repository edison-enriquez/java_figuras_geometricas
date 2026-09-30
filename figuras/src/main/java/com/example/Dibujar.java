package com.example;

public interface Dibujar {
    void dibujar();

    default void dibujarBordes(){
        System.out.println("Aqui dibuja con bordes");
    }
}
