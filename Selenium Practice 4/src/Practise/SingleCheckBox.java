package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingleCheckBox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DIGITAL\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	     driver.manage().window().maximize();
	     
	    driver.findElement(By.id("remember")).click();
	    
	     
	     System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
	     
	     if(driver.findElement(By.id("remember")).isSelected())
	     {
	    	 driver.findElement(By.id("remember")).click();
	    	 System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
	     }

	}

}
