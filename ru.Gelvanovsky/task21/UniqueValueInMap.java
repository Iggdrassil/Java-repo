package ru.Gelvanovsky.task21;

import java.util.*;

public class UniqueValueInMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();//HashMap ИМЯ:ФАМИЛИЯ
        map.put("Иван","Иванов");
        map.put("Петр","Петров");
        map.put("Сидор","Сидоров");
        System.out.println(map);
        System.out.println(isUnique(map));
    }
    public static boolean isUnique(Map<String, String> map) {
        Set keys = map.keySet();
        List<String> data = new ArrayList<>();
        for (Object key:keys) {
            data.add(map.get(key));
        }
        //System.out.println(data);
        HashMap<String, Integer> hm = new HashMap<String, Integer>();//HashMap ФАМИЛИЯ:КОЛ-ВО ПОВТОРЕНИЙ
        Integer counter;//счетчик значений
        for (String x:data) {
            counter = hm.get(x);
            if (counter == null){
                hm.put(x,1);//если counter пустой, тогда добавить его в hm со значением 1 и ключом х
            }
            else{
                hm.put(x, counter + 1);//если counter не пустой, добавить его в hm со значением текущее значение+1 и ключом х
            }
        }
        int checked = 0;//счетчик кол-ва повторений
        for (String check:hm.keySet()) {
            checked = hm.get(check);//получаем ключи по значению check
        }
        if (checked>1){
            return false;
        }else {
            return true;
        }
    }
}
