package com.ibm.design.pattenrs.factories.factory;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.Test;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IBMerFactoryJava8Test {

  @Test
  public void DataScientistTest() {
    
    IBMFactoryJava8 IBMFactoryJava8 = new IBMFactoryJava8();
    
    List<String> ibmCatalog = IBMFactoryJava8.getIBMCatalog();
    
    log.info("Possible ibm persons: '{}'", ibmCatalog);
    
    IBMer dataScientist = IBMFactoryJava8.createIBMer("DataScientist", "Angelica");
    
    dataScientist.doSpecialty();
    dataScientist.showSkills();
    
    assertThat(dataScientist).isInstanceOf(DataScientist.class);
    assertThat(dataScientist.getName()).isEqualTo("Angelica");
    assertThat(dataScientist.getIbmerType()).isEqualTo("DataScientist");
  }
  
  @Test
  public void JavaDeveloperTest() {
    
    IBMFactoryJava8 IBMFactoryJava8 = new IBMFactoryJava8();
    
    List<String> ibmCatalog = IBMFactoryJava8.getIBMCatalog();
    
    log.info("Possible ibm persons: '{}'", ibmCatalog);
    
    IBMer dataScientist = IBMFactoryJava8.createIBMer("JavaDeveloper", "Jesus");
    
    dataScientist.doSpecialty();
    dataScientist.showSkills();
    
    assertThat(dataScientist).isInstanceOf(JavaDeveloper.class);
    assertThat(dataScientist.getName()).isEqualTo("Jesus");
    assertThat(dataScientist.getIbmerType()).isEqualTo("JavaDeveloper");
  }
  
  @Test
  public void ScrumMasterTest() {
    
    IBMFactoryJava8 IBMFactoryJava8 = new IBMFactoryJava8();
    
    List<String> ibmCatalog = IBMFactoryJava8.getIBMCatalog();
    
    log.info("Possible ibm persons: '{}'", ibmCatalog);
    
    IBMer dataScientist = IBMFactoryJava8.createIBMer("ScrumMaster", "Brenda");
    
    dataScientist.doSpecialty();
    dataScientist.showSkills();
    
    assertThat(dataScientist).isInstanceOf(ScrumMaster.class);
    assertThat(dataScientist.getName()).isEqualTo("Brenda");
    assertThat(dataScientist.getIbmerType()).isEqualTo("Agilist");
  }
  
}
