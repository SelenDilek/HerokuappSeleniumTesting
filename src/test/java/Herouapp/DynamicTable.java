package Herouapp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

@Test
public class DynamicTable {

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass
    public void main() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration(15));
        Thread.sleep(1000);
        driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
        Thread.sleep(1000);
    }
    @Test(priority = 1)
    public void table_No1() throws InterruptedException {

        WebElement td = driver.findElement(By.xpath("/html/body/div/div[3]/details/summary"));
        td.click();
        Thread.sleep(1000);

        WebElement tabledata = driver.findElement(By.xpath("//*[@id=\"jsondata\"]"));
        tabledata.click();
        tabledata.clear();
        WebElement caption = driver.findElement(By.xpath("//*[@id=\"caption\"]"));
        caption.clear();
        Thread.sleep(1000);
        WebElement Id = driver.findElement(By.xpath("//*[@id=\"tableid\"]"));
        Id.clear();
        Thread.sleep(1000);


        tabledata.sendKeys("[{\"name\" : \"Selen\", \"age\" : 25}, {\"name\": \"Gege\", \"age\" : 20}]");
        Thread.sleep(2000);

        caption.sendKeys("Dynamic Table");
        Thread.sleep(2000);

        Id.sendKeys("dynamictable");
        Thread.sleep(1000);

        WebElement button= driver.findElement(By.xpath("//*[@id=\"refreshtable\"]"));
        button.click();
        Thread.sleep(3000);

        WebElement title = driver.findElement(By.xpath("/html/body/div/h1"));

        Assert.assertTrue(title.isDisplayed(),"Dynamic HTML TABLE Tag");


    }

    @Test(priority = 2)
    public void table_No2() throws InterruptedException {


         WebElement dynamictable = driver.findElement(By.id("dynamictable"));
        List<WebElement> table1 = driver.findElements(By.id("dynamictable"));
        for(int i=0 ; i<table1.size(); i++){

            int size= table1.size();

            System.out.println("YAZI 1 : " + table1.get(i).getText());
            System.out.println("SIZE: " + size);

        }

        WebElement name = driver.findElement(By.xpath("//*[@id=\"dynamictable\"]/tr[2]/td[1]"));
        String expected = name.getText();
        System.out.println("EXPECTED YAZISI : " + expected);
        String actual ="Selen" ;
        Assert.assertEquals(actual,expected);

    }

    @Test(priority = 3)

    public void table_No3() throws InterruptedException {


       // js.executeScript("arguments[0].scrollIntoView(true);",dynamictable);
        //Thread.sleep(1000);


        WebElement dynamictable = driver.findElement(By.id("dynamictable"));
        List<WebElement> table2 = driver.findElements(By.id("dynamictable"));
        for(int i=0 ; i<table2.size(); i++){
            int size2= table2.size();

            System.out.println("YAZI : " + table2.get(0));
            System.out.println("YAZI : " + size2);

        }

        WebElement name1 = driver.findElement(By.xpath("//*[@id=\"dynamictable\"]/tr[3]/td[1]"));
        String expected = name1.getText();
        System.out.println("EXPECTED YAZISI : " + expected);
        String actual ="Gege" ;
        Assert.assertEquals(actual,expected);

    }

    }
