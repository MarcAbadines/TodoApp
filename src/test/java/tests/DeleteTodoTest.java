package tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;
import utils.BaseTest;

import java.net.MalformedURLException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DeleteTodoTest extends BaseTest {

    private static AndroidDriver driver;

    @BeforeAll
    public static void setup() throws MalformedURLException {
        driver = BaseTest.getDriver();
    }

    @Test
    @Order(1)
    public void addTodoToDelete() {
        WebElement inputField = driver.findElement(AppiumBy.accessibilityId("inputField"));
        inputField.sendKeys("Todo to be deleted");

        WebElement addButton = driver.findElement(AppiumBy.accessibilityId("addTodoButton"));
        addButton.click();

        WebElement newItem = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Todo to be deleted']"));
        Assertions.assertTrue(newItem.isDisplayed(), "Todo item was not added properly");
    }

    @Test
    @Order(2)
    public void deleteTodo() {
        WebElement deleteButton = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Todo to be deleted']/following-sibling::android.widget.ImageView[@content-desc='deleteTodoButton']"));
        deleteButton.click();

        Assertions.assertTrue(driver.findElements(AppiumBy.xpath("//android.widget.TextView[@text='Todo to be deleted']")).isEmpty(), "Todo item was not deleted");
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
