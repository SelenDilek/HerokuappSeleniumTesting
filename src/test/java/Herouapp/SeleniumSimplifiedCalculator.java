package Herouapp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

@Test

public class SeleniumSimplifiedCalculator {

    WebDriver driver;
    Actions actions ;

    @BeforeClass
    public  void main() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
       // WebDriver.Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(15);
        Thread.sleep(1000);
        driver.get("https://testpages.herokuapp.com/calculate.php");
        Thread.sleep(1000);

    }

       @Test(priority = 1)
    public void Calculator()throws InterruptedException{

        WebElement box1 = driver.findElement(By.cssSelector("input[name=\"number1\"]"));
           WebElement box2 = driver.findElement(By.cssSelector("input[name=\"number2\"]"));
           box1.clear();
           box2.clear();
           Thread.sleep(2000);


           box1.click();
           box1.sendKeys("10");
           Thread.sleep(1000);


           box2.click();
           box2.sendKeys("5");
           Thread.sleep(1000);



        WebElement selclick = driver.findElement(By.xpath("//*[@id=\"function\"]"));
        selclick.click();
        Thread.sleep(1000);

        WebElement selection1 = driver.findElement(By.xpath("//*[@id=\"function\"]"));
        Select sel1 = new Select(selection1);
        sel1.selectByIndex(0);
        System.out.println(sel1);
           Thread.sleep(1000);



           WebElement calculate = driver.findElement(By.id("calculate"));
           calculate.click();
           Thread.sleep(1000);

           WebElement expectedc= driver.findElement(By.id("answer"));
           String expected = expectedc.getText();

          String actual = "15";

           Assert.assertEquals(actual,expected);

        Thread.sleep(2000);




    }

    @Test(priority = 2)
    public void Calculator2()throws InterruptedException {

        WebElement box3 = driver.findElement(By.cssSelector("input[name=\"number1\"]"));
        WebElement box4 = driver.findElement(By.cssSelector("input[name=\"number2\"]"));

        box3.clear();
        box4.clear();
        Thread.sleep(2000);

        box3.click();
        box3.sendKeys("10");
        Thread.sleep(1000);


        box4.click();
        box4.sendKeys("5");
        Thread.sleep(1000);


        WebElement selclick = driver.findElement(By.xpath("//*[@id=\"function\"]"));
        selclick.click();
        Thread.sleep(1000);

        WebElement selection1 = driver.findElement(By.xpath("//*[@id=\"function\"]"));
        Select sel2 = new Select(selection1);
        sel2.selectByIndex(1);
        System.out.println(sel2);
        Thread.sleep(1000);


        WebElement calculate = driver.findElement(By.id("calculate"));
        calculate.click();
        Thread.sleep(1000);

        WebElement expectedc = driver.findElement(By.id("answer"));
        String expected2 = expectedc.getText();

        String actual2 = "50";

        Assert.assertEquals(actual2, expected2);

        Thread.sleep(1000);



    }



    @Test(priority = 3)
        public void Calculator4() throws InterruptedException {

        WebElement box5 = driver.findElement(By.cssSelector("input[name=\"number1\"]"));
        WebElement box6 = driver.findElement(By.cssSelector("input[name=\"number2\"]"));

        box5.clear();
        box6.clear();
        Thread.sleep(2000);

            box5.click();
            box5.sendKeys("10");
            Thread.sleep(1000);


            box6.click();
            box6.sendKeys("5");
            Thread.sleep(1000);


            WebElement selclick1 = driver.findElement(By.xpath("//*[@id=\"function\"]"));
            selclick1.click();
            Thread.sleep(1000);

            WebElement selection3 = driver.findElement(By.xpath("//*[@id=\"function\"]"));
            Select sel3 = new Select(selection3);
            sel3.selectByIndex(2);
            System.out.println(sel3);
            Thread.sleep(1000);


            WebElement calculate1 = driver.findElement(By.id("calculate"));
            calculate1.click();
            Thread.sleep(1000);

            WebElement expectedc1 = driver.findElement(By.id("answer"));
            String expected1 = expectedc1.getText();

            String actual1 = "5";

            Assert.assertEquals(actual1, expected1);

            Thread.sleep(1000);


        }

    @Test(priority = 4)
    public void Calculator3() throws InterruptedException {

        WebElement box7 = driver.findElement(By.cssSelector("input[name=\"number1\"]"));
        WebElement box8 = driver.findElement(By.cssSelector("input[name=\"number2\"]"));
        box7.clear();
        box8.clear();
        Thread.sleep(2000);


        box7.click();
        box7.sendKeys("10");
        Thread.sleep(1000);


        box8.click();
        box8.sendKeys("5");
        Thread.sleep(1000);


        WebElement selclick3 = driver.findElement(By.xpath("//*[@id=\"function\"]"));
        selclick3.click();
        Thread.sleep(1000);

        WebElement selection4 = driver.findElement(By.xpath("//*[@id=\"function\"]"));
        Select sel4 = new Select(selection4);
        sel4.selectByIndex(3);
        System.out.println(sel4);
        Thread.sleep(1000);


        WebElement calculate2 = driver.findElement(By.id("calculate"));
        calculate2.click();
        Thread.sleep(1000);

        WebElement expectedc3 = driver.findElement(By.id("answer"));
        String expected3 = expectedc3.getText();

        String actual3 = "2";

        Assert.assertEquals(actual3, expected3);

        Thread.sleep(1000);



    }

        // public void tearDown() throws InterruptedException {

        //driver.quit();
       // Thread.sleep(9000);}


    }


