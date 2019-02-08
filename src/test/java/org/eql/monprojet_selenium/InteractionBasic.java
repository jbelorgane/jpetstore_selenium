package org.eql.monprojet_selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class InteractionBasic {
	
	@Test
	public void monPremierTestSelenium() {
		
		// Renseigne l'emplacement du driver
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\formation\\Documents\\Donnees_avancees\\20190207\\outils\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\formation\\Documents\\Donnees_avancees\\20190207\\outils\\chromedriver.exe");
		
		// Instanciation de Webdriver
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		// Navigation
		driver.get("http://localhost:8181/jpetstore/");
		driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a")).click();
		//lienStore.click();
	}

}
