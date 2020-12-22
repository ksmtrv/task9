package ru.vsu.cs.gui;

import ru.vsu.cs.gui.utils.ArrayUtil;
import ru.vsu.cs.gui.utils.ListUtil;
import ru.vsu.cs.logic.FinalList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ListenerButtonFinalList implements ActionListener {

    JTextField textReadField1;
    JTextField textReadField2;
    JTextField textFinalField;

    public ListenerButtonFinalList(JTextField textReadField1, JTextField textReadField2, JTextField textFinalField) {
        this.textReadField1 = textReadField1;
        this.textReadField2 = textReadField2;
        this.textFinalField = textFinalField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int[] readField1Text = ArrayUtil.toIntArray(textReadField1.getText());
        List<Integer> list1 = ListUtil.convertArrayList(readField1Text);

        int[] readField2Text = ArrayUtil.toIntArray(textReadField2.getText());
        List<Integer> list2 = ListUtil.convertArrayList(readField2Text);

        List<Integer> finalList = FinalList.getFinalList(list1, list2);

        textFinalField.setText(String.valueOf(finalList));
    }
}