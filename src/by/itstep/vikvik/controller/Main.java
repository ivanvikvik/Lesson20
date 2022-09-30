package by.itstep.vikvik.controller;

import by.itstep.vikvik.model.ArrayWorker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int size = 2_000_000;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        ArrayWorker.checkValue(array, 2_000_000);
        ArrayWorker.binarySearch(array, 2_000_000);

//        for (String arg : args) {
//            System.out.println(arg);
//        }

//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//        for (int item : array) {
//            item *= 2;
//        }

//        for (int i = 0; i < array.length; i++) {
//            array[i] *= 2;
//        }
//
//        for (int item : array) {
//            System.out.print(item + " ");
//        }
//        System.out.println(array);

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        for(int item : array){
//
//        }
//
//        for(Integer item : list){
//
//        }

    }

    public static void method(int[] array) {

    }

    public static int[] method() {
        return new int[0];
    }

}
