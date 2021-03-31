package lesson16.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.File;

@Data
@AllArgsConstructor

public class MyFile {

    private String path;
    private File file;

    public MyFile(String path) {
        this.path = path;
        file = new File(path);
    }

    public File getFile() {
        return file;
    }
}
