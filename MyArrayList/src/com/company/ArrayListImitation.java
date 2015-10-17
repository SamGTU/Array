package com.company;


import java.awt.*;
import java.util.Scanner;

/**
 * Created by Victore on 17.10.2015.
 */

public class ArrayListImitation {
    protected int[] start_array = new int [0];
    void add(int elem) {
            int[] final_array = new int[start_array.length + 1];
            for (int i = 0; i < start_array.length; i++) {
                final_array[i] = start_array[i];
            }
            final_array[final_array.length - 1] = elem;
            this.start_array = final_array;
    }

    void inseard(int elem,int index){
        int[] final_array = new int[start_array.length+1];
        for (int i = 0 ; i < start_array.length; i ++){
            if(i < index){
                final_array[i] = start_array[i];
            }else{
                final_array[i] = start_array[i + 1];
            }
        }
        final_array[index] = elem;
        this.start_array = final_array;
    }

    int getByIndex(int index){
        return start_array[index];
    }

    void removeByIndex(int index){
        int[] final_array = new int[start_array.length - 1];
        for (int i = 0; i < final_array.length; i++){
            if (i < index ){
                final_array[i] = start_array[i];
            }else{
                final_array[i] = start_array[i+1];
            }
        }
        this.start_array = final_array;
    }

    void printArray(){
        for (int i = 0;i < start_array.length; i++ ){
            System.out.print(start_array[i]+ " ");
        }

    }

    void inputArray(){
        Scanner input  = new Scanner(System.in);
        int size = input.nextInt();
        int[] final_array = new int[size];
        for (int i = 0; i < size; i ++){
            final_array[i] = input.nextInt();
        }
        this.start_array = final_array;
    }



}




