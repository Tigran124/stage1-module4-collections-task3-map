package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        sourceMap.forEach((integer, string) ->
        {
            if (map.containsKey(string)) {
                map.put(string, Math.min(integer, map.get(string)));
            }else {
                map.put(string, integer);
            }
        });
        return map;
    }
}
