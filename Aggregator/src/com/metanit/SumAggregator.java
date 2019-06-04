package com.metanit;

public class SumAggregator implements Aggregator <Integer, Integer>{
    public Integer aggregate(Integer[] in){
        Integer summ = new Integer(0);
        int temp = 0;
        for(int i = 0; i < in.length; i++){
           temp += in[i].intValue();
        }
        return(new Integer(temp));
    }
}
