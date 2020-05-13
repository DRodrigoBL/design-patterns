package com.ibm.design.pattenrs.factories.factory;

import java.util.Arrays;

public class DataScientist extends IBMer {

  public DataScientist(String name) {
    super(name, "DataScientist", "Building a Machine Learning Model",
        Arrays.asList("Machine Learning", "Data Analytics", "Data visualization"));
  }

}
