package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.Center;
import pomPages.todoLy.Left;
import pomPages.todoLy.LoginModal;
import pomPages.todoLy.MainPage;
import singletonSess.Session;

public class DeleteProjectTest {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    Left leftSection= new Left();
    Center centerSection= new Center();
    String user="upbui@upbui.com";
    String pwd="1234";

    @Test
    public void verify_delete_project_todoly() throws InterruptedException {
        String name="ProjectRSDelete";
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.loginAction(user,pwd);

        leftSection.selectProjectButtonForDelete.click();
        leftSection.dropdownButton.click();
        leftSection.deleteButton.click();
        Session.getSession().getDriver().switchTo().alert().accept();
        leftSection.verificationDeleteProject.click();


        Thread.sleep(2000);
        Assert.assertEquals("No borro el projecto",name, centerSection.projectNameLabel.getText());


    }

    @After
    public void close(){
        Session.getSession().closeSession();
    }
}
