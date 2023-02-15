package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class CrudAppTestingApp {
    private static final String XPATH_INPUT = "//html/body/main/section/form/fieldset[1]/input";
    private static final String XPATH_TEXTAREA = "//html/body/main/section/form/fieldset[2]/textarea";
    private static final String XPATH_WAIT_FOR = "//select[1]";
    private static final String XPATH_SELECT = "//div[contains(@class, \"tasks-container\")]/form/div/fieldset/select[1]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://lukisek88.github.io/");

        WebElement taskNameField = driver.findElement(By.xpath(XPATH_INPUT));
        taskNameField.sendKeys("New robotic task");

        WebElement taskContentField = driver.findElement(By.xpath(XPATH_TEXTAREA));
        taskContentField.sendKeys("The robotic content");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(1);


    }


}