package week02.collection;

import java.util.Map;
import java.util.HashMap;

public class Col6 {
    public static void main(String[] args) {
        //map : key - value pair 중요
        //key라는 값으로 unique하게 보장이 돼야함
        //map -> HashMap   , TreeMap 으로 응용해서 사용 할 수 있음

        Map<String, Integer> intMap = new HashMap<>();

        //키값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("십", 13);
        intMap.put("십", 14);
        intMap.put("십", 15);
        intMap.put("삼", 16);

        // key 값 전체 출력
        for(String key : intMap.keySet()){
            System.out.println(key);
        }
//value 값 전체 출력
        for(Integer value : intMap.values()){
            System.out.println(value);
        }

        System.out.println(intMap.get("삼"));
    }
}
