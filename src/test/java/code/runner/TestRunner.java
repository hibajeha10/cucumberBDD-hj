package code.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)        // use runWith to integrate junit with runner class, so we can run scenarios and assertions
@CucumberOptions(
        features = "src/test/resources",    // This is to connect feature files with runner class
                                           // we need to copy path of Resources Folder as following: path from content root

        glue = "code/stepsDefinitions",   // This is to connect stepsDefinition with runner class
                                          // we need to copy path of stepDefinitions Folder as following: path from source root

        tags = "@TC400",     // This is the field that we'll use to run tags
        dryRun = true                  // this is to get undefined steps without running scenarios
)

public class TestRunner{



}
