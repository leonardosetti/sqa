package automation.selenium.java;

public class Parent {

    public static void main(String[] args) {
        // This is the parent class used to call other classes with their methods
        System.out.println("Calling the Method <> from Class <> in this current pckg");

        /* Criando um objeto:
        Para criar um objeto use como referência o nome da Classe de onde virá o objeto:
        Neste exemplo a classe de rferência é chamada Methods, então defina o nome para o objeto
        aplique o construtor new e referencie novamente a Classe de onde veio o objeto
        Segue:
         */
        Methods confChk = new Methods();

        //Class_object.method_name
        Methods.setWebdriver();

        ReturningTypes myreturns = new ReturningTypes();

        System.out.println(myreturns.valueInt());

        System.out.println(myreturns.valueStr());

        System.out.println(Methods.myDriver());
    }
}