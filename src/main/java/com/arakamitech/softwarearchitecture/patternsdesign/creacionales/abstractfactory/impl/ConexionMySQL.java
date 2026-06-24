package com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory.impl;

public class ConexionMySQL implements IConexion {

    @Override
    public void conexion() {
        System.out.println("Conectando a MySQL");
    }

}
