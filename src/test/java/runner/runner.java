package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"pretty",
                    "json:target/cucumber.json",},
            features = {"src/test/resources/features","src/test/resources/mobileTesting"},
            glue = "stepdefinitions",
            tags = "@ab",
            dryRun =false

            /*
            Eger dryRun true ise; Features da olusturmus oldugumuz steplerin stepfenitions da olup olmadigini kontrol eder.
            Yani eger features daki stepleri tanimiyorsa eksik adimlari bize soyler
            eger eksik adim yoksa test passed olur ama bu gercek testin passed oldugu anlamina gelmez

            Eger dryRun false ise; artik feature dali adimlari stepdefinitions da eksiksiz oldugunu ve testlerimizin
            kosturulabilir oldugunu ifade eder
             */
    )
    public class runner {
}
