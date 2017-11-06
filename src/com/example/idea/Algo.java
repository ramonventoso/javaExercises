package com.example.idea;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by rventoso on 06/11/2017.
 */
public class Algo {
    /**
     * take an integer list and sort it.
     * @param list
     * @return
     */
    public ArrayList<Integer> QuickSort(ArrayList<Integer> list) {
        if (list.size() < 2) {
            return list;
        }

        ArrayList<Integer> fList = new ArrayList<>();
        // get a random element from the list
        Random random = new Random();
        int pivot = list.get(random.nextInt(list.size() - 1));
        // classify list by less or greater then pivot
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        for (int e : list) {
            if (e < pivot) {
                less.add(e);
            }
            else if (e > pivot){
                greater.add(e);
            }
        }

        fList.addAll(QuickSort(less));
        fList.add(pivot);
        fList.addAll((QuickSort(greater)));
        return fList;
    }

    /**
     * take an integer list and sort it. work with repeated numbers too.
     * @param list
     * @return
     */
    public ArrayList<Integer> QuickSortRepeated(ArrayList<Integer> list) {
        if (list.size() < 2) {
            return list;
        }

        ArrayList<Integer> fList = new ArrayList<>();
        // get a random element from the list
        Random random = new Random();
        int pivotIdx = random.nextInt(list.size() - 1);
        int pivot = list.get(pivotIdx);

        // classify list by less or greater then pivot
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if (i != pivotIdx){
                if (list.get(i) <= pivot) {
                    less.add(list.get(i));
                }
                else {
                    greater.add(list.get(i));
                }
            }
        }

        fList.addAll(QuickSortRepeated(less));
        fList.add(pivot);
        fList.addAll((QuickSortRepeated(greater)));
        return fList;
    }
}
