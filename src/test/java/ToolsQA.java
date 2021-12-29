import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class ToolsQA {
    public static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException, AWTException {


        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        System.out.println("WebDriver inicializado"); // Imprime en pantalla.
        driver = new ChromeDriver(); // Define la variable "driver" como un driver especifico del navegador.

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form"); // Estable la página en la que inicia el navegador.
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); // Tiempo de espera implicito.


        WebElement FirstName;
        FirstName = driver.findElement(By.id("firstName"));
        FirstName.sendKeys("Juan Pablo");

        WebElement LastName;
        LastName = driver.findElement(By.id("lastName"));
        LastName.sendKeys("Navas Arango");

        WebElement Email;
        Email = driver.findElement(By.id("userEmail"));
        Email.sendKeys("jpablo-na993@hotmail.com");

        WebElement Gender;
        Gender = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/div[1]/label"));
        Gender.click();

        WebElement Mobile;
        Mobile = driver.findElement(By.id("userNumber"));
        Mobile.sendKeys("3152875299");


        WebElement DateBirth;
        DateBirth = driver.findElement(By.id("dateOfBirthInput"));
        DateBirth.click();


        WebElement YearList;
        YearList = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
        YearList.click();

        WebElement Year;
        Year = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[94]"));
        Year.click();

        WebElement MonthList;
        MonthList = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
        MonthList.click();

        WebElement Month;
        Month = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[7]"));
        Month.click();

        WebElement Day;
        Day = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[6]"));
        Day.click();



        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

Thread.sleep(5000);
        WebElement Hobbies;
        Hobbies = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[7]/div[2]/div[1]"));
        Hobbies.click();

Thread.sleep(2000);
        WebElement Address;
        Address = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[9]/div[2]/textarea"));
        Address.sendKeys("car88 # 39-64");


        WebElement submit;
        submit = driver.findElement(By.id("submit"));
        submit.click();

        Thread.sleep(10000);
        driver.quit();


    }
}
