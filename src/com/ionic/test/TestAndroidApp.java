package com.ionic.test;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.selendroid.client.SelendroidDriver;
import io.selendroid.common.SelendroidCapabilities;

public class TestAndroidApp {
	 WebDriver driver = null;
	 


	@Test
	public void mytest() throws Exception{

		//	driver = new SelendroidDriver(new SelendroidCapabilities("com.scalerlabs.asfalio:0.0.1"));
			//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver = new SelendroidDriver(new SelendroidCapabilities("com.ionicframework.ionicappiumprotractorexample806497:0.0.1"));
		 
		// specify test capabilities (your 'test environment')
		//driver.get("and-activity://com.scalerlabs.asfalio.MainActivity");
		//System.out.println("before");
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//System.out.println("after");
		
	    driver.switchTo().window("WEBVIEW_0");
	   // driver.switchTo().window("WEBVIEW_0");
	   // Thread.sleep(3000);
	   
	    driver.findElements(By.tagName("a")).get(1).click();
	    Thread.sleep(2000);
	    //System.out.println(driver.getPageSource());
	    System.out.println("item options"+driver.findElements(By.cssSelector("[class='item-remove-animate item-avatar item-icon-right item item-complex item-right-editable']")).size());
		   
	    //driver.navigate().to("#/tab/chats");
	    //Thread.sleep(3000);
	   
	   // System.out.println("url"+driver.getCurrentUrl());
	    //
	    //WebDriverWait wait = new WebDriverWait(driver, 10);
	 //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("myId")));
	    try{
	    System.out.println(driver.getCurrentUrl());
	    
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	    
	    //driver.navigate().to("file:///android_asset/www/index.html#/app/landing-page");
	    //System.out.println(driver.getPageSource());
	    
	   
	    
	   // WebElement inputField = driver.findElement(By.id("my_text_field"));
	   // Assert.assertEquals("true", inputField.getAttribute("enabled"));
	   // inputField.sendKeys("Selendroid");
	    Assert.assertEquals(driver.findElements(By.cssSelector("[class='item-remove-animate item-avatar item-icon-right item item-complex item-right-editable']")).size(), 4);
	    //driver.quit();

	}
}
