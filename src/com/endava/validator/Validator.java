package com.endava.validator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3/22/2017
 */
public class Validator {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String isString(){
        boolean done = true;
        String string = "";

        while (done) {

            done = false;
            try {
                string = reader.readLine();
            } catch (IOException e) {
                System.out.println("Something go wrong, try again");
                done = true;
            }

        }

        return string;
    }

    public int isDigit(){
        boolean done = true;
        String numS = "";

        while (done) {

            done = false;
            numS = isString();

            for (int i = 0; i < numS.length(); i++) {
                if (!Character.isDigit(numS.charAt(i))){
                    System.out.println("Wrong number format, please try again");
                    done = true;
                    break;
                }
            }

        }

        return Integer.parseInt(numS);
    }
}
