import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Main.getChromeDriver();


        driver.get("https://ds.dev.dengisrazy.ru/cabinet/login");
        Thread.sleep(2000);

        WebElement payButton = driver.findElement(By.xpath("//a[@class='uk-button button-payment-link']"));


        Actions actions = new Actions(driver);
        actions.moveToElement(payButton).click().release().build().perform();
        WebElement treatyInput = driver.findElement(By.id("payment-contract_number"));
        treatyInput.click();
        treatyInput.sendKeys("ФК-227/2200167");
        WebElement search = driver.findElement(By.xpath("//button[contains(text(),'Найти')]"));
        search.click();
        Thread.sleep(5000);
        WebElement sum = driver.findElement(By.id("payment-pay_sum"));
        sum.click();
        sum.sendKeys("100");
        WebElement checkB = driver.findElement(By.xpath("//div[@class='field-request-last_name required uk-form-danger pay-loan__consent-checkbox']"));
        checkB.click();
        WebElement pay = driver.findElement(By.xpath("//button[contains(text(),'Внести')]"));
        pay.click();
        Thread.sleep(2000);
        WebElement in = driver.findElement(By.id("payform-cardnumber"));
        in.click();
        in.sendKeys("4314090010072282");
        WebElement data = driver.findElement(By.id("payform-cardexp"));
        data.click();
        data.sendKeys("01/23");
        WebElement person = driver.findElement(By.id("payform-cardholder"));
        person.click();
        person.sendKeys("SAMOKHINA");
        WebElement cvc = driver.findElement(By.id("payform-cardcvc"));
        cvc.click();
        cvc.sendKeys("132");
        WebElement buttonVipey = driver.findElement(By.xpath("//button[contains(text(),'ОПЛАТИТЬ')]"));
        buttonVipey.click();

        driver.close();
    }


    protected static WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();

        return new ChromeDriver();
    }
}
