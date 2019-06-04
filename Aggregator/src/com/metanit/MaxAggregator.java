package com.metanit;

public class MaxAggregator <T1 extends Comparable<T1>> implements Aggregator<T1, T1>{
    public T1 aggregate(T1[] in){
        T1 maxObj = in[0]; //!Изначально самый большой объект - это самый первый объект
        for(int i = 1; i < in.length; i++){ //!Ищем самый большой объект
            if(in[i].compareTo(maxObj) == 1){
                maxObj = in[i];
            }
        }
        return maxObj;
    }
}
