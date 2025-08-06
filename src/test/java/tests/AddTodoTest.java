package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.TodoPage;

public class AddTodoTest extends BaseTest {
    @Test
    public void testAddTodo() {
        TodoPage todoPage = new TodoPage();
        todoPage.addTodo("Buy Groceries");
        assert todoPage.addedTodo.isDisplayed();
    }
}
