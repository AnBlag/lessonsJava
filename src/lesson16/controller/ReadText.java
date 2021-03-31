package lesson16.controller;

import lesson16.model.MyFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadText {
    private List<String> stringList;
    {
        stringList = new ArrayList<>();
    }

    public ReadText(MyFile myFile) {
        try (BufferedReader buffer = new BufferedReader(new FileReader(myFile.getFile()))) {
            String curLine;
            while ((curLine = buffer.readLine()) != null) {
                stringList.add(curLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getStringList() {
        return stringList;
    }
}
