
	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
public class AmazonHomePageImagesLinks 
{

		public static WebDriver driver=null;
		public static WebDriverWait wait=null;

		public static void main(String args[])
		{
			int timeout=30;
			System.setProperty("webdriver.driver.geckodriver", "D:\\Assignment1\\Assmnt1\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			
				wait=new WebDriverWait(driver,timeout);
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
		
				List<WebElement> images = driver.findElements(By.tagName("img"));
				
				System.out.println("Total number of links are:"+images.size());
				
				for(int i=0;i<=images.size()-1;i++)
				{
					int c=i+1;
					System.out.println("LINK-"+ c +" :"+images.get(i).getAttribute("src"));
				}
		
		}
		
}
