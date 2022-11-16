package com.Bridgelabz;
// Program to print the elements of an array present on odd position

import java.util.Scanner;

public class OddPosition {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int num = s1.nextInt();
        int[] arr1 = new int[num];

        System.out.println("Enter elements of an array: ");
        for (int i = 0; i < num; i++) {
            arr1[i] = s1.nextInt();
        }

        System.out.println("Odd postion elements in an array is: ");
        for(int i= 1; i<num; i=i+2){
            System.out.println(arr1[i]);
        }
    }
}
