package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TodoPage;

public class EmptyStateTest extends BaseTest {

    @Test
    public void testEmptyStateIsDisplayed() {
        TodoPage todoPage = new TodoPage(driver);

        // Clear all existing todos (if any)
        todoPage.deleteAllTodosIfPresent();

        // Verify empty state message is visible
        Assert.assertTrue(todoPage.isEmptyStateDisplayed(), "Empty state message should be displayed when no todos are present");
    }
}
