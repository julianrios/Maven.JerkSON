package io.zipcoder;

import io.zipcoder.utils.Item;
import io.zipcoder.utils.ItemParseException;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemParser {
    public List<Item> parseItemList(String valueToParse) {
        return null;
    }

    public Item parseSingleItem(String singleItem) throws ItemParseException {
        singleItem = singleItem.toLowerCase();
//          1   2    3     4    5    6     7           8
//        naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##
        String pattern = ("(\\w+):(\\w+);(\\w+):(\\d\\.\\d{2});(\\w+):(\\w+);(\\w+):((\\d{1,2}/\\d{1,2}/\\d{4}))##");
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(singleItem);
        m.matches();
//        System.out.println(m.matches()); // returns true if it is a pattern
//        System.out.println(m.group(0)); // returns the entire matching pattern
//        System.out.println(m.group(2));
//        System.out.println(m.group(4));
//        System.out.println(m.group(6));
//        System.out.println(m.group(8));

        String name = m.group(2);
        Double price = Double.parseDouble(m.group(4));
        String food = m.group(6);
        String expiration = m.group(8);

        return new Item(name, price, food, expiration);
    }

    public String name(String name) {
        if(name.equals("Milk")) {

        } else if(name.equals("Milk"))
    }


}
