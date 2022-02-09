
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	

	public static void main(String[] arg) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dinesh\\Documents\\eclipse-workspace\\sele-projects\\SeleniumTopics\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");		
//=========================================================================================================================================//
		
		
//		// print all the values from the table
//		System.out.print(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table")).getText());
		
		
//========================================================================================================================================//
		
		
//		//print all rows from the table
//		List<WebElement> allRows = driver.findElements(By.tagName("tr"));
//		for (WebElement row : allRows) {
//			System.out.println(row.getText());
//		}
	
		
//=========================================================================================================================================//
		
		
		//print all columns from the table
		List<WebElement> allRows = driver.findElements(By.tagName("tr"));
		for (int i = 1; i < allRows.size(); i++) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+ i +"]/td[3]")).getText()); 
			}
			
		
//========================================================================================================================================//
	
	
	
	
	}

}
