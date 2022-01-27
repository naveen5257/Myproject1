package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://trello.com/b/0HsBjhVH/naveen");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("user")).sendKeys("naveenr9535@gmail.com");
	driver.findElement(By.id("login")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("Naveenrls@321");
	driver.findElement(By.xpath("//span[text()='Log in']")).click();
	WebElement draganddrop1 = driver.findElement(By.xpath("(//a[@class=\"list-card js-member-droppable ui-droppable\"])[1]"));
	//WebElement Draganddrop = driver.findElement(By.xpath("//span[text()='assignment']"));
	
	Actions actions=new Actions(driver);
	Thread.sleep(3000);
	actions.dragAndDropBy(draganddrop1, 800,0);
	
}
}
