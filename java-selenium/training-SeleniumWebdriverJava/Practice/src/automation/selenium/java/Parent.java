package automation.selenium.java;
/*TODO:
    Fix Firefox call for tests

 */

public class Parent {

    public static void main(String[] args) {

        /*
        //Class_object.method_name
        checking automation health:
        //ChkConf.setWebdriver();
        //System.out.println(ChkConf.touchBrowser());
        //ChkConf.quitTest();
        */

        Locators.accssPage();

        Locators.touchMenuSignin();

        Locators.fillUpMailField();

        Locators.fillUpPasswdField();

    }
}