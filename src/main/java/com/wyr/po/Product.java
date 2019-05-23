package com.wyr.po;

import org.springframework.stereotype.Component;

@Component("p")
public class Product {
    private int id;
    private String name="小锐";

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int num;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
