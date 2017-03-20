package com.shengsiyuan.jdk8;

/**
 * Created by sundalei on 17-2-20.
 */
public class Person {

    public String username;

    public int age;

    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
