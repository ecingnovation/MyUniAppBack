package com.MyUniApp.MyUniAppBack.Exceptions;

public class KioskoException extends Exception{
    private static final long serialVersionUID = -8245785830447732624L;
    public static String NOT_FOUND = "THE ITEM DOES NOT EXISTS";
    public static String ALREADY_EXISTS="THE ITEM DOES ALREADY EXISTS";

    public KioskoException(String message){
        super(message);
    }
}
