package com.endava.service;

import com.endava.validator.Validator;

/**
 * 3/22/2017
 */
public class Menu {

    private InsertNumbers inser = new InsertNumbers();
    private Validator validator = new Validator();
    private int a = 3;
    private int b = 3;
    private int[][] arr = inser.insert(a,b);

    public void mainMenu(){

        printArray(arr);

        boolean done = true;
        while (done){
            System.out.println("Please choice command :\n" +
                    "1. Show current array \n" +
                    "2. Insert new dimensions \n" +
                    "3. Exit \n");
            int choice = validator.isDigit();

            if (choice == 1)printArray(arr);
            else if (choice == 2) insertNew();
            else if (choice == 3) {
                System.out.println("Buy!!!");
                done = false;
            }else System.out.println("Incorrect command");

        }

    }

    private void printArray(int[][] arr){
        System.out.println("Current Array");
        for (int[] ar1 : arr){
            for (int ar2 : ar1) {
                System.out.print(ar2 + " ");
            }
            System.out.println();
        }
    }

    private void insertNew(){
        System.out.println("Please insert 'a' size :");
        a = validator.isDigit();

        System.out.println("Please insert 'b' size :");
        b = validator.isDigit();

        arr = inser.insert(a,b);
        System.out.println("Done!");
    }

}
