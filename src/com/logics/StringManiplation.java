package com.logics;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringManiplation {
    /*
        remove duplicates from String
         */
    public static List<String> findDuplicateInString(String str) {

                /*
                \\s+        ==>Remove spaces

                [^a-zA-Z]   ==>Keep only letters

                [^0-9]      ==>Keep only numbers

                [^a-zA-Z0-9]==>Remove special chars only

                [^a-zA-Z\\s]==>Keep letters and spaces

                */

        Map<String, Long> kAv = Arrays.stream(str.replaceAll("[^a-zA-Z]", "")
                        .toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        List<String> dups = kAv.entrySet().stream().filter(dup -> dup.getValue() > 1).map(Map.Entry::getKey).toList();
        return dups;
    }

    /*
    count the occurenece of each charcter in String
     */
    public static Map<String, Long> findOccur(String str1) {
        Map<String, Long> kAv1 = Arrays.stream(str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return kAv1;
    }

    /*
     write a java program to find  Non-repeated chars from given String
     */
    public static List<String> findNonRepChar(String str2) {
        Map<String, Long> kAv2 = Arrays.stream(str2.replaceAll("[^0-9a-zA-Z]", "").toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        // find non rep char
        List<String> nonreps = kAv2.entrySet().stream().filter(nonRep -> nonRep.getValue() == 1)
                .map(Map.Entry::getKey).toList();
        return nonreps;
        /*
        write a java program to find 1st Non-repeated charcater from given String
         */

    }

    public static Optional<String> FstNonChar(String str3) {
        Optional<String> fstNonrep = findOccur(str3).entrySet().stream().filter(fstNonRep -> fstNonRep.getValue() == 1)
                .map(Map.Entry::getKey).findFirst();
        return  fstNonrep;

    }


}
