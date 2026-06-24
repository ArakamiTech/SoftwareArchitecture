package com.arakamitech.softwarearchitecture.solidprinciples.O;

public class DescuentoVIP implements Descuento {

    @Override
    public double calcular(double monto) {
        return monto * 0.20;
    }

}
