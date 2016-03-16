package Classes;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelRead {
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.orbitz.com/");
		dr.findElement(By.xpath("//span[@class='primaryRadioMessage needsclick']")).click();
		Thread.sleep(2000);
		dr.findElement(By.name("ar.rt.leaveSlice.orig.key")).sendKeys("DFW");
		dr.findElement(By.name("ar.rt.leaveSlice.dest.key")).sendKeys("MCI");
		dr.findElement(By.xpath("//input[@name = 'ar.rt.leaveSlice.date']")).sendKeys("02/22/2016");
		dr.findElement(By.xpath("//input[@name ='ar.rt.returnSlice.date']")).sendKeys("03/01/2016");
		dr.findElement(By.xpath("//input [@name='search']")).click();
		
		
		
//		dr.get("http://www.facebook.com/");
//		dr.findElement(By.id("email")).sendKeys("karthinandina@gmail.com");
//		dr.findElement(By.id("pass")).sendKeys("9143143143");
//		dr.findElement(By.xpath("//input[@name='persistent']")).click();
//		dr.findElement(By.xpath("//input[@value='Log In']")).click();		
		System.out.println("Got it!");
		
	}

}
