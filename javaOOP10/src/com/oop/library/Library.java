package com.oop.library;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        Rent longestTime = rents[1];
        long longest = rents[0].end.getTime();
        for (int i = 0; i < rents.length; i++) {
            if (longest < rents[i].end.getTime()) {
                longest = rents[i].end.getTime();
                longestTime = rents[i];
            }
        }

        return longestTime;
    }
}
