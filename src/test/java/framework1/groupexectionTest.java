package framework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class groupexectionTest {
	
	@Test
	public void facebookTest() {
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.facebook.com/");
	}
	
	@Test(groups="food")
	
	public void zomatoTest() {
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.zomato.com/");
	}

    @Test(groups="food")
	
	public void swiggyTest() {
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.swiggy.com/");
	}
}
