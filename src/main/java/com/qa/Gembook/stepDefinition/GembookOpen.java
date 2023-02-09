package com.qa.Gembook.stepDefinition;

import com.gemini.generic.ui.utils.DriverAction;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class GembookOpen  {
    @Given("^Click on Signin$")
    public void signIn() {
        DriverAction.click(By.xpath("//button[text()='Sign in']"), "Click on Sign In", "Clicked");
      DriverAction.waitSec(5);
    }
}