package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {
  ChromeDriver driver;
   public BookMyShow()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
 public void bookshow() throws InterruptedException{
  driver.get("https://in.bookmyshow.com/explore/home/chennai");
  Thread.sleep(5000);
  List<WebElement> list = driver.findElements(By.tagName("a"));
        int listofurl = list.size();
        System.out.println(listofurl);
 }

  
}
