package com.cybertek.tests.d13_Properties_Driver_Testbase;

public class bSingleton {


    // singleton class will have private constructor
    //it means other classes cannot create object from this class


    private bSingleton(){}

    private static String str;

    public static String getInstance(){

        //if str has no value, initialize and return it
        if(str==null){
            System.out.println("str is null. assigningf value to it");
            str="somevalue";
        }else {
            System.out.println("It has value just return it");
        }
        return str;
    }
}
