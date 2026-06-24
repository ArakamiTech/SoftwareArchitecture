package com.arakamitech.softwarearchitecture.patternsdesign.creacionales.factory.impl;

public class ConexionOracle implements IConexion {

    @Override
    public void Conectar() {
        System.out.println("Conectando a Oracle...");
    }

}
