package Practise;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassMethod {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DIGITAL\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement drop=driver.findElement(By.id("searchDropdownBox"));
        Select sl=new Select(drop);
        
        //Select an element from dropdown
        Thread.sleep(3000);
       // sl.selectByIndex(32);
        sl.selectByVisibleText("Music");
       // sl.selectByValue("search-alias=furniture");
        
    //Capturing all the elements by dropdown
     /*   
       List<WebElement> dropList=sl.getOptions();
        System.out.println(dropList.size());
        for(WebElement element : dropList)
      {
        System.out.println(element.getText());
    	  
    	 
      }*/
      
   //Pirnting the first selected item in console
      
  // System.out.println(sl.getFirstSelectedOption().getText());
      
   //Verifying the dropdown it allowing for selecting  multiple item at a time
	  
    //  System.out.println(sl.isMultiple());
      
   //If multiple element are selected from dropdown printing the size and names   
	  
     /* sl.selectByVisibleText("Music");
      List<WebElement> allItems=sl.getAllSelectedOptions();
      System.out.println(allItems.size());
      
      for(WebElement element : allItems)
{
	 System.out.println(element.getText());
}*/
	}

}
