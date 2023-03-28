package com.excelr.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.excelr.Base.ExcelrBase;

public class LoginPage extends ExcelrBase {
	public String getTitle() {
		return driver.getTitle();
	}

	public DashboardPage login() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new  ChromeDriver(options);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new DashboardPage();
	}

	public boolean forgotPasswordLink() {
		return driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).isDisplayed();
	}

}
