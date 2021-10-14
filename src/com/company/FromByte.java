package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class FromByte {
    public static void FromByte(double i){
        System.out.print(i+ " Б = ");
        int k=0;
        double t=i;
        while(t >=1024){
            k++;
            t=t/ 1024;
        }
        if(k==0){
            System.out.println(i +" Б ");
        }else if(k==1){
            System.out.println(String.format("%.1f",i/Math.pow(1024,1)) +"KБ " );
        }else if(k==2){
            System.out.println(String.format("%.1f",i/Math.pow(1024,2)) +"MБ " );
        }else if(k==3){
            System.out.println(String.format("%.1f",i/Math.pow(1024,3)) +"ГБ " );
        }else if(k==4){
            System.out.println(String.format("%.1f",i/Math.pow(1024,4)) +"TБ " );
        }else if(k==5){
            System.out.println(String.format("%.1f",i/Math.pow(1024,5)) +"ПБ " );
        }else if(k==6){
            System.out.println(String.format("%.1f",i/Math.pow(1024,6)) +"ЭБ " );
        }else if(k==7){
            System.out.println(String.format("%.1f",i/Math.pow(1024,7)) +"ЗБ " );
        }else if(k==8){
            System.out.println(String.format("%.1f",i/Math.pow(1024,8)) +"ЙБ " );
        }
    }

    public static void main(String[] args) {
        FromByte(23);
        FromByte(1024);
        FromByte(53692044905543.);
        FromByte(5428952);
        System.out.println("Print Bytes" );

        Scanner scanner=new Scanner(System.in);
        double x= scanner.nextInt();
        FromByte(x);
    }
}
