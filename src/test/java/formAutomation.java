import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.time.Duration;

public class formAutomation {
    WebDriver driver;
    @Before
    public void setup(){

//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headed");
//        driver = new ChromeDriver(options);

        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headed");
        driver = new FirefoxDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void _1_firstName () throws IOException{
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("firstName")).sendKeys("");
        driver.findElement(By.id("firstName")).sendKeys(Keys.ENTER);
        Utils.takeScreenshot(driver);
    }

    @Test
    public void _2_firstName (){
        //driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("firstName")).sendKeys("Kazi Nurul Amin");
    }

    @Test
    public void _3_lastName() throws IOException{
        //driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("lastName")).sendKeys("");
        driver.findElement(By.id("lastName")).sendKeys(Keys.ENTER);
        Utils.takeScreenshot(driver);
    }

    @Test
    public void _4_lastName(){
        //driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("lastName")).sendKeys("Sagar");
    }

    @Test
    public void _5_email () throws IOException{
        //driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("userEmail")).sendKeys("invalid@test");
        driver.findElement(By.id("userEmail")).sendKeys(Keys.ENTER);
        Utils.takeScreenshot(driver);
    }


    @Test
    public void _6_email() {
        //driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("userEmail")).clear();
        driver.findElement(By.id("userEmail")).sendKeys("kaziSagar@gmail.com");
        driver.findElement(By.id("userEmail")).sendKeys(Keys.ENTER);
    }

    @Test
    public void _7_genderSelect(){
        //driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
    }

    @Test
    public void _8_Mobile() throws IOException {
        //driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("userNumber")).sendKeys("196350018");
        driver.findElement(By.id("userEmail")).sendKeys(Keys.ENTER);
        Utils.takeScreenshot(driver);
    }

    @Test
    public void _9_Mobile(){
        //driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("userNumber")).sendKeys("1963500183");
    }

    @Test
    public void _10_birthDate(){
        //driver.get("https://demoqa.com/automation-practice-form");
        Actions actions = new Actions(driver);
        WebElement datePicker = driver.findElement(By.id("dateOfBirthInput"));
        datePicker.sendKeys(Keys.CONTROL+"a");
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("12 Aug 1994");
        driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.ENTER);
    }

//    @Test
//    public void subjectSelect(){
//        driver.get("https://demoqa.com/automation-practice-form");
//        List <WebElement> subjects = driver.findElements(By.className("css-1wa3eu0-placeholder"));
//        subjects.get(0).click();
//        subjects.get(0).sendKeys("Maths");
//        subjects.get(0).sendKeys(Keys.ENTER);
//    }

    @Test
    public void _11_hobbySelect(){
        //driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.xpath("//label[contains(text(),'Sports')]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Reading')]")).click();
    }

    @Test
    public void _12_uploadPicture(){
        //driver.get("https://demoqa.com/automation-practice-form");
        WebElement uploadElement = driver.findElement(By.id("uploadPicture"));
        uploadElement.sendKeys("D:\\picture.png");
    }

    @Test
    public void _13_currentAddress(){
        //driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("currentAddress")).sendKeys("83/84, Sabujbagh");
        driver.findElement(By.id("currentAddress-label")).click();
    }

//    @Test
//    public void _14_selectState(){
//        driver.get("https://demoqa.com/automation-practice-form");
//        List <WebElement> states= driver.findElements(By.className("css-1wa3eu0-placeholder"));
//        states.get(1).click();
//        states.get(1).sendKeys(Keys.ARROW_DOWN);
//        states.get(1).sendKeys(Keys.ARROW_DOWN);
//        states.get(1).sendKeys(Keys.ENTER);
//    }

//    @Test
//    public void _15_selectCity(){
//        driver.get("https://demoqa.com/automation-practice-form");
//        List <WebElement> states= driver.findElements(By.className("css-1wa3eu0-placeholder"));
//        states.get(2).click();
//        states.get(2).sendKeys(Keys.ARROW_DOWN);
//        states.get(2).sendKeys(Keys.ENTER);
//    }

    @Test
    public void submitButton(){
        //driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("submit")).sendKeys(Keys.ENTER);
    }

    @Test
    public void closeOverviewWindow(){
        //driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("closeLargeModal")).click();
    }



                         // ~~~~~~~~~~~~~~~~~~ Below code fills up the entire form and then submits it! ~~~~~~~~~~~~~~~~~~ //

//    @Test
//    public void submitForm(){
//
//        driver.get("https://demoqa.com/automation-practice-form");
//
//        driver.findElement(By.id("firstName")).sendKeys("Kazi Nurul Amin");
//        driver.findElement(By.id("lastName")).sendKeys("Sagar");
//        driver.findElement(By.id("userEmail")).sendKeys("kazi.sagar@northsouth.edu");
//        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
//        driver.findElement(By.id("userNumber")).sendKeys("1963500183");
//
//        Actions actions = new Actions(driver);
//        WebElement datePicker = driver.findElement(By.id("dateOfBirthInput"));
//        datePicker.sendKeys(Keys.CONTROL + "a");
//        driver.findElement(By.id("dateOfBirthInput")).sendKeys("12 Aug 1994");
//        driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.ENTER);
//
//        driver.findElement(By.xpath("//label[contains(text(),'Sports')]")).click();
//        driver.findElement(By.xpath("//label[contains(text(),'Reading')]")).click();
//
//        WebElement uploadElement = driver.findElement(By.id("uploadPicture"));
//        uploadElement.sendKeys("D:\\picture.png");
//
//        driver.findElement(By.id("currentAddress")).sendKeys("83/84, Madartek");
//        driver.findElement(By.id("currentAddress-label")).click();
//
//        driver.findElement(By.id("submit")).sendKeys(Keys.ENTER);
//        driver.findElement(By.id("closeLargeModal")).click();
//
//    }

}
