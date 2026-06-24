package com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory.impl;

public class QueryOracle implements IQuery {

    @Override
    public void ejecutarQuery() {
        System.out.println("Ejecutando query Oracle");
    }

}
