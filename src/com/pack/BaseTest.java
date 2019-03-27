package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    public static Properties properties = null;
    public static FileInputStream fileInputStream = null;

    public static void init() throws IOException {
        properties = new Properties();
        fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
        properties.load(fileInputStream);
    }

    public static void launchBrowser(String browserType) {

        /*        if(browserType.equalsIgnoreCase("CHROME"))
        {
            //System.setProperty("webdriver.chrome.driver","C:\\Users\\rshankar\\workspace\\svn\\Selenium\\drivers\\chromedriver.exe");
            System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.bestbuy.com");
        }
        else if (browserType.equalsIgnoreCase("FIREFOX"))
        {

        }
        else if (browserType.equalsIgnoreCase("IE"))
        {

        }
        else if(browserType.equalsIgnoreCase("EDGE"))
        {

        }*/


        if (properties.getProperty(browserType).equalsIgnoreCase("CHROME")) {
            System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "//drivers//chromedriver.exe");
            driver = new ChromeDriver();
        } else if (properties.getProperty(browserType).equalsIgnoreCase("FIREFOX")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//drivers//geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (properties.getProperty(browserType).equalsIgnoreCase("INTERNETEXPLORER")) {
            System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "//drivers//IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if (properties.getProperty(browserType).equalsIgnoreCase("EDGE")) {
            System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "//drivers//MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        } else {

        }
    }

    public static void navigate(String url) {
        // get:
        // Always hits server and open the URL
        // can only open the URL
        // driver.get(properties.getProperty(url));

        // naviagate:
        // First time it will go server and next time it will go to cache and open url
        // we can navigate forward, back, refresh
        driver.navigate().to(properties.getProperty(url));
    }

}
