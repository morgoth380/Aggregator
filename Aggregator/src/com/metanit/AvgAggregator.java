package com.metanit;

public class AvgAggregator implements Aggregator <Integer, Float> {
    public Float aggregate(Integer[] in){
        int temp = 0;
        for(int i = 0; i < in.length; i++){
            temp += in[i].intValue();
        }
        return(new Float(temp/in.length));
    }
}
