package com.company.creational.factorymethod.ejemplo2;

public class EnemigoFactory {
    public static Enemigos builEnemigo(TypeEnemigo enemigo)
    {
        switch (enemigo){
            case ENEMIGOA:
                return  new EnemigoA();
            case ENEMIGOB:
                return  new EnemigoB();
            default:
                return new EnemigoA();
        }
    }
}
