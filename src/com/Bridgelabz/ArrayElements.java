package com.Bridgelabz;
//`Program to print the elements of an array....

public class ArrayElements {
    public static void main(String[] args){
        int[] arr1 = new int[4];
        arr1[0] = 21;
        arr1[1] = 22;
        arr1[2] = 23;
        arr1[3] = 24;

        for(int i = 0; i<arr1.length; i++){
          System.out.println(arr1[i]);

            //we can user alternate method to pring an array element
            //for(int x: arr1){
              //  System.out.println(x);

            }

        }

}
