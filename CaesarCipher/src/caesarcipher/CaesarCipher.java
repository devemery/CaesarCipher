/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcipher;

import java.util.Random;

/**
 *
 * @author emery
 */
public class CaesarCipher {
    //create instance of Random class
    static Random rand = new Random();
    //Generate random number for Caesar Shift    
    public static int charShift = rand.nextInt(1000);
        
    public static void main(String[] args) {
        System.out.println(charShift);
        
        String message = "Important information";
        
        System.out.println(message);
        
        String encryptedMessage = encrypt(message);
        
        System.out.println(encryptedMessage);
        
        String decryptedMessage = decrypt(encryptedMessage);
        
        System.out.println(decryptedMessage);
    }
    //Encryption method
    static String encrypt(String msg) {
        String encrypted = "";
        for (int i = 0; i < msg.length(); ++i) {
            encrypted += (char)(msg.charAt(i) + charShift);
        }
        return encrypted;
    }
    //Decryption method
    static String decrypt(String msg) {
        String decrypted = "";
        for (int i = 0; i < msg.length(); ++i) {
            decrypted += (char)(msg.charAt(i) - charShift);
        }
        return decrypted;
    }
    
}
