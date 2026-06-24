package com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory.impl;

public class QueryMySQL implements IQuery {

    @Override
    public void ejecutarQuery() {
        System.out.println("Ejecutando query MySQL");
    }

}
