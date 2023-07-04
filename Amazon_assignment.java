package seleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_assignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		
		//open amazon url link
		wd.get("https://www.amazon.in/");
		
		//search product i.e wrist watches 
		wd.findElement(By.id("twotabsearchtextbox")).sendKeys("Wrist Watches");
		wd.findElement(By.id("nav-search-submit-button")).click();
		
		//click on "analogue" display
		wd.findElement
		(By.xpath("//*[@id=\"p_n_feature_seven_browse-bin/1480900031\"]/span/a/div/label/i")).click();
		
		//click on brand i.e "titan"
		wd.findElement(By.xpath("//*[@id=\"p_89/Titan\"]/span/a/div/label/i")).click();
		
		//click on brand material i.e "leather"
		wd.findElement(By.xpath("//*[@id=\"p_n_material_browse/1480907031\"]/span/a/div/label/i")).click();
		Thread.sleep(2000);
		
		//click on discount i.e "25% off or more"
		wd.findElement(By.xpath("//*[@id=\"p_n_pct-off-with-tax/2665400031\"]/span/a/span")).click();
		
		
		
		
		
		}

}
