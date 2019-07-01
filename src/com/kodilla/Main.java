package com.kodilla;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Clock> clocks = new LinkedList<>();
        clocks.add(new Clock(9,30));
        clocks.add(new Clock(10,59));
        clocks.add(new Clock(11,59));

        clocks.stream().forEach(System.out::println);

        System.out.println();

        for (Clock c : clocks) {
            c.addMinutes(1);
        }

        clocks.stream().forEach(System.out::println);
    }
}
