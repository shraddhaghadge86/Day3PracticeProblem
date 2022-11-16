package com.Bridgelabz;
//Program to find the frequency of each element in the array

import java.util.Scanner;

public class ArrayFrequency {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int num = s1.nextInt();
        int[] arr1 = new int[num];
        int [] fr = new int [arr1.length];
        int visited = -1;
        System.out.println("Enter array elements: ");
        for (int i = 0; i < num; i++) {
            arr1[i] = s1.nextInt();
        }

        System.out.println("Frequency of elements is: ");

        for (int i = 0; i < num; i++) {
            int c = 1;
            for (int j = i+1; j <num; j++) {

                if (arr1[i] == arr1[j]) {
                    c = c + 1;
                    fr[j] = visited;
                }
            }

            if(fr[i] != visited){
                fr[i] = c;
                System.out.println(arr1[i] + "   " + fr[i]);

        }

        }
    }
}
