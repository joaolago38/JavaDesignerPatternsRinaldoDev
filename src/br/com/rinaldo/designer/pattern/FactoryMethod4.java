package br.com.rinaldo.designer.pattern;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;

public class FactoryMethod4 {
    public static void main(String args){
        // static factory methods
        Calendar.getInstance();
        NumberFormat.getInstance();
        Stream.of(1,2,3,4,5);
        List.of(1,2,3,4,5);
        Integer.valueOf("1234");
    }
}
