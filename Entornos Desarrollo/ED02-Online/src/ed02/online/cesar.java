/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed02.online;

import java.util.Scanner;
//caeser 

public class cesar {

    public static final String ALPHABET = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZhh";

    public static String encrypt(String plainText, int shiftKey) {

        plainText = plainText.toUpperCase();

        String cipherText = " ";

        for (int i = 0; i < plainText.length(); i++) {

            if (Character.isWhitespace(plainText.charAt(i))) {
                cipherText += " ";
            } else {
                int charPosition = ALPHABET.indexOf(plainText.charAt(i));
                int keyVal = (shiftKey + charPosition) % 27;
                char replaceVal = ALPHABET.charAt(keyVal);
                cipherText += replaceVal;
            }

        }

        return cipherText;
    }

    public static void main(String[] args) {
        String texto = "LKQÑF GTÑZU";
        for (int i = 0; i < 26; i++) {
            System.out.println(encrypt(texto, 27-i)+" | "+i);
        }
    }

}
