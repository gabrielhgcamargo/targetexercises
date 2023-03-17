package com.gabrielhgcamargo;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        String stringInversa = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite a String: ");
        String string = scanner.nextLine();
    

        for(int i = string.length() -1;i>=0;i--){
            stringInversa = stringInversa + string.charAt(i);
        }
        System.out.println("String inversa = " + stringInversa);
    }
    
}
