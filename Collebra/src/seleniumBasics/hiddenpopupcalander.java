package seleniumBasics;

import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class hiddenpopupcalander {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	
	ChromeDriver driver =new ChromeDriver();
	 LocalDateTime ltd=LocalDateTime.now();
	 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.oyorooms.com/");
	driver.findElement(By.xpath("//div[@class=\"oyo-cell oyo-cell--12-col oyo-cell--8-col-tablet oyo-cell--4-col-phone d-text16 is-fontBold datePickerDesktop__checkInOut u-textEllipsis\"]")).click();	
	//Actions action =new Actions(driver);
	//action.click().perform();
	for(; ; ) {
	driver.findElement(By.xpath("//div[@class=\"DateRangePicker__PaginationArrowIcon DateRangePicker__PaginationArrowIcon--next\"]")).click();
	try {
		driver.findElement(By.xpath("(//div[@class=\"DateRangePicker__MonthHeader\"]/..//span[text()='20'])[1]")).click();
	}
	catch (Nosuchelementsexpression e){
	{
		
	}
}
}
