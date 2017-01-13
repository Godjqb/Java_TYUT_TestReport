package com;

/**
 * Created by godjqb on 16-11-27.
 */
public class switchex {
    public static void main(String[] args) {
        int random = 1 + (int)(Math.random()*4);
        switch (random) {
            case 1:
                System.out.println("I feel fine ");
                break;
            case 2:
                System.out.println("I've been better ");
                break;
            case 3:
                System.out.println("I feel horrible ");
                break;
            case 4:
                System.out.println("I feel terrific");
        }
    }
}
