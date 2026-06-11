package com.arakamitech.softwarearchitecture.solidprinciples.D;

/**
 *
 * @author cristhian
 */
public class OracleRepository implements UsuarioInterface {

    @Override
    public void guardar() {
        System.out.println("Guarda en Oracle");
    }

}
