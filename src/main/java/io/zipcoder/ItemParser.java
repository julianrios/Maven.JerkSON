package io.zipcoder;

import io.zipcoder.utils.Item;
import io.zipcoder.utils.ItemParseException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemParser {
    public List<Item> parseItemList(String valueToParse) throws ItemParseException {
        List <Item> parsedList = new ArrayList();
        String[] array = valueToParse.split("##");

        for(String line : array) {
            try {
                parsedList.add(parseSingleItem(line + "##"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return parsedList;
    }

    public Item parseSingleItem(String singleItem) throws ItemParseException {
        singleItem = singleItem.toLowerCase();

        String pattern = ("(\\w+)[%^*!@:;]+(\\w+);(\\w+)[%^*!@:;]+(\\d+\\.\\d{1,2})[%^*!@:;]+(\\w+)[%^*!@:;]+(\\w+);(\\w+)[%^*!@:;]+((\\d{1,2}/\\d{1,2}/\\d{4}))##");

        Pattern p = Pattern.compile(pattern);

        Matcher m = p.matcher(singleItem);
        m.matches();

        String name;
        Double price;
        String food;
        String expiration;

        try {
            name = m.group(2);
            price = Double.parseDouble(m.group(4));
            food = m.group(6);
            expiration = m.group(8);
            return new Item(name, price, food, expiration);
        }
        catch(Exception e) {
            System.out.println("Invalid Item");
            throw new ItemParseException();
        }
    }

//    public Double matchPrice(String price) throws ItemParseException {
//        Pattern pattern = Pattern.compile("(\\d+\\.\\d{1,2})");
//        if (!pattern.matcher(price).matches()) {
//            throw new ItemParseException();
//        }
//        return Double.parseDouble(price);
//    }
}
