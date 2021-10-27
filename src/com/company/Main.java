package com.company;

public class Main {

    public static void main(String[] args) {

        Factoryclass factoryclass=new Factoryclass();

        StringInterface manageFile=factoryclass.getUser("MANAGEFILE");
        manageFile.writeFile(5);


    }
}

