package com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory;

import com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory.impl.IConexion;
import com.arakamitech.softwarearchitecture.patternsdesign.creacionales.abstractfactory.impl.IQuery;

public interface IDatabaseFactory {

    IConexion conexion();

    IQuery ejecutarQuery();
    
}
