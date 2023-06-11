package hello1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myone
{




    public static void main(String[] args) throws InterruptedException {

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

        driver.findElement(By.xpath("//*[text()='Search']")).click();

        System.out.println("hello");

    }

    }
