package ru.Gelvanovsky.task17;

public class DisplacementElemetsOfArray {
    static int array[] = new int[5];
    static int countOfElements;
    public static void toLeft(int[] array, int position) {
       int ArraySize = array.length;
       for (int i = 0; i < position; i++) {
           int x = array[0];
           for (int j = 0;j<array.length-1;j++){
               array[j] = array[j+1];
           }
           array[ArraySize-1] = x;
           array[countOfElements-1] = 0;
        }
    }
    public static void showArray(){
        for (int i = 0; i<countOfElements;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        countOfElements = 5;
        showArray();
        toLeft(array,1);
        System.out.println("\n<========");
        showArray();
    }
}
