package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class TodoPage {
    public TodoPage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.driver), this);
    }

    @FindBy(id = "com.example.todo:id/addTodoEditText")
    public MobileElement todoInput;

    @FindBy(id = "com.example.todo:id/addButton")
    public MobileElement addButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Buy Groceries']")
    public MobileElement addedTodo;

    public void addTodo(String title) {
        todoInput.sendKeys(title);
        addButton.click();
    }
}
