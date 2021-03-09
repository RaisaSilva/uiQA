package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.LoginModal;
import pomPages.todoLy.MainPage;
import pomPages.todoLy.Menu;
import singletonSess.Session;


public class LoginTest {

    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    Menu menuSection= new Menu();
    String user="upbui@upbui.com";
    String pwd="1234";




    @Test
    public void verify_login_todoly(){
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.emailTextBox.set(user);
        loginModal.pwdTextBox.set(pwd);
        loginModal.loginButton.click();
        Assert.assertTrue("ERROR, usuario no logueo",menuSection.logoutButton.controlIsDisplayed());
    }

    @After
    public void close(){
        Session.getSession().closeSession();
    }


}