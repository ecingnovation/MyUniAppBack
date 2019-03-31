package com.MyUniApp.MyUniAppBack.Exceptions;

public class MapException extends Exception {

    private static final long serialVersionUID = 4793473695195438130L;

    public static String NOT_FOUND = "THE POINT DOES NOT EXISTS";

    public static String ALREADY_EXISTS="THE POINT DOES ALREADY EXISTS";



    public MapException(String message){
        super(message);

    }
}