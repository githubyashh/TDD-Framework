package com.qa.selenium.pages;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.selenium.base.TestBase;

public class FileDownloadPage extends TestBase {

	@FindBy(xpath = "//*[contains(text(),'some-file.txt')]")
	WebElement downloadLink;

	public FileDownloadPage() {
		PageFactory.initElements(driver, this);
	}

	public void DownloadStart() throws IOException {

		URL url = new URL("http://localhost:7080/download/some-file.txt");
		File file = new File(System.getProperty("user.dir") + "/download/some-file.txt");
		FileUtils.copyURLToFile(url, file);
	}

}
