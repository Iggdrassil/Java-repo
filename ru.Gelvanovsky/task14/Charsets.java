package ru.Gelvanovsky.task14;

import java.io.*;
import java.nio.charset.Charset;

public class Charsets {
    static String testingStr = "Тестовая строка!";
    static Charset charsetForOriginalFile = Charset.forName("UTF8");
    static Charset charsetForCopiedlFile = Charset.forName("Windows-1251");
    public static void main(String[] args) throws IOException {
        File original = new File("OriginalFile.txt");
        File copiedFile = new File( "CopiedFile.txt");
        OutputStream originalFile = new FileOutputStream(original);
        byte[] buffer = testingStr.getBytes(charsetForOriginalFile);
        originalFile.write(buffer);
        FileInputStream copied = new FileInputStream(original);
        int data = copied.read();
        while (data != -1){
            FileOutputStream copy = new FileOutputStream(copiedFile);
            byte[] bufferCopy = testingStr.getBytes(charsetForCopiedlFile);
            copy.write(bufferCopy);
            copy.close();
            break;
        }
        originalFile.close();
        copied.close();
    }
}
