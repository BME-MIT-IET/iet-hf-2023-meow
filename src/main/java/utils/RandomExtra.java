package main.java.utils;

public class RandomExtra extends java.util.Random {

    /**
     * Generates a random number between min and max, both inclusive.
     * @param min the minimum value
     * @param max the maximum value
     * @return a random integer between min and max (inclusive)
     */
    public int randomBetween(int min, int max) {
        return nextInt(max - min + 1) + min;
    }
}
