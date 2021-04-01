package lesson17;

import lesson17.controller.ReadFile;
import lesson17.controller.WriteFile;
import lesson17.model.MyFile;
import lesson17.view.Console;


public class App {
    public static void main(String[] args) {
        System.out.println("Какой файл скопировать?");
        String pathCopy = new Console().print();
        MyFile myFile = new MyFile(pathCopy);
        ReadFile readFile = new ReadFile(myFile);
        byte[] data = readFile.getData();

        System.out.println("Куда скопировать?");
        String pathResult = new Console().print();
        MyFile myFileWrite = new MyFile(pathResult);
        WriteFile writerFile = new WriteFile(myFileWrite);
        writerFile.setOutputData(data);
        writerFile.writeFile();
        Console.close();

    }
}
