package com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory;

import com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory.impl.ConexionOracle;
import com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory.impl.IConexion;
import com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory.impl.IQuery;
import com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory.impl.QueryOracle;

public class OracleFactory implements IDatabaseFactory {

    @Override
    public IConexion conexion() {
        return new ConexionOracle();
    }

    @Override
    public IQuery ejecutarQuery() {
        return new QueryOracle();
    }

}
