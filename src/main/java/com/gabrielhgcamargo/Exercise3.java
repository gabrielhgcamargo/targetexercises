package com.gabrielhgcamargo;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Exercise3 {


    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        Scanner scanner = new Scanner(System.in);
        Double lowerBilling = 0d;
        Double higherBilling = 0d;
        Double sum = 0d;
        Integer daysAboveAverage = 0;
        Integer higherBillingDay = 0;
        int count = 1;
        

        try {
            JSONArray data = (JSONArray) parser.parse( new InputStreamReader(new FileInputStream("dados.json"), "UTF-8"));
            for (Object x : data){
                JSONObject daily= (JSONObject) x;

                Integer day = Integer.parseInt(daily.get("dia").toString());
                Double value = Double.parseDouble(daily.get("valor").toString());

                if(count == 1){
                    lowerBilling = value;
                    higherBilling = value;
                }
                
                if(lowerBilling > value) {
                    lowerBilling = value;
                }

                if(higherBilling < value){
                    higherBilling = value;
                    higherBillingDay = day;
                }

                sum+= value;
                count++;
                }

                Double average = sum/count;
                
                for (Object x : data){
                    JSONObject daily= (JSONObject) x;
                    Double value = Double.parseDouble(daily.get("valor").toString());

                    if(value > average){
                        daysAboveAverage++;
                    }
                }   


                while(true){
                    System.out.print("\n=== MENU DE OPÇÕES ===\n\n1- O menor valor de faturamento ocorrido em um dia do mês\n2- O maior valor de faturamento ocorrido em um dia do mês\n3- Número de dias no mês em que o valor de faturamento diário foi superior à média mensal\n4- Sair\n\nOpção = ");
                    int option = scanner.nextInt();

                    switch(option){
                        case 1:
                            System.out.println("\nO menor valor de faturamento ocorrido em um dia do mês foi de R$" + lowerBilling + "\n");
                        break;

                        case 2:
                            System.out.println("\nO maior valor de faturamento ocorrido em um dia do mês, foi no dia  " + higherBillingDay + " com o valor de R$" + higherBilling + "\n");
                        break;

                        case 3:
                        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal = " + daysAboveAverage + ", que foi de R$" + average);
                        break;

                        case 4: 
                            System.exit(0);
                        break;
                    }
                }
                            
 
            
        } catch (Exception e) {
                e.printStackTrace();
        } 
        
    }
  

}
