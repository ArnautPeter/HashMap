package com.java.hashmap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadFromFile {

    public static HashMap<String, Integer> calculateWords(File file) {

        HashMap<String, Integer> words = new HashMap<>();
        String line;

        try (FileReader fileReader = new FileReader(file);
             BufferedReader reader = new BufferedReader(fileReader)) {

            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(" ");
                for (String tempWord : arr) {
                    if (tempWord.length() < 3)
                        continue;
                    if (!words.containsKey(tempWord)) {
                        words.put(tempWord, 1);
                    } else {
                        int value = words.get(tempWord);
                        words.put(tempWord, value + 1);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return words;
    }
}
