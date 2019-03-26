package com.MyUniApp.MyUniAppBack.Exceptions;

public class MapException extends Exception {

    public static String NOT_FOUND="THE POINT DOES NOT EXISTS";

    public static String ALREADY_EXISTS="THE POINT DOES ALREADY EXISTS";



    public MapException(String message){
        super(message);

    }
}