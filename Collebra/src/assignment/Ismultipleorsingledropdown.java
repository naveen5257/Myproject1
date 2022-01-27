package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismultipleorsingledropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/Naveen/Downloads/dropDown.html");
	WebElement multipleDropdown = driver.findElement(By.id("m1"));
//Select multipleID=new Select(multipleDropdown);
//System.out.println(multipleID.isMultiple());
//WebElement sigleDropdown = driver.findElement(By.id("s1"));
//Select single=new Select(sigleDropdown);
//System.out.println(single.isMultiple());
driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805943%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=550525805943&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D9062072%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIzaywlqm49QIVyQorCh2t3A5eEAAYASAAEgJ_LPD_BwE");
//WebElement daybox= driver.findElement(By.id("day"));
//Select daylist=new Select(daybox);
//List<WebElement> Listofthedays = daylist.getOptions();
//for(WebElement ele:Listofthedays) {
	//System.out.println(ele.getText());
	//WebElement monthbox = driver.findElement(By.id("month"));
	//Select listofmonth=new Select(monthbox);
		//	List<WebElement> numberofmonths = listofmonth.getOptions();
//	for(WebElement ele1:numberofmonths) {
	//	System.out.println(ele1.getText());
		//WebElement yearbox = driver.findElement(By.id("year"));
			//	Select listoftheyr=new Select(yearbox);
		//List<WebElement> alltheyr = listoftheyr.getOptions();
		//		for(WebElement ele2:alltheyr) {
			//		System.out.println(ele2.getText());
WebElement list1 = driver.findElement(By.id("day"));
Select listnumber=new Select(list1);
listnumber.selectByIndex(1);
listnumber.selectByValue("2");
listnumber.selectByVisibleText("4");//in this facbook it not the multipleDropdown that y its thrown as exception
				}
		
			
	}

}

	
	


