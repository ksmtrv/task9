package ru.vsu.cs.console;

import ru.vsu.cs.logic.FinalList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int f = readSomething("the number of the file you want to open: ");
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        readFile(list1, list2, f);

        List<Integer> listFinal = FinalList.getFinalList(list1, list2);

        writeFile(listFinal, f);
        printSomething(listFinal, list1, list2);
    }

    private static int readSomething(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %s ", name);
        return scanner.nextInt();
    }

    private static void readFile(List<Integer> list1, List<Integer> list2, int f) {
        File input = new File("src\\ru\\vsu\\cs\\file\\input" + f + ".txt");
        try {
            Scanner scannerFile = new Scanner(input);

            Scanner scannerLine = new Scanner(scannerFile.nextLine());
            while (scannerLine.hasNextInt()) {
                list1.add(scannerLine.nextInt());
            }

            scannerLine = new Scanner(scannerFile.nextLine());
            while (scannerLine.hasNextInt()) {
                list2.add(scannerLine.nextInt());
            }

            scannerFile.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found");
            System.exit(1);
        }
    }

    private static void writeFile(List<Integer> listFinal, int f) throws Exception {
        FileWriter output = new FileWriter("src\\ru\\vsu\\cs\\file\\output" + f + ".txt");
        output.write(String.valueOf(listFinal));
        output.close();
    }

    private static void printSomething(List<Integer> listFinal, List<Integer> list1, List<Integer> list2) {
        System.out.println("The first list:" + list1 + "\n" + "The second list:" + list2 + "\n" +
                "The final list: " + listFinal);
    }
}