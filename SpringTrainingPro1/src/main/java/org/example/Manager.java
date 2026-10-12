package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Manager implements Staff {
//    private String name;
//    private int salary;

    @Override
    public void doWork() {
        System.out.println("делает вид что работает");
    }
}
