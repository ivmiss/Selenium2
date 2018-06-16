
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.booking.com/");

        WebDriverWait wait = new WebDriverWait(driver, 6);
        WebElement locationField = wait.until(ExpectedConditions.elementToBeClickable(By.id("ss")));
        locationField.sendKeys("Belgrade");

        WebElement locationBar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")));
        locationBar.click();

//        WebElement dateField = wait.until(ExpectedConditions.elementToBeClickable(By.));
//        dateField.click();
        WebElement checkInPicker = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div[3]/div/div/div[1]/table/tbody/tr[3]/td[6]/span")));
        checkInPicker.click();

        WebElement datePicker = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-calendar2-type=\"checkout\"")));
        datePicker.click();

        WebElement checkOutPicker = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div/div[3]/div/div/div/div[2]/div[2]/div[3]/div/div/div[1]/table/tbody/tr[5]/td[6]/span")));
        checkOutPicker.click();
        
        WebElement comboField = wait.until(ExpectedConditions.elementToBeClickable(By.id("xp__guests__toggle")));
        comboField.click();
        
        WebElement noRooms = wait.until(ExpectedConditions.elementToBeClickable(By.id("no_rooms")));
        noRooms.click();
        
        WebElement noRoomsPicker = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#no_rooms > option:nth-child(4)")));
        noRoomsPicker.click();
        
        WebElement noAdults = wait.until(ExpectedConditions.elementToBeClickable(By.id("group_adults")));
        noAdults.click();
        
        WebElement noAdultsPicker = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#group_adults > option:nth-child(8)")));
        noAdultsPicker.click();
        
        WebElement noChildren = wait.until(ExpectedConditions.elementToBeClickable(By.id("group_children")));
        noChildren.click();
        
        WebElement noChildrenPicker = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#group_children > option:nth-child(3)")));
        noChildrenPicker.click();
        
        WebElement childrenAgeBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[4]/select[1]")));
        childrenAgeBox.click();
       
//        WebElement childrenAgeBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".sb_child_ages_empty_zero > option:nth-child(12)")));
//        childrenAgeBox.click();
//        
        WebElement noChildrenAgePicker = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[4]/select[1]/option[14]")));
        noChildrenAgePicker.click();
        
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".sb-searchbox__button")));
        searchButton.click();
                
        Thread.sleep(5000);
        driver.quit();

    }

}
