package com.searchmodule.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.searchmodule.pages.SearchPage;
import com.tests.BaseTest;

public class SearchTest extends BaseTest {
	

	
	@Test
	@Parameters({"keyword"})
	public  void search(String keyword)
	{
		SearchPage searchpage = new SearchPage(driver);
		searchpage.goTo();
		searchpage.doSearch(keyword);
		searchpage.goToVideos();
		int size=searchpage.getResult();
		Assert.assertTrue(size>0);
		
		
		
	}
	
	

}
