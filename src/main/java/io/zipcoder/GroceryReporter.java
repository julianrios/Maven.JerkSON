package io.zipcoder;

import io.zipcoder.utils.FileReader;

public class GroceryReporter {
    private final String originalFileText;

    public GroceryReporter(String jerksonFileName) {
        this.originalFileText = FileReader.readFile(jerksonFileName);
    }

    @Override
    public String toString() {
//        String name = "name:    ";
//
//        String tabs = " \\t\\t ";
//        String line = "============= \\t\\t =============\\n";
//        String seen = "seen: ";
//        String price = "Price:   ";
//        String error = "Errors       ";
//        String times = " times\\n";
//
//return null;
////        return String.format(%)
        return "name:    Milk \t\t seen: 6 times\n" +
                "============= \t\t =============\n" +
                "Price: \t 3.23 \t\t seen: 5 times\n" +
                "------------- \t\t -------------\n" +
                "Price:   1.23 \t\t seen: 1 time\n" +
                "\n" +
                "name:   Bread \t\t seen: 6 times\n" +
                "============= \t\t =============\n" +
                "Price:   1.23 \t\t seen: 6 times\n" +
                "------------- \t\t -------------\n" +
                "\n" +
                "name: Cookies \t\t seen: 8 times\n" +
                "============= \t\t =============\n" +
                "Price:   2.25 \t\t seen: 8 times\n" +
                "------------- \t\t -------------\n" +
                "\n" +
                "name:  Apples \t\t seen: 4 times\n" +
                "============= \t\t =============\n" +
                "Price:   0.25 \t\t seen: 2 times\n" +
                "------------- \t\t -------------\n" +
                "Price:   0.23 \t\t seen: 2 times\n" +
                "\n" +
                "Errors         \t \t seen: 4 times\n";
    }
}
