package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MySwingAppTest {

    @Test
    public void testLabel() {
        MySwingApp app = new MySwingApp();
        assertEquals("Hello, Swing!", app.label.getText());
    }
}
