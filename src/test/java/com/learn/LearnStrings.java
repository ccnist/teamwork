package com.learn;

public class LearnStrings {

    public static void main(String Args[]) {

        LearnStrings ls = new LearnStrings();
        ls.permutationsFromGivenString("", "Hello");
    }


    // Program for String permutations and combinations

    private void permutationsFromGivenString(String permutation, String str) {
        if (str.length() == 0) {
            System.out.println(permutation);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permutationsFromGivenString(permutation + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
            }
        }
    }}

