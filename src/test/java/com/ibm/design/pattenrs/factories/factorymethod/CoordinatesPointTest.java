package com.ibm.design.pattenrs.factories.factorymethod;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoordinatesPointTest {

    @Test
    public void test_ConstructorOverloading() {
        CoordinatesPointConstructorOverloading point =
                new CoordinatesPointConstructorOverloading(10, 20);
        Assertions.assertThat(point.getX()).isEqualTo(10);
        Assertions.assertThat(point.getY()).isEqualTo(20);
    }

    @Test
    public void test_ConstructorEnum() {
        CoordinatesPointConstructorEnum polarPoint =
                new CoordinatesPointConstructorEnum(20, 40, CoordinateSystem.POLAR);
        Assertions.assertThat(polarPoint.getX()).isEqualTo(20 * Math.cos(40));
        Assertions.assertThat(polarPoint.getY()).isEqualTo(20 * Math.sin(40));

        CoordinatesPointConstructorEnum cartesianPoint =
                new CoordinatesPointConstructorEnum(20, 40, CoordinateSystem.CARTESIAN);
        Assertions.assertThat(cartesianPoint.getX()).isEqualTo(20);
        Assertions.assertThat(cartesianPoint.getY()).isEqualTo(40);
    }

    @Test
    public void test_ConstructorFactory() {
//        CoordinatesPointWithFactory polarPoint =
//                new CoordinatesPointWithFactory(20, 40, CoordinateSystem.POLAR);

        CoordinatesPoint cartesianPoint =
                CoordinatesPoint.Factory.createCartesianPoint(20, 40);
        Assertions.assertThat(cartesianPoint.getX()).isEqualTo(20);
        Assertions.assertThat(cartesianPoint.getY()).isEqualTo(40);

        CoordinatesPoint polarPoint =
                CoordinatesPoint.Factory.createPolarPoint(20, 40);
        Assertions.assertThat(polarPoint.getX()).isEqualTo(20 * Math.cos(40));
        Assertions.assertThat(polarPoint.getY()).isEqualTo(20 * Math.sin(40));
    }

    }
