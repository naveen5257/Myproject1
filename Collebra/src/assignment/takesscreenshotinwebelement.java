package assignment;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class takesscreenshotinwebelement {

public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.naukari.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	File screensheet1 = driver.getScreenshotAs(OutputType.FILE);
	 File destiny = new File("./errorshots/zomato.png12");
	 screensheet1.renameTo(destiny);
	 FileUtils.copyFile(screensheet1, destiny);
	
}
}
