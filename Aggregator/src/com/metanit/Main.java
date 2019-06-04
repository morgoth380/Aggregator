package com.metanit;

public class Main {

    public static void main(String[] args) {
	//*********** CountAggregator example*****************//
        CountAggregator in = new CountAggregator<String>();
        String[]arg = {"String1", "String1", "String1"};
        int cnt = in.aggregate(arg);
        System.out.println(cnt);

        //*********** SumAggregator  example*****************//
        SumAggregator in2 = new SumAggregator();
        Integer[] args2 = {new Integer(1), new Integer(2), new Integer(3)};
        System.out.println(in2.aggregate(args2));

        //*********** SumAggregator  example*****************//
        AvgAggregator in3 = new AvgAggregator();
        System.out.println(in3.aggregate(args2));

        //*********** SumAggregator  example*****************//
        Student student1 = new Student("Alex", 30, (float)1.5); //средний бал 1.5
        Student student2 = new Student("Serg", 40, (float)3.0); //средний бал 3.0
        int result = student1.compareTo(student2); //сравниваем первого студента со вторым по среднему балу
        System.out.println(result); //должно вернуть -1, так как у второго студента выше средний бал

    }
}
