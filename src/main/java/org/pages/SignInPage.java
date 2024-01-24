//package org.pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//public class SignInPage extends TwozoBase {
//
//    public SignInPage(final RemoteWebDriver driver) {
//        this.driver = driver;
//    }
//
//    public boolean getWorkMailLabel() {
//        return driver.findElement(By.xpath("//*[text()='Work Email Id']")).isDisplayed();
//    }
//
//    public boolean passwordLabel() {
//        return driver.findElement(By.xpath("//*[text()='Password']")).isDisplayed();
//    }
//
//    public boolean forgetPasswordLabel() {
//        return driver.findElement(By.xpath("//*[text()='Forgot Password?']")).isDisplayed();
//    }
//
//    public boolean rememberMeLabel() {
//        return driver.findElement(By.xpath("//*[text()='Remember Me']")).isDisplayed();
//    }
//
//    public boolean signInLabel() {
//        return driver.findElement(By.xpath("//*[text()='Sign In']")).isDisplayed();
//    }
//
//    public SignInPage enterMail(final String email) {
//        driver.findElement(By.id(":r0:")).sendKeys(email);
//        return this;
//    }
//
//    public SignInPage enterPassword(final String password) {
//        driver.findElement(By.id(":r1:")).sendKeys(password);
//        return this;
//    }
//
//    public SignInPage clickSignIn() {
//        driver.findElement(By.xpath("//*[text()='Sign In']")).click();
//        return this;
//    }
//}