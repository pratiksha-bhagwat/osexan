package saksham.singla;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AppTest 
{
	public static void main(String[] args) throws InterruptedException
    {
        // Set the system property for ChromeDrive
        // Instantiate the WebDriver and open a website (e.g., Google)
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/div[1]/p[2]/input")).sendKeys("Saksham Singla");
        driver.findElement(By.id("idOfButton")).click();
        WebElement element = driver.findElement(By.id("dblClkBtn"));
        Actions action = new Actions(driver);
        action.doubleClick(element).perform();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.name("gender")).click();
        driver.findElement(By.className("Automation")).click();
        driver.findElement(By.id("testingDropdown")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("performance")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/div[2]/button")).click();
        Thread.sleep(2000);
        alert = driver.switchTo().alert();        
        alert.accept();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/div[3]/button")).click();
        Thread.sleep(2000);
        alert = driver.switchTo().alert();
        alert.accept();
        WebElement source = driver.findElement(By.id("myImage"));
        WebElement destination = driver.findElement(By.id("targetDiv"));
        action.dragAndDrop(source, destination).perform();
        
    }
}

