package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) {



    // 1. Set up the browser driver
  WebDriverManager.chromedriver().setup();

    WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/%22");




    }

}
