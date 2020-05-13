package com.ibm.design.pattenrs.factories.factorymethod;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Getter;

public class CoordinatesPointConstructorEnum {

    @Getter
    private double x;

    @Getter
    private double y;

    public CoordinatesPointConstructorEnum(double a, double b, CoordinateSystem system) {
        switch (system) {
            case CARTESIAN: {
                this.x = a;
                this.y = b;
                break;
            }
            case POLAR: {
                this.x = a * Math.cos(b);
                this.y = a * Math.sin(b);
                break;
            }
            default:
                throw new IllegalArgumentException("Wrong Coordinate System");
        }
    }

}
