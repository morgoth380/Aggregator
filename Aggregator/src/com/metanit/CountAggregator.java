package com.metanit;

public class CountAggregator <T1> implements Aggregator <T1, Integer>{
    public Integer aggregate(T1[] in){
        Integer length = new Integer(in.length);
        return length;
    }
}
