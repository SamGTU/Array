package com.company;


/**
 * Created by Victore on 17.10.2015.
 */

public class ArrayListImitation {
    int[] start_array;
    public ArrayListImitation(){
       start_array = new int[0];
    }
    public void add(int elem) {
        int[] final_array = new int[start_array.length + 1];
        for (int i = 0; i < final_array.length; i++) {
            start_array[i] = final_array[i];
        }
        final_array[final_array.length - 1] = elem;
        this.start_array = final_array;
    }
}




