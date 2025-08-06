package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TodoPage;

public class CompleteTodoTest extends BaseTest {

    @Test
    public void testCompleteTodo() {
        TodoPage todoPage = new TodoPage(driver);

        String todoText = "Finish the report";
        todoPage.enterTodoText(todoText);
        todoPage.tapAddButton();

        todoPage.tapCheckboxForTodo(todoText);

        Assert.assertTrue(todoPage.isTodoCompleted(todoText), "Todo item should be marked as completed");
    }
}
