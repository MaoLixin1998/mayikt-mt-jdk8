package com.mayikt.entity;

/**
 * @ClassName UserEntity
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 9:38
 **/
public class UserEntity {

    private String username;
    private int age;

    public UserEntity(String username, int age) {
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


    @Override
    public String toString() {
        return "UserEntity{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
