package com.autopract.qa.testcases;

import com.autopract.qa.base.TestBase;
import com.autopract.qa.pages.SigninPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SigninPageTest extends TestBase {
    SigninPage signinPage;

    SigninPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();

        signinPage = new SigninPage();
    }

    @Test
    public void signinPageTitleTest(){
        String title = signinPage.validateSigninPageTitle();
        Assert.assertEquals(title, "My Store");
    }

    @Test
    public void logoImgTest(){
        boolean flag = signinPage.validateLogoImg();
        Assert.assertTrue(flag);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
