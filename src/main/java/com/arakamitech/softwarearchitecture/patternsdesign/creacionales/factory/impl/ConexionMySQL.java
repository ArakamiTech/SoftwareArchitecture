package com.arakamitech.softwarearchitecture.patternsdesign.creacionales.factory.impl;

public class ConexionMySQL implements IConexion {

    @Override
    public void Conectar() {
        System.out.println("Conectando a MySQL...");
    }

}
