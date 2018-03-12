package com.team.framework;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utils {

    public static JSONObject readJson(String filePath) {
        JSONObject data = null;
        JSONParser parser = new JSONParser();
        try {
            data = (JSONObject) parser.parse(new FileReader("data\\" + filePath + ".json"));
        } catch (IOException | ParseException d) {
            System.out.println("Got Parse | IO Exception");
        }
        return data;
    }

    public static ArrayList<String> elementLocators(JSONObject js, String elementName) {
        ArrayList<String> elementLoc = new ArrayList<String>();
        String locator = js.get(elementName).toString().split(",")[0];
        elementLoc.add(locator);
        String identifier = js.get(elementName).toString().split(",")[1].trim();
        elementLoc.add(identifier);
        return elementLoc;
    }


    public static By selector(String byType, String value) {
        switch (byType) {
            case "id":
                return By.id(value);
            case "linkText":
            case "link text":
                return By.linkText(value);
            case "name":
                return By.name(value);
            case "partialLinkText":
            case "partial link text":
                return By.partialLinkText(value);
            case "tagName":
            case "tag name":
                return By.tagName(value);
            case "xpath":
                return By.xpath(value);
            case "className":
            case "class":
            case "class name":
                return By.className(value);
            case "cssSelector":
            case "css selector":
            case "css":
                return By.cssSelector(value);
            default:
                return null;
        }
    }
 }
