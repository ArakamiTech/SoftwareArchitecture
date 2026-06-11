package com.arakamitech.softwarearchitecture.solidprinciples.O;

/**
 *
 * @author cristhian
 */
public class DescuentoService {

    public double calcular(Descuento descuento, double monto) {
        return descuento.calcular(monto);
    }
}
