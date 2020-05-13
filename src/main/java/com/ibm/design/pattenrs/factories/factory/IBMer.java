package com.ibm.design.pattenrs.factories.factory;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public abstract class IBMer {

  @Getter
  private String name;
  
  @Getter
  private String ibmerType;
  private String specialty;
  private List<String> skills;

  public void doSpecialty() {
    log.info("{} is a {} doing the specialty: '{}'", this.name, this.ibmerType, this.specialty);
  }

  public void showSkills() {
    log.info("The  {}, {} has the skill set: '{}'", this.ibmerType, this.name, this.skills);
  }
}
