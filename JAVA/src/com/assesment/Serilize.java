package com.assesment;

import java.io.*;
import java.util.HashMap;

class mapdetails implements Serializable{
    public static HashMap userData(){
        HashMap<String, String> student = new HashMap<>();
        student.put("Annamalai", "Smart");
        student.put("Aswath", "18-");
        student.put("haiden", "playboy");
        return student;
    }
}
public class Serilize  {
    public static void main(String[] args) {
        try {
            FileOutputStream outputfile = new FileOutputStream("A:\\UserDetails\\user1.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(outputfile);
            objectOut.writeObject( mapdetails.userData());
            objectOut.close();
            outputfile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}