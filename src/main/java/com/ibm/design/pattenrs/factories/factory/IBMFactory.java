package com.ibm.design.pattenrs.factories.factory;

import java.util.Arrays;
import java.util.List;

public class IBMFactory {

  private List<String> catalog;

  public IBMFactory() {
    super();
    this.catalog = Arrays.asList("DataScientist", "JavaDeveloper", "ScrumMaster");

  }

  public IBMer createIBMer(String whichIBMer, String name) {

    if (!this.catalog.contains(whichIBMer)) {
      throw new IllegalArgumentException("IBM has not that kind of person, Sorry!");
    } else if (whichIBMer.equals("DataScientist")) {
      return new DataScientist(name);
    } else if (whichIBMer.equals("JavaDeveloper")) {
      return new JavaDeveloper(name);
    } else {
      return new ScrumMaster(name);
    }
  }

  public List<String> getIBMCatalog() {
    return this.catalog;
  }


}
