package lesson16;

import lesson16.controller.ReadText;
import lesson16.controller.WriteText;
import lesson16.model.MyFile;
import lesson16.view.Console;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
        System.out.println("Какой файл скопировать?");
        String pathCopy = new Console().print();
        MyFile myFile = new MyFile(pathCopy);
        ReadText readText = new ReadText(myFile);
        List<String> stringList = readText.getStringList();

        System.out.println("Куда скопировать?");
        String pathResult = new Console().print();
        MyFile myFileWrite = new MyFile(pathResult);
        WriteText writeText = new WriteText(myFileWrite);
        writeText.setLines(stringList);
        writeText.writeFile();
        Console.close();
    }
}
