package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.booking.com/");

        WebDriverWait wait = new WebDriverWait(driver, 6);
        WebElement locationField = wait.until(ExpectedConditions.elementToBeClickable(By.id("ss")));
        locationField.sendKeys("Belgrade");

        WebElement locationBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")));
        locationBar.click();

        WebElement checkInPicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div[3]/div/div/div[1]/table/tbody/tr[4]/td[1]/span")));
        checkInPicker.click();

        WebElement datePicker = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-calendar2-type=\"checkout\"")));
        datePicker.click();

        WebElement checkOutPicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div/div[3]/div/div/div/div[2]/div[2]/div[3]/div/div/div[1]/table/tbody/tr[5]/td[6]/span")));
        checkOutPicker.click();
        
        WebElement comboField = wait.until(ExpectedConditions.elementToBeClickable(By.id("xp__guests__toggle")));
        comboField.click();
        
        WebElement noRooms = wait.until(ExpectedConditions.elementToBeClickable(By.id("no_rooms")));
        noRooms.click();
        
//        WebElement noRoomsPicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#no_rooms > option:nth-child(4)")));
//        noRoomsPicker.click();
        
        Select noRoomsPicker = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.id("no_rooms"))));
        noRoomsPicker.selectByValue("2");
        
        WebElement noAdults = wait.until(ExpectedConditions.elementToBeClickable(By.id("group_adults")));
        noAdults.click();
        
//        WebElement noAdultsPicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#group_adults > option:nth-child(8)")));
//        noAdultsPicker.click();

        Select noAdultsPicker = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.id("group_adults"))));
        noAdultsPicker.selectByValue("8");

        WebElement noChildren = wait.until(ExpectedConditions.elementToBeClickable(By.id("group_children")));
        noChildren.click();
        
//        WebElement noChildrenPicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#group_children > option:nth-child(3)")));
//        noChildrenPicker.click();

        Select noChildrenPicker = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.id("group_children"))));
        noChildrenPicker.selectByValue("2");
        
        WebElement childrenAgeBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[4]/select[1]")));
        childrenAgeBox.click();
           
//        WebElement noChildrenAgePicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[4]/select[1]/option[14]")));
//        noChildrenAgePicker.click();
        
        Select noChildrenAgePicker = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[4]/select[1]"))));
        noChildrenAgePicker.selectByValue("12");
        
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".sb-searchbox__button")));
        searchButton.click();
                
        Thread.sleep(3000);
        driver.quit();

    }

}
