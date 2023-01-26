package com.example;

import javax.swing.*;
import java.awt.*;

public class MySwingApp extends JFrame {

    JLabel label;

    public MySwingApp() {
        setTitle("My Swing Application");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Hello, Swing!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        MySwingApp app = new MySwingApp();
        app.setVisible(true);
    }
}

