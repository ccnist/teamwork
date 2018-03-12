package com.team.interactions;

import com.team.core.Elements;
import com.team.framework.DriverConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsNew extends DriverConfig {

    static Actions actions = new Actions(driver);
    // TODO
    public static void dragPositionOfElement(String elementLocator)
    {
        WebElement element = Elements.findElement(elementLocator);
        actions.dragAndDropBy(element,154, 0);
        actions.build().perform();

    }





}
