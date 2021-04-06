package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver dr;
	
	
	@FindBy(xpath="value of xpath") WebElement menMenu;
	@FindBy(xpath="value of xpath") WebElement logo;
	
	public HomePage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
		
	}
	
	//public void 
	
//	public void verifyHomepageLogo() {
//		boolean b=Shared.verifyElement(logo);
//		System.out.println(b);
//	}
//	public MenPage clickMenMenu() {
//		Shared.click(menMenu);
//		return new  MenPage();
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
