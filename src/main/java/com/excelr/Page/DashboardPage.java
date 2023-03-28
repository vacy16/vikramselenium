package com.excelr.Page;

import org.openqa.selenium.By;

import com.excelr.Base.ExcelrBase;

public class DashboardPage extends ExcelrBase {
	public boolean gettimeWorkSectionPresent() {
		return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	}
}
