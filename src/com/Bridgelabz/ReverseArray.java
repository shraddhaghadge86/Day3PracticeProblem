package com.Bridgelabz;
//Program to print the elements of an array in reverse order

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args){
        Scanner s1 =new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int num = s1.nextInt();
        int[] arr1 = new int[num];

        System.out.println("Enter elements of an array: ");
        for(int i = 0; i < num; i++){
            arr1[i] = s1.nextInt();
        }
        System.out.println("The reverse of an array is: ");
        for(int i = num-1; i>=0; i--){
            System.out.println(arr1[i]);
        }
    }
}
