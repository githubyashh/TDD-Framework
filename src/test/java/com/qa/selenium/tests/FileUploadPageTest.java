package com.qa.selenium.tests;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.selenium.base.TestBase;
import com.qa.selenium.pages.FileUploadPage;

public class FileUploadPageTest extends TestBase {

	FileUploadPage fileUploadPage;

	@BeforeMethod
	public void setup() {
		initialization();
		driver.get(prop.getProperty("URL") + "upload");
		fileUploadPage = new FileUploadPage();
	}


	@Test
	public void performeUpload() throws InterruptedException {
		fileUploadPage.selectBrowseAndUpload();
		Assert.assertEquals(fileUploadPage.verifyUpload(), prop.getProperty("UploadVerify"));

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
