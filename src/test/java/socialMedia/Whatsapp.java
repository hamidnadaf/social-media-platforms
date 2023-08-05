package socialMedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Whatsapp {
  @Test
  public void whatsapp_Test() throws InterruptedException 
  {	  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
  driver.get("https://www.whatsapp.com/");
  Thread.sleep(3000);
  driver.close();
  }
}
