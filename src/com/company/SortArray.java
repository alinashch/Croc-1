package com.company;

import java.util.Scanner;

public class SortArray {
    public static int [] SortArray(int arr[]){
        int [] result=new int[arr.length];
        for (int out = arr.length - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(arr[in] > arr[in + 1])
                    ChangeElement(arr, in, in + 1);
            }
        }
        return result;
    }
    public static void ChangeElement(int[] arr, int a, int b){
        int tmp=arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        System.out.println("Введите размер массива ");
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        System.out.println("Введите массив ");
        int []arr=new int[x];
        for(int i=0; i<x; i++){
            arr[i]= scanner.nextInt();
        }
        SortArray(arr);
        for(int i=0; i<x; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
