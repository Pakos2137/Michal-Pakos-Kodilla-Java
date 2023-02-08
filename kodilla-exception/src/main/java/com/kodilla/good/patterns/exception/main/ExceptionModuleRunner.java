package com.kodilla.good.patterns.exception.main;
import com.kodilla.good.patterns.exception.io.FileReader;
import com.kodilla.good.patterns.exception.io.FileReaderException;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile("names.txt");
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}
