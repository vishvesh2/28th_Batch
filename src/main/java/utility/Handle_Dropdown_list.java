package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Handle_Dropdown_list 
{
	public static void handleSelectClass(WebElement ele,String value)
	{
		Select sc=new Select(ele);
		sc.selectByVisibleText(value);
	}
}
