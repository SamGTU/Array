package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayListImitation ma = new ArrayListImitation();
        String cmd = "";

        while(true){

            System.out.print("Введите команду: ");
            cmd = reader.readLine();

            switch (cmd) {
                case "add": {
                    System.out.print("Введите число: ");
                    cmd = reader.readLine();
                    ma.add(Integer.parseInt(cmd));
                    break;
                }
                case "print": {
                    System.out.print("Текущий массив: ");
                    for (int i = 0; i < ma.gerLength(); i++) {
                        System.out.print(ma.getByIndex(i) + " ");
                    }
                    System.out.println("");
                    break;
                }
                case "exit": System.exit(0);

                default:
                    System.out.println("Такой команды не существует!");
            }
        }
    }
}
