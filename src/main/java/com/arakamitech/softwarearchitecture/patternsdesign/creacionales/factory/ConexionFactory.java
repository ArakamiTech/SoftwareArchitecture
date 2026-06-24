package com.arakamitech.softwarearchitecture.patternsdesign.creacionales.factory;

import com.arakamitech.softwarearchitecture.patternsdesign.creacionales.factory.impl.ConexionMySQL;
import com.arakamitech.softwarearchitecture.patternsdesign.creacionales.factory.impl.ConexionOracle;
import com.arakamitech.softwarearchitecture.patternsdesign.creacionales.factory.impl.IConexion;
import java.util.Map;

public class ConexionFactory {

    private final Map<String, IConexion> iConexion = Map.of(
            "MYSQL", new ConexionMySQL(),
            "ORACLE", new ConexionOracle());

    public IConexion obtenerConexion(String tipo) {
        return iConexion.get(tipo.toUpperCase());
    }

}
