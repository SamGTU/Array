package com.company;

/**
 * Created by xyzyx on 17.10.2015.
 */
public class MyList {
    private int[] arr;
    //private int index;
    private int lengthArray;

    //�����������
    MyList(){
        this.lengthArray = 0;
    }

    //���������� �������� � ����� �������
    void addElem(int elem){
        reArray();
        this.arr[this.lengthArray - 1] = elem;
    }

    //��������� ������� ������ �������
    int getLength(){
        return this.lengthArray;
    }

    /* void printElem(int index) {
        if(index > 0 && index <= this.lengthArray) {
            System.out.println("this elem: " + this.arr[index - 1]);
        } else {
            System.out.println("no element!");
        }
    } */

    //��������� ��������
    int getElem(int index){
        return this.arr[index];
    }

    //void delElemIndex(int index){}

    //void delElem(int elem){}

    //void addElemBefore(int index){}

    //���������� ������ ������� �� 1
    void reArray(){
        int[] buf = new int[this.lengthArray + 1];
        for (int i = 0; i < this.lengthArray ; i++) {
            buf[i] = this.arr[i];
        }
        this.lengthArray = buf.length;
        this.arr = buf;
    }

}
