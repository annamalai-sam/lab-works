package SampleProgram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IO {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Annamalai\\Documents\\start.txt");
        if(file.createNewFile()){
            System.out.println("File Created");
        }
        else {
            System.out.println("File Exist");
        }
        FileWriter writer = new FileWriter("A:\\demo\\ start.txt");
        writer.write("Mala....Da Annamala da.....");
        writer.close();
        System.out.println("Written in the file");
    }
}
