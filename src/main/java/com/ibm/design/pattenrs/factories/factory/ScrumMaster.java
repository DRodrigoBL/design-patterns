package com.ibm.design.pattenrs.factories.factory;

import java.util.Arrays;

public class ScrumMaster extends IBMer {

  public ScrumMaster(String name) {
    super(name, "Agilist", "Removing team impediments",
        Arrays.asList("Scrum Poker", "Remove Impediments", "Help the team"));
  }


}
