package com.metanit;

public class Student implements Comparable<Student> {
    String name;
    int age;
    float averRatin; //средний бал
    public Student(String name, int age, float averRatin){
        this.name = name;
        this.age = age;
        this.averRatin = averRatin;
    }
    public int compareTo(Student otherStudent){
        if (this.averRatin == otherStudent.averRatin){
            return 0;
        }
        if(this.averRatin <  otherStudent.averRatin){
            return -1;
        }
        return (1);
    }


}
