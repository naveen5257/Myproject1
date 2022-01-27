package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffmail {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rediff.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Sign in")).click();
	WebElement usernametxf = driver.findElement(By.id("login1"));
	usernametxf.clear();
	usernametxf.sendKeys("sumanthElfBatch@rediffmail.com");
	WebElement passwordtxf = driver.findElement(By.id("password"));
	passwordtxf.clear();
	passwordtxf.sendKeys("Testing@123");
	driver.findElement(By.name("proceed")).click();
	WebElement enteredenteremail = driver.findElement(By.linkText("Write mail"));
	enteredenteremail.click();
WebElement tonameemail = driver.findElement(By.id("TO_IDcmp2"));
tonameemail.clear();
tonameemail.sendKeys("sumanthElfBatch@rediffmail.com",Keys.ENTER);
WebElement subjectarea = driver.findElement(By.xpath("(//input[@type=\"text\"])[11]"));
subjectarea.clear();
subjectarea.sendKeys("Naveen",Keys.ENTER);
//driver.switchTo().

//driver.findElement(by.)
//driver.findElement(By.xpath("(//cite[@class=\"rd_mail_tickbox\"])[1]")).click();
WebElement iframeelement = driver.findElement(By.xpath("//iframe[@title=\"Rich Text Editor, rdMailEditorcmp2\"]"));
driver.switchTo().frame(iframeelement);
//iframeelement.sendKeys("hi sir good evening");
WebElement frame1 = driver.findElement(By.xpath("//body[@contenteditable=\"true\"]"));
frame1.sendKeys("hi sir good evening");
//driver.findElement(By.xpath("//a[@class=\"send_ng_compo rd_btn_cmp_send\"]")).click();
//driver.findElement(By.xpath("//a[text()='Send']")).click();
// 

}
}
