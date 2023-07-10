package com.atguigu;

/**
 * @author zjr
 * @create 2023-07-10
 */
public class Student {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student() {

    }

    public Student(String name, Integer age) {

        this.name = name;
        this.age = age;
    }
}
