package ru.vsu.cs.gui;

import javax.swing.*;

public class Frame extends JFrame {

    private JPanel mainPanel;
    private JTextField textReadField1;
    private JTextField textReadField2;
    private JTextField textFinalField;
    private JButton buttonPrintFinalList;

    public Frame() {
        super("Task 9");

        setContentPane(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        buttonPrintFinalList.addActionListener(new ListenerButtonFinalList(textReadField1, textReadField2, textFinalField));
    }
}