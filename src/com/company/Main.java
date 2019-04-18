package com.company;


import java.util.Collections;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<Double> temperatureList = new ArrayList<>();
        temperatureList.add(40.5);
        temperatureList.add(33.9);
        temperatureList.add(37.8);
        temperatureList.add(15.3);
        temperatureList.add(25.6);

        Collections.sort(temperatureList);
//        for (Double temp:temperatureList){
//            System.out.println(temp);
//        }

    //For Collections.binarySearch to work it needed Collections.sort(myArray)
        int searchIndex = Collections.binarySearch(temperatureList, 15.3);
        if(searchIndex >= 0){
            System.out.println("Temperature found." + searchIndex);
        } else{
            System.out.println("Temperature not found." + searchIndex);
        }

//        Collections.shuffle(temperatureList);
//        for (Double temp:temperatureList){
//            System.out.println(temp);
//        }

    }
}
