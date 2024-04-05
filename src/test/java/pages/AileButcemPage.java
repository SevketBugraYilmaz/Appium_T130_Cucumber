package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {
    public  AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);


    }
    public void ilkEkranAyarlari(){
        ReusableMethods.wait(2);
        for (int i = 0; i <6; i++) {
            ReusableMethods.ekranKaydirmaMethodu(951,1001,750,117,1001);
        }

    }
}
