import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*Steps to Automate:
 
1. Open this link - https://www.techlistic.com/p/selenium-practice-form.html
2. Enter first and last name (textbox).
3. Select gender (radio button).
4. Select years of experience (radio button).
5. Enter date.
6. Select Profession (Checkbox).
7. Select Automation tools you are familiar with (multiple checkboxes).
8. Select Continent (Select box).
9. Select multiple commands from a multi select box.
10. If you can handle Upload image then try it or leave this step.
11. Click on Download file link and handle the download file pop-up (leave it if you are beginner).
12. Click on Submit button.
13. Try your own logic and automate it without any help. If you still find it difficult to automate then follow reference links. */



public class PracticeForm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Installer\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");   //1. open link
		
		driver.findElement(By.name("firstname")).sendKeys("Dharti"); //2. first name

		driver.findElement(By.name("lastname")).sendKeys("Vaghasiya"); // 2. last name
		
		driver.findElement(By.id("sex-1")).click(); //3. select gender
		
		driver.findElement(By.id("exp-2")).click(); //4. select years of experience
		
		driver.findElement(By.id("datepicker")).sendKeys("2022-03-21"); //5.enter date
		
		driver.findElement(By.id("profession-0")).click(); //6.select professional
		 
		driver.findElement(By.id("profession-1")).click();
		
		driver.findElement(By.id("tool-2")).click(); //7.select tool
		
		Select dropdown = new Select (driver.findElement(By.id("continents"))); //8. select continents
		dropdown.selectByVisibleText("North America");
		
	    new Select (driver.findElement(By.id("selenium_commands"))); //9.select multicommands
	    dropdown.getAllSelectedOptions();
		
	  //  driver.findElement(By.id("photo")).click();
	    
	    driver.findElement(By.id("submit")).click();
		
		
		
	}

}
