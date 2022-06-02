package com.bootdo.testDemo;


/**
 * @author liyinlong
 * @since 2022/5/17 9:10 上午
 */

public class HcUser {

    private String username;

    private Integer age;


    public HcUser( Integer age,String username) {
        this.username = username;
        this.age = age;
    }

    public HcUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
