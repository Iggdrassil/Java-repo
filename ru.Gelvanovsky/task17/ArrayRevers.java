package ru.Gelvanovsky.task17;

public class ArrayRevers {
    static int array[] = new int[5];
    static int countOfElements;
    public static void showArray(){
        for (int i = 0; i<countOfElements;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void reverseArray(int []array){
        for (int i = 0; array.length/2 > i; i++) {
            int x = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = x;
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
        reverseArray(array);
        System.out.println("\n=========");
        showArray();
    }
}
