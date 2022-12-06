package com.JavaCore.Exception;

public class ExceptionRunner {
    public static void main(String[] args) {
        String value = null;
        try{
            value.length();
        }catch(NullPointerException exception){
            exception.printStackTrace();
        }
    }
}
