package com.itheima.pojo;

/**
 * @author shkstart
 * @create 2021-06-04 20:11
 */
public class User {
    String name;
    String city;
    String like;

    public User(String name, String city, String like) {
        this.name = name;
        this.city = city;
        this.like = like;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", like='" + like + '\'' +
                '}';
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
