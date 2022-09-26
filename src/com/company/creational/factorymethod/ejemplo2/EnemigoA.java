package com.company.creational.factorymethod.ejemplo2;

//producto concreto
public class EnemigoA implements Enemigos{
    @Override
    public void ataque() {
        System.out.println("aquete enemigo A bom!");
    }
}
