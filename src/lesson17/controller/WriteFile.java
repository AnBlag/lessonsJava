package lesson17.controller;

import lesson17.exception.EmptyListException;
import lesson17.model.MyFile;

import java.io.*;
import java.nio.file.Files;


public class WriteFile {
    private MyFile myFile;
    private byte[] outputData;

    public WriteFile(MyFile myFile) {
        this.myFile = myFile;
    }

    public MyFile getMyFile() {
        return myFile;
    }

    public void setOutputData(byte[] outputData) {
        this.outputData = outputData;
    }

    public void writeFile() {
        if (outputData == null) {
            throw new EmptyListException();
        }
        else {
            try (FileOutputStream byteWriter = new FileOutputStream(myFile.getFile())) {
                for (byte outputDatum : outputData) {
                    try {
                        byteWriter.write(outputData);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
