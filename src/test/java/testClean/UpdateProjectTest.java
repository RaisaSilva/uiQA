package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.Center;
import pomPages.todoLy.Center;
import pomPages.todoLy.Left;
import pomPages.todoLy.LoginModal;
import pomPages.todoLy.MainPage;
import singletonSess.Session;

public class UpdateProjectTest {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    Left leftSection= new Left();
    Center centerSection= new Center();
    String user="upbui@upbui.com";
    String pwd="1234";

    @Test
    public void verify_update_project_todoly() throws InterruptedException {
        String name="ProjectRS";
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.loginAction(user,pwd);

        leftSection.selectProjectButton.click();
        leftSection.dropdownButton.click();
        leftSection.editButton.click();
        leftSection.newNameProjectTextBox.clear();
        leftSection.newNameProjectTextBox.set("ProjectRSDelete");
        leftSection.submitNewNameProjectButton.click();
        leftSection.verificationNameProject.click();


        Thread.sleep(2000);
        //Assert.assertEquals("ERROR !!Projecto No Editado",name, centerSection.projectNameLabel.getText());
        Assert.assertEquals("ERROR !!! Projecto No Editado","ProjectRSDelete", centerSection.projectNameLabel.getText());


    }

    @After
    public void close(){
        Session.getSession().closeSession();
    }
}
