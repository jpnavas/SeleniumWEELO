import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class AutomationPractice {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, AWTException {


        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        System.out.println("WebDriver inicializado"); // Imprime en pantalla.
        driver = new ChromeDriver(); // Define la variable "driver" como un driver especifico del navegador.

        driver.manage().window().maximize();
        driver.get(" http://automationpractice.com/index.php"); // Estable la página en la que inicia el navegador.
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); // Tiempo de espera implicito.

        WebElement Search = driver.findElement(By.id("search_query_top"));
        Search.sendKeys("Dresses");

        WebElement SearchButton = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
        SearchButton.click();

        Thread.sleep(10000);
        driver.quit();
    }
}