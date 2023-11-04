package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();

        for(Map.Entry<String,Integer> m : sourceMap.entrySet()){

            int valueString = m.getKey().length();
            map.computeIfAbsent(valueString, k -> new HashSet<>()).add(m.getKey());

        }

        return map;
    }
}
