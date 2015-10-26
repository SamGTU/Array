package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Victore on 17.10.2015.
 */

public class ArrayListImitation {
    private Objects[] start_array = new Objects[0];
    //private int size = start_array.length;



    void add(Objects elem) {
        Objects[] final_array = new Objects[start_array.length];
        for (int i = 0; i < start_array.length; i++) {
            final_array[i] = start_array[i];
        }
        final_array[final_array.length - 1] = elem;
        this.start_array = final_array;
    }

    void inseard(Objects elem, int index) {
        Objects[]final_array = new Objects[start_array.length + 1];
        for (int i = 0; i < start_array.length; i++) {
            if (i < index) {
                final_array[i] = start_array[i];
            } else {
                final_array[i] = start_array[i + 1];
            }
        }
        final_array[index] = elem;
        this.start_array = final_array;
    }

    Objects getByIndex(int index) {
        return start_array[index];
    }

    void removeByIndex(int index) {
        Objects[] final_array = new Objects[start_array.length - 1];
        for (int i = 0; i < final_array.length; i++) {
            if (i < index) {
                final_array[i] = start_array[i];
            } else {
                final_array[i] = start_array[i + 1];
            }
        }
        this.start_array = final_array;
    }

    void printArray() {
        for (int i = 0; i < start_array.length; i++) {
            System.out.print(start_array[i] + " ");
        }

    }

    void inputArray() throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        Objects[] final_array = new Objects[size];
        for (int i = 0; i < size; i++) {
            Object b = reader.readLine();
            final_array[i] = (Objects) b;
        }
        this.start_array = final_array;
    }

    void removeByElem(int elem) {
        Object[] final_array = new Object[start_array.length - 1];
        for (int i = 0; i < final_array.length; i++) {
            if(start_array[i].equals(elem)){
                final_array[i] = start_array[i];
            }else{
                final_array[i] = start_array[i + 1];
            }
            if (start_array[i + 1].equals(final_array[i])){
                final_array[i] = start_array[i];
            }
        }
        this.start_array = (Objects[]) final_array;
    }

    int gerLength(){
        return this.start_array.length;
    }
}






