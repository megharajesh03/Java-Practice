//Exception Handling3
package week3;

import java.io.*;

public class FileUploadSystem {

    public static void main(String[] args) {

        FileInputStream fis = null;
        String fileName = "C:\\Users\\Administrator\\Desktop\\sample.txt";

        try {

            fis = new FileInputStream(fileName);	//enter valid file

            int data;
            System.out.println("File contents:");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please upload a valid file.");
        } catch (SecurityException e) {
            System.out.println("Error: You don't have permission to access this file.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
        } finally {

            try {
                if (fis != null) {
                    fis.close();
                    System.out.println("\nFile stream closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error: Unable to close the file properly.");
            }
        }
    }
}

