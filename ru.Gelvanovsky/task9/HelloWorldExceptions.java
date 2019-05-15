package ru.Gelvanovsky.task9;

import java.util.ArrayList;

public class HelloWorldExceptions {
    public static void PersonalException() throws MyPersonalException {
        try {
            throw new MyPersonalException("MyPersonalException");
        }catch (MyPersonalException ex){
            System.out.println("Program was crashed by MyPersonalException");
            throw ex;
        }
    }
    public static void main(String[] args) {
        try {
            String helloWorldString = null;
            System.out.println(helloWorldString.equals("Hello"));
        }catch (NullPointerException ex){
            System.out.println("Program was crashed by NullPointerException");
        }
        try {
            ArrayList helloWorldArray = new ArrayList();
            helloWorldArray.add("Hello ");
            helloWorldArray.add("World");
            System.out.println(helloWorldArray.get(2));
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Program was crashed by IndexOutOfBoundsException");
        }
        try {
            PersonalException();
        }catch (MyPersonalException ex){
            System.out.println("This is "+ex.getMessage());
        }
    }
}
