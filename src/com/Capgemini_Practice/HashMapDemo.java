package com.Capgemini_Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("Apple", 20);
        hmap.put("Banana", 30);
        hmap.put("Carrot",35);
        hmap.put("Dragon Fruit", 100);
        hmap.put("Egg Plant", 70);
        hmap.put("Fennel", 150);
        hmap.put("Garlic", 5);
        hmap.put("Haricot Beans", 25);
        System.out.println(getValueByKey(hmap, 30));

    }
    static  <K,V> K getValueByKey(Map<K,V> map, V value){
        for (Map.Entry<K,V> entry : map.entrySet()){
            if(Objects.equals(entry.getValue(), value)){
                return entry.getKey();
            }
        }
        return null;

    }
}
