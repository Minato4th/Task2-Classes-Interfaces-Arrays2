package com.endava.service;

import java.util.Random;

/**
 * 3/22/2017
 */
public class InsertNumbers {

    private int curentPos = 0;
    private int[] nums;

    public int[][] insert(int a, int b){
        curentPos = 0;
        nums = new int[a*b];

        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = randomNumVal(a, b, curentPos++);
            }
        }

        return arr;
    }

    private int randomNumVal(int a, int b, int current){
        Random random = new Random();
        boolean done = true;
        int randomNumVal = -1;


        while (done){
            done = false;
            randomNumVal = random.nextInt(a*b)+1;

            for (int n : nums){
                if (n == randomNumVal){
                    done = true;
                    break;
                }
            }

            nums[current] = randomNumVal;
        }

        return randomNumVal;
    }
}
