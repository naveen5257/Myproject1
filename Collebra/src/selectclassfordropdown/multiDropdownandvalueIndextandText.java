package selectclassfordropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiDropdownandvalueIndextandText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Naveen/Downloads/dropDown.html");
	WebElement listoftheelements = driver.findElement(By.id("s1"));
	Select listorder=new Select(listoftheelements);
	List<WebElement> listoptions = listorder.getOptions();
			for(WebElement ele:listoptions) {
				System.out.println(ele.getText());
			listorder.selectByValue("2");
			//listorder.selectByVisibleText("");
			}
	//listorder.selectByIndex(0);
	//listorder.selectByValue("2");
	//Thread.sleep(3000);
//	listorder.selectByVisibleText("4");
	//Thread.sleep(3000);
	//listorder.deselectAll();
	//Thread.sleep(3000);
	//listorder.selectByVisibleText("Orange");
		
		
		
	}

}
