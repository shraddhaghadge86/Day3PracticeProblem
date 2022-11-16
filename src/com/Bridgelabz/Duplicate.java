package com.Bridgelabz;
// Program to print the duplicate elements of an array

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int num = s1.nextInt();
        int[] arr1 = new int[num];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < num; i++) {
            arr1[i] = s1.nextInt();
        }


        System.out.println("duplicate elements of an array is: ");

        for (int i = 0; i < num; i++) {
            for (int j =i + 1; j < num; j++) {
                if (arr1[i] == arr1[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
