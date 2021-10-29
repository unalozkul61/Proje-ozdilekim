package org.example;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.appmanagement.ApplicationState;
import org.openqa.selenium.By;

public class StepImplementation extends BaseTest {
    @Step("<time> saniye bekle")
    public void waitTime(int time) throws InterruptedException {
        Thread.sleep(1000 * time);
    }
    @Step("<Key> xpath'li elemente tıkla")
    public void clickElementByxpath(String Key){
        appiumDriver.findElement(By.xpath(Key)).click();
        System.out.println(Key+"Elementine tıklandı");
    }
  /* @Step("<Key> id'li elementini kontorl et")
   public void AssertEqual(String Key){
        appiumDriver.findElement(By.id(Key));
        AssertEqual(Key);
   }

   */

    @Step("<Key> id'li elemente tıkla")
    public void AlısVerisBasla(String Key){
        appiumDriver.findElement(By.id(Key)).click();
        System.out.println("Elementine Tıkla"+ Key);

    }
    @Step("<Key> xpath'li elemente tıkla")
    public void KatogoriyeTıkla(String Key){
        appiumDriver.findElement(By.xpath(Key)).click();
        System.out.println("Elementine Tıkla "+ Key);
    }
    @Step("<Key> xpath'li elemente tıkla")
    public void KadınaTıkla(String Key){
        appiumDriver.findElement(By.xpath(Key)).click();
        System.out.println("Elementine Tıkla" +Key);
    }
    @Step("<Key> xpath'li elemente tıkla")
    public void PantolanaTıkla(String Key){
        appiumDriver.findElement(By.xpath(Key)).click();
        System.out.println("Elementine  tıkla" + Key);
    }
    @Step("<Key> xpath'li elemente tıkla")
    public void SelectClick(String Key){
        appiumDriver.findElement(By.xpath(Key)).click();
        System.out.println("Elemena Tıkla " + Key);
    }
    @Step("<Key> id'li elemente tıkla")
    public void FavButton(String Key){
        appiumDriver.findElement(By.id(Key)).click();
        System.out.println("Elemente Tıkla"+ Key);
    }
    @Step("<Key> id'li elemente tıkla")
    public void Mail(String Key){
        appiumDriver.findElement(By.id(Key)).sendKeys("unal.ozkul");
        System.out.println("Elemana  Yaz"+Key);
    }
    @Step("<Key> id'li elemente tıkla")
    public void PassWord(String Key){
        appiumDriver.findElement(By.id(Key)).sendKeys("1234567");
        System.out.println("Elementi yaz"+Key);
    }
    @Step("<Key> id'li elemente tıkla")
    public void BackButton(String Key){
        appiumDriver.findElement(By.id(Key)).click();
        System.out.println("Elemente tıkla"+Key);
    }
    @Step("<Key> xpath'li elemente tıkla")
    public void ProductClick(String Key){
        appiumDriver.findElement(By.xpath(Key)).click();
        System.out.println("Elemente tıkla"+Key);
    }
    @Step("<Key> id'li elemente tıkla")
    public void AddCart(String Key){
        appiumDriver.findElement(By.id(Key)).click();
        System.out.println("Elemente tıkla"+Key);
    }



}
