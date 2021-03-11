package pomPages.todoist;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class RigthE {

    public Button newProjectButton = new Button(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/header/nav/div/ul[2]/li[2]/a"));
    public Label infoMessageDeleteLabel = new Label(By.id("InfoMessageText"));
    public Label confirmUser = new Label(By.xpath("//*[@id=\"user_menu_settings_menuitem\"]/div/div/p"));
    public Button informationUser = new Button(By.xpath("//*[@id='top_bar_inner']/div[2]/button[5]/img"));
}

