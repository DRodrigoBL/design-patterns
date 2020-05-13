package com.ibm.design.pattenrs.factories.factorymethod;

import lombok.Getter;

public class CoordinatesPointConstructorOverloading {

    @Getter
    private double x;

    @Getter
    private double y;

    public CoordinatesPointConstructorOverloading(double x, double y) {
        this.x = x;
        this.y = y;
    }

//    public CoordinatesPointConstructorOverloading(double rho, double tetha) {
//        this.x = rho * Math.cos(tetha);
//        this.y = rho * Math.sin(tetha);
//    }
}
