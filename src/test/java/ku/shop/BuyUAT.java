package ku.shop;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
                 plugin = {"pretty", "html:target/cucumber"})
public class BuyUAT {
    // features : path of file 'features'
    // (depend on project structure/features must be in resources)
    // plubin : pretty = let cucumber generate output files by specifc format
}