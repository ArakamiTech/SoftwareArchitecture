package com.arakamitech.softwarearchitecture.solidprinciples.I;

public class Persona implements Comible, Dormible, Trabajable {

    @Override
    public void comer() {
        System.out.println("Esta persona come");
    }

    @Override
    public void dormir() {
        System.out.println("Esta persona duerme");
    }

    @Override
    public void trabajar() {
        System.out.println("Esta persona trabaja");
    }

}
