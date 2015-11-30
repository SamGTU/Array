package com.company;

import javax.swing.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException{

       int index;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayListImitation ma = new ArrayListImitation();


        while(true){

            System.out.print("Введите команду: ");
            String cmd = reader.readLine();

            switch (cmd) {
                case "add": {
                    System.out.print("Введите : ");
                    Object data = reader.readLine();
                    ma.add(data);
                    ma.printArray();
                    break;
                }
                case "inseard": {
                    System.out.print("Введите данные: ");
                    Object data = reader.readLine();
                    System.out.print("Введите индекс: ");
                    index = Integer.parseInt(reader.readLine());
                    ma.inseard(data,index);
                    break;
                }
                case "print": {
                    System.out.print("Текущий массив: ");
                    ma.printArray();
                    System.out.println("");
                    break;
                }
                case "get": {
                    System.out.println("Введите индекс: ");
                    index = Integer.parseInt(reader.readLine());
                    System.out.println("Эллемент массива: " + ma.getByIndex(index));
                    break;
                }

                case "exit": System.exit(0);

                default:
                    System.out.println("Такой команды не существует!");
            }
        }
    }
}

