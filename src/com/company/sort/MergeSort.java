package com.company.sort;

import java.util.Arrays;

import static javafx.scene.input.KeyCode.K;

/**
 * Created by Mayokun on 11/8/2017.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] S = {5, 1, 9, 0, 2, 12, 4, 6, 3, 7};

        for (int a: S) {
            System.out.print(a+" ");
        }

        System.out.println();

        mergeSort(S);

        for (int a: S) {
            System.out.print(a+" ");
        }
    }

    public static void mergeSort(int[] S) {
        int n = S.length;
        if (n < 2) return;

        int mid = n/2;
        int[] S1 = Arrays.copyOfRange(S, 0, mid);
        int[] S2 = Arrays.copyOfRange(S, mid, n);

        mergeSort(S1);
        mergeSort(S2);

        merge(S1);
    }

    public static void merge(int[] S1) {
        int p = 0;
        int r = S1.length;
        int q = r /2;

        int n1 = q;
        int n2 = r - q;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i <= n1; i++) {
            L[i] = S1[p + i];
        }
        for(int j = 0; j < n2; j++) {
            R[j] = S1[q + j];
        }

        int i = 1;
        int j = 1;
        for(int k = p; k <= r; k++) {
            if (L[i] <= R[j])
                S1[k] = L[i];
            else
                S1[k] = R[j];
                j = j + 1;
        }

    }
}
