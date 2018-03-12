package com.learn;

import java.util.ArrayList;

public class LearnStrings {

    public static void main(String Args[]) {

        LearnStrings ls = new LearnStrings();
        // ls.permutationsFromGivenString("", "Hello");
        System.out.println(ls.verifyGivenStingInArray("chandra", "chadra"));
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
    }

    public boolean verifyGivenStingInArray(String toFind, String given) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < given.length(); i++) {
            given = replaceLastChar(given);
            list.add(given);
        }
        System.out.println(list);
        return list.contains(toFind);

    }

    private String replaceLastChar(String str) {
        str = str.charAt(str.length() - 1) + (str.substring(0, str.length() - 1));
        return str;
    }


}

