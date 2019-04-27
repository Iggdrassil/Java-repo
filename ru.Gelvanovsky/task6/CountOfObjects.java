package ru.Gelvanovsky.task6;

public class CountOfObjects {
    public static int counter = 0;
    public void Counter(){
        counter++;
    }
    public static void main(String[] args) {
       CountOfObjects firstObject = new CountOfObjects();
       firstObject.Counter();
       CountOfObjects secondObject = new CountOfObjects();
       secondObject.Counter();
       CountOfObjects thirdObject = new CountOfObjects();
       thirdObject.Counter();
        System.out.println("Количество объектов в классе = "+counter);
    }
}
