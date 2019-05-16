package com.MyUniApp.MyUniAppBack.Exceptions;

public class KioskoException extends Exception{
    public static String NOT_FOUND = "THE ITEM DOES NOT EXISTS";
    public static String ALREADY_EXISTS="THE ITEM DOES ALREADY EXISTS";

    public KioskoException(String message){
        super(message);
    }
}
