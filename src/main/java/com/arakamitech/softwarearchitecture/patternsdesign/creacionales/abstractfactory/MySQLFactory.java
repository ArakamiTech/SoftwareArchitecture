package com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory;

import com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory.impl.ConexionMySQL;
import com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory.impl.IConexion;
import com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory.impl.IQuery;
import com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory.impl.QueryMySQL;

public class MySQLFactory implements IDatabaseFactory {

    @Override
    public IConexion conexion() {
        return new ConexionMySQL();
    }

    @Override
    public IQuery ejecutarQuery() {
        return new QueryMySQL();
    }

}
