package ru.vsu.cs.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.cs.logic.FinalList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FinalListTest {

    @Test
    public void test1getFinalList() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> listFinal = FinalList.getFinalList(list1, list2);
        List<Integer> listResult = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Assertions.assertEquals(listFinal, listResult);
    }

    @Test
    public void test2getFinalList() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(-1, 1, -2, 2, -1, -2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 3));

        List<Integer> listFinal = FinalList.getFinalList(list1, list2);
        List<Integer> listResult = new ArrayList<>(Arrays.asList(-1, 1, -2, 2, 3, 4, 5));

        Assertions.assertEquals(listFinal, listResult);
    }

    @Test
    public void test3getFinalList() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 6, 7, 5, 6, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 3));

        List<Integer> listFinal = FinalList.getFinalList(list1, list2);
        List<Integer> listResult = new ArrayList<>(Arrays.asList(5, 6, 7, 1, 2, 3));

        Assertions.assertEquals(listFinal, listResult);
    }

    @Test
    public void test4getFinalList() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(0, 1, 0, 2, 0, 3, 0, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(0, 5, 0, 6, 0, 7));

        List<Integer> listFinal = FinalList.getFinalList(list1, list2);
        List<Integer> listResult = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));

        Assertions.assertEquals(listFinal, listResult);
    }

    @Test
    public void test5getFinalList() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(11, 22, 33, 33, 22, 11, 44));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(44, 55, 66, 66, 55, 44));

        List<Integer> listFinal = FinalList.getFinalList(list1, list2);
        List<Integer> listResult = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66));

        Assertions.assertEquals(listFinal, listResult);
    }
}