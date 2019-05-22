package com.Sorting;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrX;
        System.out.println("input array size :");
        arrX = in.nextInt();

int[] arr;
arr = new int[arrX];
int tmp;

// inputing array integers
        for (int i = 0; i < arrX; i++) {
            arr[i] = in.nextInt();
        }

// sorting array

boolean sort = false;
        while(!sort) {
            sort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {

                    tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;

                    sort=false;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }

    }

}