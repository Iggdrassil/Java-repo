package ru.Gelvanovsky.task12;

import java.io.File;

public class Recursion {
    static  final File dir = new File("C:/Users/1/IdeaProjects/Java-learning/src/ru/Gelvanovsky");
    public static void main(String[] args) {
        Recursion(dir, 0);
    }
    private static void Recursion(File dirs, int depth) {
        File[] dir = dirs.listFiles();
        depth++;
        for (File directories : dir) {
            if (directories.isFile()) {
                if (depth == 2){
                    System.out.println("        Файл: " + directories.getName());
                }
                if (depth >=3){
                    System.out.println("    Файл: " + directories.getName());
                }
            } else {
                if (depth == 1) {
                    System.out.println("Директория: " + directories.getName());
                }
                if (depth == 2){
                    System.out.println("    Директория: " + directories.getName());
                    depth++;
                }
                Recursion(directories, 1);
            }
        }
    }}
