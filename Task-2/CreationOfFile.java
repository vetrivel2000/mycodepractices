/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package file;
import java.io.*;
public class CreationOfFile {
    public void createAndWrite()
    {
        try{
            File object = new File("Sample.txt");
            if(object.createNewFile())
                System.out.println("File created");
            else
                System.out.println("Files Already exists");
            try(FileWriter object1 = new FileWriter("Sample.txt")){
            object1.write("Programmatically created file.");
            object1.write("\nThese words were written programmatically.");
            object1.write("\nAll is well. Be happy & enjoy the moment.");
            }
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
