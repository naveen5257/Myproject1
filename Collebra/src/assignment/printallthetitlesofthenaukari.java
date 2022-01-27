package assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class printallthetitlesofthenaukari {
private static Set<String> string;
private static String t;

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/Chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	Driver.navigate().to("https://www.naukri.com/");
	Driver.manage().window().maximize();
	 Set<String> allwid = Driver.getWindowHandles();
      for(String windowId : allwid)
      {
    	  Driver.switchTo().window(windowId);
    	  System.out.println(Driver.getTitle());
    	  Driver.close();
      }
     
		
}
}
