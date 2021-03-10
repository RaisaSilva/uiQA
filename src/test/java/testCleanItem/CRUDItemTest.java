package testCleanItem;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.StaleElementReferenceException;
import pomPages.todoLy.Center;
import pomPages.todoLy.Left;
import pomPages.todoLy.LoginModal;
import pomPages.todoLy.MainPage;
import singletonSess.Session;


public class CRUDItemTest {
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    Left leftSection = new Left();
    Center centerSection = new Center();
    String user = "upbui@upbui.com";
    String pwd = "1234";

    @Test
    public void verify_CRUD_item_todoly() throws InterruptedException {
        String name = "Item";
        String name2 = "ItemModificado";
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.loginAction(user, pwd);

        //create
        centerSection.selectProjectButton.click();
        centerSection.addItemButton.click();
        centerSection.nameItemTextBox.set(name);
        centerSection.addButton.click();

        //update
        try {
            centerSection.nameItemLabel.click();
        } catch (StaleElementReferenceException e) {
            centerSection.nameItemLabel.click();
        }

        centerSection.editNameItemTextBox.clear();
        centerSection.editNameItemTextBox.set(name2);
        centerSection.addButton.click();

        //Delete
        centerSection.nameItemLabel.click();
        centerSection.dropdownButton.click();
        centerSection.deleteButton.click();

        Thread.sleep(2000);
        Assert.assertTrue("No se eliminó el item", centerSection.infoMessageDeleteLabel.controlIsDisplayed());






        Thread.sleep(2000);
        Assert.assertEquals("ERROR !!! item No Creado", name, centerSection.projectNameLabel.getText());


    }

    @After
    public void close() {
        Session.getSession().closeSession();
    }
}



