package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if (sentence.isEmpty()){
            return new HashMap<>();
        }
        Map<String, Integer> map = new HashMap<>();
        sentence = sentence.toLowerCase();
        String[] strings = sentence.split(" ");
        for (String s: strings){
            if (s.contains(".") || s.contains(",")){
                s = s.substring(0, s.length() -1);
            }
            if (map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            }else {
                map.put(s, 1);
            }
        }
        return map;
    }
}
