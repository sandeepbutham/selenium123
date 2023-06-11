package hello1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Renuglaty
{


@Test
void testing() throws InterruptedException {

        System.setProperty("WebDriver.Chrome.driver", "Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[text()='Round Trip']")).click();
        Thread.sleep(5000);
     WebElement ss=  driver.findElement(By.xpath("//input[ @id ='fromCity'  and \"contains(text(),'fromCity')\"]"));
     ss.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(" //input[@placeholder='From']")).sendKeys("Hyderbad");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[text()='Hyderabad, India']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='To']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(" //input[@placeholder='To']")).sendKeys("Delchi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='New Delhi, India']")).click();

    driver.findElement(By.xpath("//*[text()='Departure']")).click();
    //*[@class='DayPicker-Caption']

    Thread.sleep(2000);
    String text = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
    Thread.sleep(2000);
    while (!(text.equals("October 2023"))) {
        driver.findElement(By.xpath("//*[@aria-label='Next Month']")).click();
        text = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();

    }
    String date = "20";

    driver.findElement(By.xpath("//p[text()='"+date+"']")).click();



    driver.findElement(By.xpath("//*[text()='Return']")).click();

    Thread.sleep(2000);
    String text1 = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
    Thread.sleep(2000);
    while (!(text1.equals("October 2023")))

    {
        driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        text1 = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
    }

    driver.findElement(By.xpath("//p[text()='21']")).click();


    driver.findElement(By.xpath("//*[text()='Search']")).click();

    }

    }
