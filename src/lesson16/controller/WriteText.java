package lesson16.controller;

import lesson16.exception.EmptyListException;
import lesson16.model.MyFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteText {
    private MyFile myFile;
    private List<String> lines;

    public WriteText(MyFile myFile) {
        this.myFile = myFile;
    }

    public MyFile getMyFile() {
        return myFile;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public void writeFile() {
        if (lines == null) {
            throw new EmptyListException();
        }
        else {
            try (FileWriter fileWriter = new FileWriter(myFile.getFile())) {
                lines.forEach(lines -> {
                    try {
                        fileWriter.write(lines);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
