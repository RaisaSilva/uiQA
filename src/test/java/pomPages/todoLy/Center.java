package pomPages.todoLy;

import controls.Label;
import org.openqa.selenium.By;

public class Center {
    public Label projectNameLabel= new Label(By.xpath("//div[@id='CurrentProjectTitle']"));
    public Center(){}
}
