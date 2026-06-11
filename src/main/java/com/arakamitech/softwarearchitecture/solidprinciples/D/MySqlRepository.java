package com.arakamitech.softwarearchitecture.solidprinciples.D;

/**
 *
 * @author cristhian
 */
public class MySqlRepository implements UsuarioInterface {

    @Override
    public void guardar() {
        System.out.println("Guarda en MySQL");
    }

}
