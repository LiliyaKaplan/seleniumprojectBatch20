package com.cybertek.tests.day14_excel_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException {

       String path = "shoppingList.txt";
        File file = new File(path);
        // check if file exists
        System.out.println(file.exists());

        Scanner scan = new Scanner(file);

        System.out.println(scan.nextLine());

        while(scan.hasNext()){
            System.out.println(scan.nextLine());
        }


    }
}
