package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWClass03Task01 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");

        WebElement name=driver.findElement(By.cssSelector("input[placeholder= 'First Name']"));
        name  .sendKeys("Yana");

        WebElement last=driver.findElement(By.cssSelector("input[name='last_name']"));
        last .sendKeys("Wallace");

        WebElement email=     driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("onecall@gmail.com");

        WebElement phone= driver.findElement(By.cssSelector("input[name='phone']"));
        phone.sendKeys("702-337-9659");

        WebElement adress=driver.findElement(By.cssSelector("input[name='address']"));
        adress.sendKeys("493 Chelsea Dr");

        WebElement city=driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("Henderson");

        WebElement state=driver.findElement(By.xpath("//option[text()= 'Nevada']"));
        state.click();

        WebElement zip=driver.findElement(By.cssSelector("input[name='zip']"));
        zip.sendKeys("89014");



        WebElement web=driver.findElement(By.cssSelector("input[name='website']"));
        web.sendKeys("http/syntax.com");

        driver.findElement(By.cssSelector("input[value='yes']")).click();

        driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("Selenium Task");

        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    }

