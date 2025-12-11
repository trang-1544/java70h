package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class bai2_2_DemTuTrongChuoi {
    public static void main(String[] args) {
        String A = "hello world hello java world";
        String[] arr = A.split(" ");
        ArrayList<String> trang = new ArrayList<String>(Arrays.asList(arr));
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String word : trang) {
            if (countMap.containsKey(word)) {
                 countMap.put(word,countMap.get(word)+1);
            }else {
                countMap.put(word,1);
            }
        }
        for (String key:countMap.keySet()){
            System.out.println(key+": "+countMap.get(key));

        }
    }
}