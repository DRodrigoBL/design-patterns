package com.ibm.design.pattenrs.factories.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IBMFactoryJava8 {

  private Map<String, Function<String, IBMer>> catalogMap;

  public IBMFactoryJava8() {
    super();

    this.catalogMap = new HashMap<>();
    this.catalogMap.put("DataScientist", (ibmerName) -> new DataScientist(ibmerName));
    this.catalogMap.put("JavaDeveloper", (ibmerName) -> new JavaDeveloper(ibmerName));
    this.catalogMap.put("ScrumMaster", (ibmerName) -> new ScrumMaster(ibmerName));

  }

  public IBMer createIBMer(String whichIBMer, String name) {
    if (!catalogMap.containsKey(whichIBMer)) {
      throw new IllegalArgumentException("IBM has not that kind of person, Sorry!");
    } else {
      return catalogMap.get(whichIBMer).apply(name);
    }
  }

  public List<String> getIBMCatalog() {
    return this.catalogMap.keySet().stream().collect(Collectors.toList());
  }


}
