package asgn2.swiftcodes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.digest.HmacAlgorithms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

public class SwiftCodesList
{
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;

	public static void main(String args[])
	{
		int timeout=60;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Assignment1\\Assignment2\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
			wait=new WebDriverWait(driver,timeout);
			driver.manage().window().maximize();
			driver.get("https://www.theswiftcodes.com/malaysia/");
			driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);

			List<WebElement> tr_data= driver.findElements(By.xpath(".//table[@class='swift']/tbody/tr"));

			for(int i=2;i<=tr_data.size()-1;i++ )
			{
				WebElement bank_name= driver.findElement(By.xpath(".//table[@class='swift']/tbody/tr["+i+"]/td[2]"));
				WebElement swify_codes= driver.findElement(By.xpath(".//table[@class='swift']/tbody/tr["+i+"]/td[5]"));
				System.out.println("Bank name :'" +bank_name.getText()+"' and "+"swift code is :"+swify_codes.getText());
			}
		
	}
}