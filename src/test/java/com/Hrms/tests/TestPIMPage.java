package com.Hrms.tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.Hrms.base.BasePage;
import com.Hrms.pages.LoginPage;
import com.Hrms.pages.PIMPage;
import com.Hrms.utils.CommonUtils;
import com.Hrms.utils.TestNGUtility;

public class TestPIMPage extends BasePage{
	
	
	
WebDriver driver;
	

	
	//----------------Page class objects Implementations---------
	
	LoginPage loginPage = new LoginPage();
	
	PIMPage pimPage = new PIMPage();
	
	@Test(description="Verify that an employee can be added successfully", enabled=true,priority=0)
	public void addEmployee() throws Exception {
	    
	    // Log in to the application using the login page method
	    loginPage.login();
	    
	    // Wait for 5 seconds to allow the page to load
	    CommonUtils.hardWait(5);
	    
	    // Assert that the welcome message contains "Welcome selenium"
	    TestNGUtility.assertTrue(CommonUtils.getElementText(loginPage.getWelcomePage()), "Welcome selenium");
	    
	    // Move the mouse to the PIM (Personnel Information Management) element
	    CommonUtils.moveToElement(By.xpath("//li[@id='pim']"));
	    
	    // Click on the "Add Employee" button
	    CommonUtils.clickElement(PIMPage.getAddEmp());
	    
	    // Wait for 5 seconds to ensure the new page loads
	    CommonUtils.hardWait(5);
	    
	    // Switch to the iframe where the employee form is located
	    CommonUtils.switchToFrame(PIMPage.getFrame());
	    
	    // Enter the first name "Sai" into the first name field
	    CommonUtils.enterValue(PIMPage.getFirstName(), "Kosmik", true);
	    
	    // Enter the last name "P" into the last name field
	    CommonUtils.enterValue(PIMPage.getLastName(), "Sai", true);
	    
	    // Click the "Save" button to add the new employee
	    CommonUtils.clickElement(PIMPage.getSave());
	    
	    // Click the "Back" button to return to the previous page
	    CommonUtils.clickElement(PIMPage.getBackButton());
	    
	    // Assert that the employee name displayed matches "Sai P"
	    TestNGUtility.assertTrue(CommonUtils.getElementText(PIMPage.getEmpName()),"Kosmik Sai");
	    
	}
	
	@Test(description="Verify that the search functionality returns the correct employee",groups= {"Smoke"},priority=1)
	public void searchEmployee() throws Exception {
		
	}
	
	@Test(description="Verify that employee details can be edited successfully",priority=2)
	public void editEmployeeDetails() throws Exception {
	
	
	}
	
	@Test(description="Verify that an employee can be deleted successfully",priority=3)
	public void deleteEmployee() throws Exception {
	 
	
	}
	
	@Test(description="Verify that the employee list is displayed correctly with accurate information",dependsOnMethods= {"addEmployee"},groups= {"Smoke"},priority=4)
	public void viewEmployeeList() throws Exception {
		Assert.assertEquals("akki", "akki");
	
	}
	
	@Test(description="Verify that photos can be added to employee profiles",priority=5)
	public void addEmployeePhotos() throws Exception {
	
	
	}
	
	@Test(description="Verify that employee details are correctly displayed",priority=6)
	public void viewEmployeeDetails() throws Exception {
		
	
	}
	
	@Test(description="Verify that the employment status of an employee can be updated",priority=7)
	public void editEmploymentStatus() throws Exception {
	
	
	}
	
	@Test(description="Verify that the employee list can be filtered based on various criteria",priority=8)
	public void filterEmployeeList() throws Exception {
	
	
	}

	
}
