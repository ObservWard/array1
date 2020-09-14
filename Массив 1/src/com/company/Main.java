package com.company;

import java.util.Arrays;
public class Main {
    public static void main(String[] args)
    {
        int[] array = {5, 13, 21, 37, 43, 55, 62, 78, 84, 93};
        int temp = array[0];
        array[0] = array[9];
        array[9] = temp;
        System.out.println(Arrays.toString(array));
    }
}