package com.MyUniApp.MyUniAppBack.Exceptions;

public class UserException extends Exception  {

    private static final long serialVersionUID = -777010973035917091L;
    public static String NOT_FOUND = "THE USER DOES NOT EXISTS";
    public static String ALREADY_EXISTS="THE USER DOES ALREADY EXISTS";

    public UserException(String message){
        super(message);
    }

}
