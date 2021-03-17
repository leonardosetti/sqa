package automation.selenium.java;

import java.util.Locale;

public class CurrentOS {

    public static void chkCurrentOS (String[] args){

        System.out.println(System.getProperty("os.name").toLowerCase());


    }
}
