package automation.selenium.java;

public class Parent {

    public static void main(String[] args) {
        /* Criando um objeto:
        Para criar um objeto use como referência o nome da Classe de onde virá o objeto:
        Neste exemplo a classe de referência é chamada ChkConf, então defina o nome para o objeto
        aplique o construtor new e referencie novamente a Classe de onde veio o objeto
        Segue:
         */
        ChkConf chkConf = new ChkConf();

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