package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class bai2_3_DemkitutrongTu {
    public static void main(String[] args) {
        String A = "Chaotrangnhe";// What
        char[]arr= A.toCharArray();
        // character ko can asList
        ArrayList<Character>trang = new ArrayList<>();
        for (char c : arr) {
            trang.add(c);
        }
        HashMap<Character,Integer>countMap = new HashMap<>();
        for (char x :trang){
            if (countMap.containsKey(x)){
                countMap.put(x,countMap.get(x)+1);
            }
            else {
                countMap.put(x,1);
            }

        }
        for (char key:countMap.keySet()){
            System.out.println(key+": "+countMap.get(key));
        }

    }
}
