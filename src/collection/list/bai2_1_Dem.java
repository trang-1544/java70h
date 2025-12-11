package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class bai2_1_Dem {
    public static void main(String[] args) {
        ArrayList<Integer>trang = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,3,5));
        HashMap <Integer,Integer> count = new HashMap<>();
        for (Integer number:trang){
            if(count.containsKey(number)){
                count.put(number,count.get(number)+1);
            }else {
                count.put(number,1);
            }
        }
        for (Integer key:count.keySet()){
            System.out.println(key+ " :"+count.get(key));
        }
    }
}
