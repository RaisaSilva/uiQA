package testCleanProjectEjer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.Center;
import pomPages.todoLy.Left;
import pomPages.todoist.CenterE;
import pomPages.todoist.LeftE;
import pomPages.todoist.LoginModalEjer;
import pomPages.todoist.RigthE;
import singletonSess.Session;

public class CreateCountTest {
    CenterE centerSection = new CenterE();
    LeftE leftSection = new LeftE();
    RigthE rigthSection = new RigthE();
    LoginModalEjer login = new LoginModalEjer();

    @Test
    public void verify_new_count_todoist() throws InterruptedException {
        String email = "ale15@gmail.com";
        String name =  "Aleli";
        String password = "098lacontrafacil.";
        Session.getSession().getDriver().get("https://todoist.com/");

        //create
        rigthSection.newProjectButton.click();
        login.emailTextBox.set(email);
        centerSection.buttonToRegister.click();
        login.name.set(name);
        login.pwdTextBox.set(password);
        centerSection.buttonToFinishRegister.click();
        centerSection.buttonToMainMenu.click();
        System.out.print(rigthSection.informationUser.getText());


    }

    @After
    public void close() {
        Session.getSession().closeSession();
    }
}
