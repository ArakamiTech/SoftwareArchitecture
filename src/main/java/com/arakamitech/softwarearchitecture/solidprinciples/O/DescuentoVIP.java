package com.arakamitech.softwarearchitecture.solidprinciples.O;

/**
 *
 * @author cristhian
 */
public class DescuentoVIP implements Descuento {

    @Override
    public double calcular(double monto) {
        return monto * 0.20;
    }

}
