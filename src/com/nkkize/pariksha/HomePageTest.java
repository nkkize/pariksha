package com.nkkize.pariksha;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class HomePageTest {

  @Test
  void site_header_is_on_home_page() {
    System.setProperty("webdriver.chrome.driver", "/Users/narenderk/Downloads/programs/chromedriver");
    WebDriver webDriver = new ChromeDriver();
    webDriver.get("https://www.saucelabs.com");
    WebElement element = webDriver.findElement(By.xpath("//a[@href='/beta/login']"));
    assertTrue(element.isDisplayed());
    webDriver.close();
  }

}
