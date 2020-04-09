package com.company.Day6;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        LinkedHashMap<String,List<String>> listHashMap = new LinkedHashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String string = strs[i];
            char[] arr = string.toCharArray();
            Arrays.sort(arr);
            String newString = new String(arr);
            if (!listHashMap.containsKey(newString)) {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(string);
                listHashMap.put(newString,temp);
            }
            else {
                listHashMap.get(newString).add(string);
            }
        }
        List<List<String>> list = new ArrayList<>();
        for (String key :
                listHashMap.keySet()) {
            list.add(listHashMap.get(key));
        }
        return list;
    }
}
