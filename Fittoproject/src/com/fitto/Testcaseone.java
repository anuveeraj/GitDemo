package com.fitto;

import java.time.Duration;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcaseone {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Projectfitto\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://fitto-uat.fitto-at.com/fittoui/");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath("//input[@id='loginUserNameId']")).sendKeys("paramedic@gmail.com");
		driver.findElement(By.xpath("//input[@id='loginPasswordId']")).sendKeys("Password#5");
		driver.manage().window().maximize();
		WebElement captchaInput = driver.findElement(By.id("loginCaptchaTextBox"));
		String captchaSolution = JOptionPane.showInputDialog(captchaInput);
		captchaInput.sendKeys(captchaSolution);
		//           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
	driver.findElement(By.id("loginBtnId")).click();
	}

}
