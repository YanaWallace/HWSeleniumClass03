package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement createNewAcc= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAcc.click();
        Thread.sleep(2000);
        WebElement fName= driver.findElement(By.cssSelector("input[name='firstname']"));
        fName.sendKeys("Yana");



    }
}
