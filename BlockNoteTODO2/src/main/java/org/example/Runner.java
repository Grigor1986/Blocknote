package org.example;

import org.example.controller.handlers.implementation.ViewMethodsImpl;

import java.io.IOException;

public class Runner {
    static void main() throws IOException, InterruptedException {
        new ViewMethodsImpl().startProgram();
    }
}
