package io.github.tricia_ai.java_programming.exercises.j013;
import java.io.*;

public class Exercise1 {
    public static void main(String[] args) {
        if (args.length != 0){
            for (String i : args) {
                BufferedReader buffer = null;
                try {
                    FileReader file = new FileReader(i);
                    buffer = new BufferedReader(file);
                } catch (FileNotFoundException e) {
                    System.out.println("File does not exist "+e.getMessage());
                    //throw e;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array Index is out of bound "+e);
                    //throw e;
                } finally {
                    if (buffer != null){
                        try {
                            buffer.close();
                            System.out.println("Process completed!");
                        } catch (IOException e){
                            System.out.println("Error closing file "+e);
                            //throw e;
                        }
                    }
                }
            }
        } else {
            System.out.println("No input entered");
        }

    }

}
