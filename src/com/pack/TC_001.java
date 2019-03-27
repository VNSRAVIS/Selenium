package com.pack;

import org.openqa.selenium.By;

import java.io.IOException;

public class TC_001 extends BaseTest{

    public static void main(String[] args) throws IOException, InterruptedException {

        init();

        launchBrowser("chromebrowser");

        navigate("hdfcurl");

        driver.manage().window().maximize();

        driver.findElement(By.id("loginsubmit")).click();

        String title = driver.getTitle();
        System.out.println("Title: " + title);

        String url = driver.getCurrentUrl();
        System.out.println("Site URL: " + url);

        driver.manage().deleteAllCookies();

        driver.navigate().back();
        Thread.sleep(5000);

        driver.navigate().forward();
        Thread.sleep(5000);

        driver.navigate().refresh();

        driver.close();

        driver.quit();
    }
}