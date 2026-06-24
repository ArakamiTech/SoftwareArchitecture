package com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory.impl;

public class ConexionOracle implements IConexion {

    @Override
    public void conexion() {
        System.out.println("Conectando a Oracle");
    }

}
