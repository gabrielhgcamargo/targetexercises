package com.gabrielhgcamargo;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        
        Float sp = 67836.43f;
        Float rj = 36678.66f;
        Float mg = 29229.88f;
        Float es = 27165.48f;
        Float outros = 19849.53f;
        Float total = sp + rj + mg + es + outros;
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("\n----- MENU -----\nPercentual de representação de:\n1- SP\n2- RJ\n3- MG\n4- ES\n5- Outros\n6- Sair\nOpção = ");
            
            switch(scanner.nextInt()){
                case 1:
                    System.out.println("\nSP = " + (sp/total) * 100 + "%");
                break;
                case 2:
                System.out.println("\nRJ = " + (rj/total) * 100 + "%");
                    break;
                case 3:
                System.out.println("\nMG = " + (mg/total) * 100 + "%");
                    break;
                case 4:
                System.out.println("\nES = " + (es/total) * 100 + "%");
                    break;
                case 5:
                System.out.println("\nOutros = " + (outros/total) * 100 + "%");
                    break;
                case 6:
                System.exit(0);
                    break;
            }
            
        }
    }
    
}
