package ru.Gelvanovsky.task12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WorkWithFile {
    public static void main(String[] args) {
        Path path = Paths.get("TestFile.txt");
        try {
            Files.createFile(path);
            System.out.println("Создан файл: " + path.getFileName());
            Path copiedFile = Files.copy(path, Paths.get("CopiedFile.txt"));
            System.out.println("Файл " + path.getFileName() + " скопирован в " + copiedFile.getFileName());
            Path renamedPath = Files.move(path, Paths.get("RenamedFile.txt"));
            System.out.println("Файл " + path.getFileName() + " переименован в " + renamedPath.getFileName());
            Files.delete(Paths.get("RenamedFile.txt"));
            Files.delete(Paths.get("CopiedFile.txt"));
            System.out.println("Файл " + renamedPath.getFileName() + " удален");
            System.out.println("Файл " + copiedFile.getFileName() + " удален");
        }catch (IOException ex){
            System.out.println("Ошибка работы с файлом"+ex.getMessage());
        }
}}
