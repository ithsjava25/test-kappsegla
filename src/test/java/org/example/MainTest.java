package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Main method should print Hello World")
    public void mainMethodShouldPrintHelloWorld() {
        // Capture System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        Main.main(new String[]{});

        // Restore System.out
        System.setOut(originalOut);

        // Assert output
        assertEquals("Hello World" + System.lineSeparator(), outContent.toString());
    }


}