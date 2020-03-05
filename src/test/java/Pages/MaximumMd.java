package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class MaximumMd {

    //1 - change Language
    @FindBy(className = "js-change-lang header-top-lang-item")
    private static WebElement changeLang;
    //2 hover to Televizoare
    @FindBy(className = "js-item-mnu js-item-primary header__menu__list__item__level-1__container__products__title first_link_cat")
    private static WebElement hovOnTv;
    //3 hover Televizoare LED Smart
    @FindBy(className = " js-item-mnu js-item-seconds header__menu__list__item__level-1__container__products__title")
    private static WebElement hovOnLedTv;
    //4 click on Vezi Toate
    @FindBy(className = "fa fa-angle-right")
    private static WebElement clickVeziToate;




    private static String URL = "https://maximum.md/ru/";

    public static void startPage(){
        PageFactory.initElements(Driver.getDriver(),
                MaximumMd.class);
        Driver.getDriver().get(URL);
    }

    public static void hoverOnTv(){
        hovOnTv.click();
    }

    public static void hoverOnLedTv(String text){
        hovOnLedTv.click();
    }

    public static void clickOnVeziToate(String text){
        clickVeziToate.click();
    }

    public static void clickSubmit(){
        submit.click();
    }











}
