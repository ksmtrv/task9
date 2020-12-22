package ru.vsu.cs.gui.utils;

import java.util.ArrayList;

public class ListUtil {

    public static ArrayList<Integer> convertArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}