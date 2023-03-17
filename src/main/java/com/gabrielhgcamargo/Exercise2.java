package com.gabrielhgcamargo;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Integer i = 0;
        boolean answer = false;
        ArrayList<Integer> fiboSequence = new ArrayList<Integer>() {
            {
                add(0);
                add(1);
            }
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número, para verificar se este se encontra na sequência de Fibonacci = ");
        int userNumber = scanner.nextInt();

        while(fiboSequence.get(fiboSequence.size() - 1) <= userNumber){

            
            if(fiboSequence.contains(userNumber)){
                answer = true;
            }

            fiboSequence.add(fibonacci(i));
            i++;
        }
        
        scanner.close();

        if(answer){
            System.out.println("O número " + userNumber + " pertence a sequencia de Fibonacci.");
        }else{
            System.out.println("O número " + userNumber + " NÃO pertence a sequencia de Fibonacci.");

        }
    }

    static int fibonacci(int i) {
        if (i < 2) {
            return i;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }
    
}
