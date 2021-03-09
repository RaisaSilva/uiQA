package pomPages.todoLy;

import controls.Button;
import org.openqa.selenium.By;

public class Menu {
    public Button logoutButton = new Button(By.xpath("//a[contains(.,'Logout')]"));
    public Menu(){}

}
