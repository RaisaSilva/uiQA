package pomPages.todoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginModalEjer {

    public TextBox emailTextBox = new TextBox(By.xpath("//*[@id=\"email\"]"));
    public TextBox name = new TextBox(By.xpath("//*[@id='full_name']"));
    public TextBox pwdTextBox = new TextBox(By.xpath("//*[@id=\"pwd\"]"));
    public Button loginButton = new Button(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$ButtonLogin']"));

    public LoginModalEjer() {
    }

    public void loginAction(String user, String pwd) {
        emailTextBox.set(user);
        pwdTextBox.set(pwd);
        loginButton.click();

    }
}
