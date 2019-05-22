package com.minimum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] arr = {15,10,7,19,21};
        int min = arr[0];

        for (int i=0;i<arr.length-1;i++)
        {
            if(min>arr[i+1])
            {
                min = arr[i+1];
            }

        }
        System.out.println(min);
    }
}
