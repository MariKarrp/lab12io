import java.io.*;
public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("src/input.txt");
            FileOutputStream out = new FileOutputStream("src/output.txt"));
        }
    }
}