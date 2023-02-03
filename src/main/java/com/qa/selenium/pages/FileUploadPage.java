package com.qa.selenium.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.selenium.base.TestBase;

public class FileUploadPage extends TestBase{

	@FindBy (xpath= "//form[@method= 'POST']/input[1]")
	WebElement browseBtn;
	
	@FindBy (xpath = "//form[@method= 'POST']/input[2]")
	WebElement uploadBtn;
	
	@FindBy (xpath = "//div[@Class='example']/h3")
	WebElement fileUploadverify;
	
	
	
	public FileUploadPage() {
		PageFactory.initElements(driver, this);
	}
	

	public void selectBrowseAndUpload() {
		browseBtn.sendKeys(System.getProperty("user.dir")+ "/download/some-file.txt");
				uploadBtn.click();

		
	}
	 
	public String verifyUpload() {
		return fileUploadverify.getText();
	}
}
