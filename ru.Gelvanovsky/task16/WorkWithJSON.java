package ru.Gelvanovsky.task16;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URL;

@JsonAutoDetect
public class WorkWithJSON {
    //static String fileName = "JSONFile.json";
    public static void main(String[] args) throws IOException {
        //Personage rick = new Personage(1,"Rick Sanchez","Alive","Human","Male");
        File fileName = new File("JSONFile.json");
        URL url = new URL("https://rickandmortyapi.com/api/character/1");
        InputStream is = url.openStream();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Personage rick = objectMapper.readValue(is, Personage.class);
        objectMapper.writeValue(fileName, rick);
        System.out.println(objectMapper.readTree(fileName));
        is.close();
    }
}
