package com;

/**
 * Created by godjqb on 16-11-27.
 */
public class testContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i%3 == 0) {
                continue;
            }
            System.out.print(i+"\t");
        }
    }
}
