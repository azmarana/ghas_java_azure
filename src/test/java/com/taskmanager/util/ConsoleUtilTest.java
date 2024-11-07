package com.taskmanager.util;

import com.taskmanager.model.Task;
import com.taskmanager.repository.TaskRepository;
import com.taskmanager.service.TaskService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class ConsoleUtilTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setIn(new ByteArrayInputStream("Test Input\n".getBytes()));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testReadInput() {
        // Assuming ConsoleUtil has a method to read input
        String result = ConsoleUtil.readString("Enter input: ");
        assertEquals("Test Input", result);
    }

    @Test
    void testPrintOutput() {
        // Assuming ConsoleUtil has a method to print output
        ConsoleUtil.print("Hello World");

        // Verify the output is as expected
        String expectedOutput = "Hello World\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}