public void tapCheckboxForTodo(String todoText) {
    MobileElement checkbox = driver.findElement(
            MobileBy.xpath("//android.widget.TextView[@text='" + todoText + "']/preceding-sibling::android.widget.CheckBox")
    );
    checkbox.click();
}

public boolean isTodoCompleted(String todoText) {
    MobileElement todoItem = driver.findElement(
            MobileBy.xpath("//android.widget.TextView[@text='" + todoText + "']")
    );
    String checkedAttribute = todoItem.getAttribute("checked");
    return checkedAttribute != null && checkedAttribute.equals("true");
}
