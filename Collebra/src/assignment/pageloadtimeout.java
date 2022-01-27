package assignment;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageloadtimeout {
private static final OutputType OutputType = null;
private static File screenshot;

public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	screenshot=driver.getScreenshotAs(OutputType.FILE);
	System.out.println("screenshot");
 File Destfile = new File("./errorshots/webpage.png");
 //FileUtils.copyFile(screenshot, Destfile);
 //FileUtils.copyFile(screenshot, Destfile);
 FileUtils.copyFile(screenshot, Destfile);
	
	
	
	
	
}
}
