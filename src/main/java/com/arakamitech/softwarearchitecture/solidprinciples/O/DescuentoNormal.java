package com.arakamitech.softwarearchitecture.solidprinciples.O;

public class DescuentoNormal implements Descuento {

    @Override
    public double calcular(double monto) {
        return monto * 0.10;
    }

}
