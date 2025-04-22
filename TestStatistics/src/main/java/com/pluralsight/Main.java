package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        int[] testScores1 = { 10, 16, 13, 19, 15, 23, 25, 79, 90, 100 };
        int[] testScores2 = { 10, 16, 13, 19, 15, 23, 25, 79, 90 };

        double total = 0;
        double arrayLength1 = testScores1.length;
        double arrayLength2 = testScores2.length;

        double median = 0;
        double middleIndex1 = Math.floor(arrayLength1/2);
        double middleIndex2 = Math.floor(arrayLength2/2);

        median = testScores2[(int) middleIndex2];
        System.out.println("Median for 9-index Scores:   " + median);

        median = (double)(testScores1[(int) middleIndex1] + testScores1[(int) middleIndex1 - 1]) / 2;
        System.out.println("Median for 10-index Scores:   " + median);

        double maximum = Double.NEGATIVE_INFINITY;
        double minimum = Double.POSITIVE_INFINITY;

        for (int testScore : testScores1) {
            if (testScore > maximum) {
                maximum = testScore;
            }

            if (testScore < minimum) {
                minimum = testScore;
            }

            total += testScore;
        }

        double average = total / arrayLength1;

        System.out.println("\nTEST REPORT for CLASS 5");
        System.out.println("Average of the test scores:   " + average);
        System.out.println("Lowest Test Score:   " + minimum);
        System.out.println("Highest Test Score:   " + maximum);
    }
}