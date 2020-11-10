package com.kingwan.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by kingwan on 2020/11/10.
 * 说明：
 */
@Setter
@Getter
public class ClassRoom {
    private String name;
    private Integer population;
    private Teacher teacher;
    private List<Student> students;

    public ClassRoom(){

    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
