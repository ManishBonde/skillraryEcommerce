package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	public void dropDown(WebElement ele,String text) {
		Select s = new Select( ele);
		s.selectByVisibleText(text);
	}
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();
	}
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick().build().perform();
	}
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick().build().perform();
	}
	public void dragandDrop(WebDriver driver,WebElement src,WebElement tar) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, tar).build().perform();
	}
	public void switchToFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	public void switchBackFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void alertPopupOk(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void alertPopupCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public void switchTabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for (String  b : child) {
			driver.switchTo().window(b);
		}
	}
	public void srollBy(WebDriver driver,int x,int y) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
}
