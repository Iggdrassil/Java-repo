package ru.Gelvanovsky.task12;

import java.io.File;

public class Recursion {
    static  final File dir = new File("C:/Users/1/IdeaProjects/Java-learning/src/ru/Gelvanovsky");
    public static void main(String[] args) {
        Recursion(dir);
    }
    private static void Recursion(File dirs){
        File[] dir = dirs.listFiles();
        for (File directories:dir) {
            if (directories.isFile()){
                System.out.println("==========================================================");
                System.out.println("Файл "+directories.getPath());
                System.out.println("==========================================================");
            }else {
                System.out.println("==========================================================");
                System.out.println("Директория "+directories.getPath());
                System.out.println("==========================================================");
                Recursion(directories);
            }
        }
        }
    }
