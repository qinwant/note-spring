package com.kingwan.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by kingwan on 2020/11/10.
 * 说明：
 */
@Setter
@Getter
public class Student {
    private String name;
    private String sex;
    private Integer age;

    public Student(){
        System.out.println("create a  student instance.");
    }
    public Student(String name){
        this.name = name;
        System.out.println("create a  student instance named "+name);
    }


}
