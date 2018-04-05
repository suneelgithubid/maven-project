package com.mulesoft.training;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("maven-projectFlow", "Hello Maven");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}
