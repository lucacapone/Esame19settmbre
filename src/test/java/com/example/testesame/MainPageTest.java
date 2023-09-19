package com.example.testesame;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage mainPage = new MainPage();

    //test in junit per testare kgMaggiorePound(int) in MainPage
    @Test
    public void TestKgMaggiorePound(){
        MainPage mainPage1=new MainPage();
        assertTrue(mainPage1.kgMaggiorePound(3));
    }

    //test in Selenium per testare convertitoreKgInPound(int) in MainPage
    @Test
    public void TestConvertitoreKgInPound() throws InterruptedException {
        MainPage mainPage1= new MainPage();
        int kg =3;
        assertTrue(mainPage1.convertitoreKgInPound(kg));
    }


}
