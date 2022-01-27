package seleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class pageresource {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	FirefoxDriver Driver =new FirefoxDriver();
	Driver.get("https://www.zomato.com/bangalore");
System.out.println(Driver.getPageSource());
}
}
