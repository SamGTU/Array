package com.company;


/**
 * Created by Victore on 17.10.2015.
 */

public class ArrayListImitation {
    int[] start_array = new int [0];
    void add(int elem) {
        int[] final_array = new int[start_array.length + 1];
        for (int i = 0; i < start_array.length; i++) {
            final_array[i] = start_array[i];
        }
        final_array[final_array.length - 1] = elem;
        this.start_array = final_array;
    }
public void inseard(int elem,int index){
    int[] final_array = new int[start_array.length+1];
    for (int i = 0 ; i < start_array.length; i ++){
        if(i < index){
            final_array[i] = start_array[i];
        }else{
            final_array[i] = start_array[i +1];
        }
    }
    final_array[index] = elem;
    this.start_array = final_array;
}

}




