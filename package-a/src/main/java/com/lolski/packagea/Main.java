package com.lolski.packagea;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.lolski.packageb.logger.Logger;

public class Main {
    public static void main(String args[]) {
        Multimap<String, String> mmap = ArrayListMultimap.create();
        mmap.put("k1", "v1");
        mmap.put("k1", "v2");
        mmap.put("k1", "v3");
        for (String key: mmap.keySet()) {
            Logger.log("values = " + mmap.get(key));
        }
        Logger.log("Hi!");
    }
}
