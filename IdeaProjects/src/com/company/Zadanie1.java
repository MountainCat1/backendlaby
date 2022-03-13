package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Zadanie1 {
    public static void Start() throws IOException {
        String localDir = System.getProperty("user.dir");

        System.out.println("Reading file");
        System.out.print(localDir);

        InputStream input = new FileInputStream(localDir + "\\data\\int_data.txt");
        int data = input.read();
        while (data != -1) {
            System.out.println(data);
            data = input.read();
        }
        input.close();

        System.out.println(data);

    }
}
