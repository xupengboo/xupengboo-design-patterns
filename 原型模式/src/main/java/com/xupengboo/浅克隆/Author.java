package com.xupengboo.浅克隆;

/**
 * @author: xupengboo
 * @date: 2024/1/25 15:36
 * @description: 作者类
 */
public class Author implements Cloneable{

    private String name;

    private String country;

    public Author(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}


