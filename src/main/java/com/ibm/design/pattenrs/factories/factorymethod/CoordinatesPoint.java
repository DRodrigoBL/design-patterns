package com.ibm.design.pattenrs.factories.factorymethod;

import lombok.Getter;

public class CoordinatesPoint {

    @Getter
    private double x;

    @Getter
    private double y;

    private CoordinatesPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    static class Factory {

        static CoordinatesPoint createCartesianPoint(double x, double y) {
            return new CoordinatesPoint(x, y);
        }

        static CoordinatesPoint createPolarPoint(double rho, double tetha) {
            return new CoordinatesPoint(rho * Math.cos(tetha), rho * Math.sin(tetha));
        }

    }

}
