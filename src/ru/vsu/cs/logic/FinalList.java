package ru.vsu.cs.logic;

import java.util.ArrayList;
import java.util.List;

public class FinalList {

    public static List<Integer> getFinalList(List<Integer> list1, List<Integer> list2) {
        List<Integer> listFinal = new ArrayList<>();

        addList1(list1, listFinal);
        addList2(list2, listFinal);

        return listFinal;
    }

    private static void addList1(List<Integer> list1, List<Integer> listFinal) {
        for (int i = 0; i < list1.size(); i++) {
            if (!listFinal.contains(list1.get(i))) {
                listFinal.add(list1.get(i));
            }
        }
    }

    private static void addList2(List<Integer> list2, List<Integer> listFinal) {
        for (int j = 0; j < list2.size(); j++) {
            if (!listFinal.contains(list2.get(j))) {
                listFinal.add(list2.get(j));
            }
        }
    }
}