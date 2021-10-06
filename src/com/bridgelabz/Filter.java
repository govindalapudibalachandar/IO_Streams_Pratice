package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        //Using ArrayaList
   /*     ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        arraylist.add(50);
        arraylist.add(60);*/

        //used collection arraya
        List<Integer> arraylist = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenarraylist = new ArrayList<>();

        //WithoutStreams
     /*   for(int n :arraylist)
        {
            if (n%2==0)
                evenarraylist.add(n);
        }
        System.out.println(evenarraylist);*/

        //WithStreams
        evenarraylist = arraylist.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenarraylist);
    }
}