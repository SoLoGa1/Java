///// http://codeforces.com/problemset/problem/977/A  /////


package com.Substraction;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

int n;
int x;


System.out.println("input positive integer ");
n = in.nextInt();
int tmp =n;
int tmp2=0;
System.out.println("how many times do you want to decrease this number by one");
x = in.nextInt();


for (int i=0;i<x;i++) {
    if (n % 10 != 0) {  // n ის შემოწმება არის თუ არა დამგვალებული ათეულებამდე
        n = n - 1;

    } else {
        n = n / 10;
        tmp2++;
    }
}
        System.out.println(" substraction of "+ tmp + " by "+ x+" times  is "+n);
        System.out.println( tmp + " was divided by 10 "+ tmp2+" times");
    }
}
