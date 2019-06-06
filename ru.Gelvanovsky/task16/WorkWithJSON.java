package ru.Gelvanovsky.task16;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URL;

@JsonAutoDetect
public class WorkWithJSON {
    //static String fileName = "JSONFile.json";
    public static void main(String[] args) throws IOException {
        File fileName = new File("JSONFile.json");
        URL url = new URL("https://rickandmortyapi.com/api/character/1");
        InputStream is = url.openStream();
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);
        Object object = br.readLine();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(fileName, object);
        System.out.println(objectMapper.readTree(fileName));
        br.close();
        is.close();
        reader.close();
    }
}
