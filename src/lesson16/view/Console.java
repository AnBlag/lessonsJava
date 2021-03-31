package lesson16.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    public static BufferedReader buffer;

    public static String print() {
        String text = null;
        try {
            buffer = new BufferedReader(new InputStreamReader((System.in)));
            text = buffer.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    public static void close() {
        try {
                buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
