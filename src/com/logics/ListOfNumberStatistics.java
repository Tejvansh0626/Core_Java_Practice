package com.logics;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ListOfNumberStatistics {
    /*
    get the High number from list of numbers
     */
    public static Optional<Integer> getHighNum(List<Integer> listOfNums) {
        Optional<Integer> max = listOfNums.stream().max(Comparator.naturalOrder());
        return max;

    }

    /*
    get the 2nd High Number
     */
    public static Optional<Integer> getSecHighNum(List<Integer> list1) {
        Optional<Integer> sechighNum = list1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        return sechighNum;
    }
    /*
    get the Min number from List
     */

    public static Optional<Integer> getMinNum(List<Integer> list2) {
        Optional<Integer> minNum = list2.stream().min(Comparator.naturalOrder());
        return minNum;

    }

    /*
    get the sec min number
     */
    public static Optional<Integer> getSecMinNum(List<Integer> list3) {
        Optional<Integer> secMinNum = list3.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst();
        return secMinNum;
    }
}
