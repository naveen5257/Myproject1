package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class just {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/search?q=phones+in+flipcart&rlz=1C1FHFK_enIN988IN988&ei=IO3jYdarN-CJ4-EPt9OxiA0&ved=0ahUKEwjWu62Igrb1AhXgxDgGHbdpDNEQ4dUDCA4&uact=5&oq=phones+in+flipcart&gs_lcp=Cgdnd3Mtd2l6EAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyDQguEMcBENEDELADEEMyBwgAELADEENKBAhBGABKBQhAEgExSgQIRhgAUABYAGCVvhloBHABeACAAQCIAQCSAQCYAQDIAQrAAQE&sclient=gws-wiz");
	driver.findElement(By.xpath("(//img[@height=\"139\"]/../../../../../../..//div[text()='₹9,499'])[3])")).click();
	
	
	
}
}
