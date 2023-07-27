package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	WebElement totalAmt;
	
	public ShoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean isItemAdded() {
		String strAmt=totalAmt.getText();
		double dblAmt=Double.parseDouble(strAmt);
		if(dblAmt>0) {
			return true;
		}
		else
		return false;
		}
	public void checkout() {
		//chkoutBtn.
	}
	
}
