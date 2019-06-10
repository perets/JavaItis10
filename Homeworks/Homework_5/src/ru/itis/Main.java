package ru.itis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int a[] = new int[size];
        int localMaxCount = 0;
        int localMinCount = 0;
        for (int j = 0; j < size; j++) {
            a[j] = scanner.nextInt();           
        }

        for (int i = 1; i < size -1; i++) {
            if ((a[i] > a[i+1])||(a[i] > a[i-1])){
                localMaxCount++;
            }
            if ((a[i] < a[i+1])||(a[i] < a[i-1])){
                localMinCount++;
            }
        }
        System.out.println("Local MAX COUNT " + localMaxCount);
        System.out.println("Local MIN COUNT " + localMinCount);
    }
}
