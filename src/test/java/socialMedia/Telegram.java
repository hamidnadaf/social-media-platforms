package socialMedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Telegram {
  @Test
  public void telegram_Test() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://web.telegram.org/k/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
