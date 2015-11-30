package com.company;


import java.util.Arrays;
import java.util.Objects;

/**
 * Created by Victore on 17.10.2015.
 */

public class ArrayListImitation  {
    private Object[] start_array;

    private int i;

    public ArrayListImitation(){
        start_array = new Object[5];
    }

    public void add(Object data) {
        Object[] buffer_array = Arrays.copyOf(start_array,start_array.length);
        if (start_array[start_array.length - 1] != null ){
            buffer_array = Arrays.copyOf(start_array,start_array.length * 2);

        }

        for (i = 0;i < buffer_array.length;i ++){
            if (buffer_array[i] == null){
                buffer_array[i] = data;
                break;
            }
        }
        this.start_array = buffer_array;

    }

    public void inseard(Object data, int index) {
        Object[] buffer_array = Arrays.copyOf(start_array,start_array.length);
        if (start_array[start_array.length - 1] != null && start_array.length  < index ){
            buffer_array = Arrays.copyOf(start_array,start_array.length * 2);

        }

        for (int i = 0; i < start_array.length - 1; i++)  {
            if (i < index) {
                buffer_array[i] = start_array[i];
            } else {
                buffer_array[i + 1] = start_array[i];
            }
        }
        buffer_array[index] = data;
        this.start_array = buffer_array;
        System.out.println(Arrays.toString(start_array));
    }

    Object getByIndex(int index) {
        return start_array[index - 1];
    }
//
//    void removeByIndex(int index) {
//        Objects[] final_array = new Objects[start_array.length - 1];
//        for (int i = 0; i < final_array.length; i++) {
//            if (i < index) {
//                final_array[i] = start_array[i];
//            } else {
//                final_array[i] = start_array[i + 1];
//            }
//        }
//        this.start_array = final_array;
//    }
//
    void printArray() {
        for (int i = 0; i < start_array.length; i++) {
            System.out.print(start_array[i] + " ");
        }

    }
//
//    void inputArray() throws IOException {
//        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
//        int size = Integer.parseInt(reader.readLine());
//        Objects[] final_array = new Objects[size];
//        for (int i = 0; i < size; i++) {
//            Object b = reader.readLine();
//            final_array[i] = (Objects) b;
//        }
//        this.start_array = final_array;
//    }
//
//    void removeByElem(int elem) {
//        Object[] final_array = new Object[start_array.length - 1];
//        for (int i = 0; i < final_array.length; i++) {
//            if(start_array[i].equals(elem)){
//                final_array[i] = start_array[i];
//            }else{
//                final_array[i] = start_array[i + 1];
//            }
//            if (start_array[i + 1].equals(final_array[i])){
//                final_array[i] = start_array[i];
//            }
//        }
//        this.start_array = (Objects[]) final_array;
//    }
//
//    int gerLength(){
//        return this.start_array.length;
//    }
}






