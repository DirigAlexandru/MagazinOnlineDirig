package utils;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;


public class Metode {

    public void generateRandomStoreName() {
        byte[] array = new byte[7]; // length of generated name, which is actually 8 characters (0 to 7)
        new Random().nextBytes(array);
        String storeName = new String(array, Charset.forName("UTF-8"));
        System.out.println(storeName);
    }

    public void inputStore() {
        Scanner myStore = new Scanner(System.in);
        System.out.println("Enter store name");

        String store = myStore.nextLine();
        System.out.println("The store name is: " + store);
    }

    /*public void generateRandomStoreName(){
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        for(int x=1;x<=10;x++) {
            String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
            System.out.println(generatedString);
        }*/

}
