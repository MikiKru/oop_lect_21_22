package lect04;

import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public void appendToFile(String path, String content) {
        try {
            if(content.equals("") || content.equals("\n")){
                throw new EmptyValueException();
            }
            FileWriter fileWriter = new FileWriter(path, true);
            fileWriter.append(content);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Bad path to file");
//            e.printStackTrace();
        } catch (EmptyValueException e){
            System.err.println("Content have not to be empty");
            System.err.println("Nothing add to file!");
        } catch (Exception e){
            System.out.println("Catch by Exception class!!!");
            e.printStackTrace();
        }
    }

    public void writeToFile(String path, String content) {
        try {
            PrintWriter printWriter = new PrintWriter(path);
            printWriter.println(content);
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Bad path to file");
//            e.printStackTrace();
        }
    }

    private void readFromFile(String path) {
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Bad path to file");
//            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileOperations fo = new FileOperations();
        fo.writeToFile("F1.txt", "My first line");
        fo.writeToFile("F1.txt", "My second line");
        fo.writeToFile("F1.txt", "My third line\nmmmm");
        fo.appendToFile("F2.txt", "One\n");
        fo.appendToFile("F2.txt", "Two\n");
        fo.appendToFile("F2.txt", "Three\n");
        fo.appendToFile("F2.txt", "\n");
        fo.appendToFile("F2.txt", null);
        System.out.println("File 1");
        fo.readFromFile("F1.txt");
        System.out.println("File 2");
        fo.readFromFile("F2.txt");
    }
}
