package com.Bridgelabz;
//Program to sort the elements of an array in ascending order

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int num = s1.nextInt();
        int[] arr1 = new int[num];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < num; i++) {
            arr1[i] = s1.nextInt();
        }

        System.out.println("Ascending order is: ");

        for (int i = 0; i < num; i++) {
            for (int j = i+1 ; j <num; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
            System.out.println(arr1[i]);
        }

    }
}
