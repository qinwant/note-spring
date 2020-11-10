package com.kingwan.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by kingwan on 2020/11/10.
 * 说明：
 */
@Setter
@Getter
public class Teacher {
    private String name;
    private String sex;
    private Integer age;
    private String address;

    public Teacher(){
        System.out.println("create a  Teacher instance.");
    }
    public Teacher(String name){
        this.name = name;
        System.out.println("create a  Teacher instance named "+name);
    }

}
