package com.kevingates.uniswap.models;

import java.io.File;
import java.util.Scanner;

public class User {

    public static String getUserName() {
        return "kevin gates from sub module";
    }

    public static String howto() {
        String data = "";
        try {
            File file = new File("/home/kevin/Downloads/www/java/springMultiModule/README");
            Scanner sc = new Scanner(file);

            // we just need to use \\Z as delimiter
            sc.useDelimiter("\\Z");

            data = sc.next();

        } catch (Exception ex) {
            System.out.println("error");
        }

        return " good " +data;
    }
}
