package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBankBranchCreation {

       public static void main(String[] args) throws Exception 
	{
   		System.setProperty("webdriver.gecko.driver","C:\\Users\\DIGITAL\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("http://primusbank.qedgetech.com/");
        driver.manage().window().maximize();
        
     //Application Login
        
        driver.findElement(By.id("txtuId")).sendKeys("Admin");
        driver.findElement(By.id("txtPword")).sendKeys("Admin");
        driver.findElement(By.id("login")).click();
        Thread.sleep(2000);
     //Branch Creation
  
        driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("BtnNewBR")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("txtbName")).sendKeys("Qedge1234595");
        driver.findElement(By.id("txtAdd1")).sendKeys("AMEERPET");
        driver.findElement(By.id("txtZip")).sendKeys("55555");
        Thread.sleep(2000);
        
        Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
        country.selectByIndex(1);
        Thread.sleep(2000);
        Select state=new Select(driver.findElement(By.id("lst_stateI")));
        state.selectByIndex(1);
        Thread.sleep(2000);
        Select city=new Select(driver.findElement(By.id("lst_cityI")));
        city.selectByIndex(1);
        Thread.sleep(2000);
        driver.findElement(By.id("btn_insert")).click();
        
        

	}

}
