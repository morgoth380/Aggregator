package com.metanit;

public interface Aggregator <T1, T2> {
    public T2 aggregate(T1[] in);
}
