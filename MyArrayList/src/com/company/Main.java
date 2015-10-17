package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    ArrayListImitation ma = new ArrayListImitation();
        ma.add(1);
        ma.inseard(2, 1);
        ma.add(9);
        System.out.println(ma.start_array[1]);

        int z = ma.getByIndex(2);

        System.out.println(z);

        ma.removeByIndex(1);

        System.out.println(ma.start_array[1]);






    }

}
