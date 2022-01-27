package assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;



public class assignent4 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.skillrary.com/");
	driver.manage().window().maximize();
	driver.getTitle();
	driver.getPageSource();
	//File screenshotofzomato = driver.getScreenshotAs(OutputType.FILE);
	//File destiny = new File ("./errorshots/zomato.png");
	//screenshotofzomato.renameTo(destiny);
	File name1 = driver.getScreenshotAs(OutputType.FILE);
	File destiny1=new File("./errorshots/kumar.png");
	name1.renameTo(destiny1);
	FileUtils.copyFile(name1, destiny1);
	
}
}
