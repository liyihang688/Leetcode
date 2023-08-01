package LeetCode1;

import java.util.HashMap;
import java.util.Map;

class Solution_Hash_Map1 {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }
        int a=0;
        for (Map.Entry<Integer, Integer> hs : map.entrySet()) {
            if (hs.getValue() == 0) {
                a=hs.getKey();
            }

        }

        return a;
    }
}

public class Hash_Map1 {
}
