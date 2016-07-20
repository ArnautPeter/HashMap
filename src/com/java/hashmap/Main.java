package com.java.hashmap;

import java.io.File;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        File file = new File("F:\\java\\Lesson30\\1.txt");
        HashMap<String, Integer >words = ReadFromFile.calculateWords(file);
        WriteToFile.writeMapToFile(words);
    }
}
