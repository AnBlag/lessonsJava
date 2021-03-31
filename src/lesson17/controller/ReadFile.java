package lesson17.controller;



import lesson17.model.MyFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ReadFile {

    private byte[] data;
    {
        data = new byte[20460];
    }

    public ReadFile (MyFile myFile) {
        try {
            Path fileLocation = Paths.get(myFile.getPath());
            data = Files.readAllBytes(fileLocation);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public byte[] getData() {
        return data;
    }
}
