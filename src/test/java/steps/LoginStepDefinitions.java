package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinitions extends TestBase {

	LoginPage loginpage;
	DatabasePage databasePage;
	@Before
	public void setUp() {
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();
	}
	
	//Cucumber syntax
	@Given ("^User is on techfios login page$")
	public void user_is_on_techfios_login_page() {
		//initDriver();
		driver.get("https://www.techfios.com/billing/?ng=login/");
	}
	@When ("^User enters username as \"([^\"]*)\"$")
		public void user_enters_username_as_(String username) {
		
		
		loginpage.enterUserName(username);
	}
	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password){
	 
		loginpage.enterPassword(password);
	}

	@When("^User click on signin button$")
	public void user_click_on_signin_button() {
	    loginpage.clickSignInButton();
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page(){
	   String expectedTitle = "Dashboard- iBilling";
	   String actualTitle = loginpage.getPageTitle();
	   Assert.assertEquals("page not found!", expectedTitle, actualTitle);
	   takeScreenshot(driver);
	}
	
	@Given("^User is on the techfios login page$")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=login/");
	}
	@When("^User enters the \"([^\"]*)\" in \"([^\"]*)\" field$")
	public void user_enters_the_in_field(String loginData, String field) {
 
	if(field.equalsIgnoreCase("Username")) {
		loginpage.enterUserName(loginData);// loginData holds techfios login data, userName comes from feature
		System.out.println("UserName:" + loginData);
	}
	else if(field.equalsIgnoreCase("Password")) {
		loginpage.enterPassword(loginData);
		System.out.println("Password:" + loginData);
		
	}
	else {
	
		System.out.println("Unable to enter login data:" + loginData);
	}
	
}		

	@When("^User clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String buttonOrLink) {
		
		switch(buttonOrLink) {
		case "login": 
			clickOnButton(loginpage.SignInButton);
		 break;
		case "bankCash":
			loginpage.clickSignInButton();
			break;
		case "newAccount":
			loginpage.clickSignInButton();
			break;
		default:
			System.out.println("Unable to click button or link data:" + buttonOrLink);
			break;
			
		}
		
	}


	@Then("^User enters \"([^\"]*)\" in accounts page$")
	public void user_enters_in_accounts_page(String arg1) {
		
	}

	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully(){
		
	}

@When("^User enters \"([^\"]*)\" from techfios database$")
public void user_enters_from_techfios_database(String loginData) {
    
	switch(loginData) {
	case "username":
		loginpage.enterUserName(databasePage.getDataFromDb("username"));
		break;
	case "password":
		loginpage.enterPassword(databasePage.getDataFromDb("password"));
		break;
	default:
		System.out.println("Unable to enter login data:" + loginData);
		break;
		
	}
	
	
}


	
	@After
	public void tearDown() {
		driver.close();
		//driver.quit();
	}
	
}
