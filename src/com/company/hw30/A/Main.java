package com.company.hw30.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Offers> offers = new ArrayList<>();
        ArrayList<Offers> offers2 = new ArrayList<>();    // "другой список"
        Offers one = new Offers("Ветер с моря дул");
        Offers two = new Offers("Нагонял беду");
        Offers three = new Offers("И сказал ты мне");
        Offers four = new Offers("Больше не приду");

        offers.add(one);
        offers.add(two);
        offers.add(three);
        offers.add(four);

        System.out.println("------------------");
        System.out.println(duplicateElements(Arrays.asList(one, two, three, four)));

        for (int i = 0; i < offers.size(); i++) {
            if (offers.get(i).getText().length() >= 15){
                offers2.add(offers.remove(i));
            }
        }
        System.out.println("-------------------\nПредложения, в которых больше 15 символов:");
        System.out.println(offers2.toString());

        offers2.remove(1);
        System.out.println("-------------------\nПосле удаления 1 индекса:");
        System.out.println(offers2.toString());

    }

    public static List<Offers> duplicateElements(List<Offers> input) { // нашел решение в интернете, но ничего не понял
        return input.stream()
                .flatMap(i -> Stream.of(i, i))
                .collect(Collectors.toList());
    }

//    public static List<Offers> movingList(List<Offers> list, List<Offers> list2){
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getText().length() >= 15){
//                list2.add(list.remove(i));
//            }
//        }
//        return null;
//    }
}
