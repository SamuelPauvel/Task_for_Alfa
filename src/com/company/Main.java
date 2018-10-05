package com.company;



public class Main {

    public static void main(String[] args) {

        int array[] = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10);
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");
        System.out.println("After sort");

        arraySort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");
        int x = 4;

        System.out.println("If x = " + x + " then index is " + bsearch(array, x));
    }

    private static void arraySort(int array[]){

        for (int i = 0; i < array.length; i++){
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] > min){
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i){
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }

    private static int bsearch(int array[], int x){

        for (int i = 0; i < array.length; i++){

            if (array[i] < x) {
                return i;
            }
        }
        return 0;
    }
}

