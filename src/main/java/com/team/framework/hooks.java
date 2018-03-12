package com.team.framework;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import static com.team.framework.DriverConfig.*;

 // TODO
public class hooks extends DriverConfig  {

    @BeforeClass
    public static void setUp() {
        getDriver("browser");
        driver.get(System.getenv("website"));
        driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown() {
        driver.close();
        driver.quit();
    }




}
