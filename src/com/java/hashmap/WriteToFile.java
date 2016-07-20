package com.java.hashmap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WriteToFile {

    public static void writeMapToFile(HashMap<String, Integer> map) {

        try (FileWriter fileWriter = new FileWriter("F:\\java\\Lesson30\\words.txt");
             BufferedWriter writer = new BufferedWriter(fileWriter)) {

            for (Map.Entry entry : map.entrySet()) {

                writer.write(entry.getKey() + ": " + entry.getValue() + "\r\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
