package com;

import javax.swing.*;

/**
 * Created by godjqb on 16-11-27.
 */

public class Encrypt {
    public static void main(String[] args) {
        int number;
        int [] digit;
        int encryptedNumber;

        digit = new int [4];

        String inputNumber = JOptionPane.showInputDialog(" Enter a four digit number: ");
        number = Integer.parseInt(inputNumber);

        for (int i = 0; i < inputNumber.length(); i++) {
            digit[i] = Integer.parseInt(inputNumber.substring(i,i+1));
            digit[i] = (digit[i]+7)%10;
        }

        encryptedNumber = Integer.parseInt(Integer.toString(digit[2])+Integer.toString(digit[3])
                +Integer.toString(digit[0])+Integer.toString(digit[1]));

        JOptionPane.showMessageDialog(null,number+"加密之后是:"+encryptedNumber,
                "密文",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}
