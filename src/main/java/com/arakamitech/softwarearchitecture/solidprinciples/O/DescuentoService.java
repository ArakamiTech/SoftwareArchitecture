package com.arakamitech.softwarearchitecture.solidprinciples.O;

public class DescuentoService {

    public double calcular(Descuento descuento, double monto) {
        return descuento.calcular(monto);
    }
}
