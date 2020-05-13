package com.ibm.design.pattenrs.factories.factory;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.Test;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IBMerFactoryTest {

  @Test
  public void DataScientistTest() {
    
    IBMFactory ibmFactory = new IBMFactory();
    
    List<String> ibmCatalog = ibmFactory.getIBMCatalog();
    
    log.info("Possible ibm persons: '{}'", ibmCatalog);
    
    IBMer dataScientist = ibmFactory.createIBMer("DataScientist", "Angelica");
    
    dataScientist.doSpecialty();
    dataScientist.showSkills();
    
    assertThat(dataScientist).isInstanceOf(DataScientist.class);
    assertThat(dataScientist.getName()).isEqualTo("Angelica");
    assertThat(dataScientist.getIbmerType()).isEqualTo("DataScientist");
  }
  
  @Test
  public void JavaDeveloperTest() {
    
    IBMFactory ibmFactory = new IBMFactory();
    
    List<String> ibmCatalog = ibmFactory.getIBMCatalog();
    
    log.info("Possible ibm persons: '{}'", ibmCatalog);
    
    IBMer dataScientist = ibmFactory.createIBMer("JavaDeveloper", "Jesus");
    
    dataScientist.doSpecialty();
    dataScientist.showSkills();
    
    assertThat(dataScientist).isInstanceOf(JavaDeveloper.class);
    assertThat(dataScientist.getName()).isEqualTo("Jesus");
    assertThat(dataScientist.getIbmerType()).isEqualTo("JavaDeveloper");
  }
  
  @Test
  public void ScrumMasterTest() {
    
    IBMFactory ibmFactory = new IBMFactory();
    
    List<String> ibmCatalog = ibmFactory.getIBMCatalog();
    
    log.info("Possible ibm persons: '{}'", ibmCatalog);
    
    IBMer dataScientist = ibmFactory.createIBMer("ScrumMaster", "Brenda");
    
    dataScientist.doSpecialty();
    dataScientist.showSkills();
    
    assertThat(dataScientist).isInstanceOf(ScrumMaster.class);
    assertThat(dataScientist.getName()).isEqualTo("Brenda");
    assertThat(dataScientist.getIbmerType()).isEqualTo("Agilist");
  }
  
}
