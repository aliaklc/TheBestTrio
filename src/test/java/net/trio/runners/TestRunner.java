package net.trio.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features", // content root
        glue = "net/trio/step_definitions"  // source root


)


public class TestRunner {
}
