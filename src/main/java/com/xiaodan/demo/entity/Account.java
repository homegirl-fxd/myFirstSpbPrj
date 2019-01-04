package com.xiaodan.demo.entity;

/**
 * Created by fengxiaodan on 2018/6/20.
 */
public class Account {
    /** 数据库唯一标识 */
    private int id;

    /** 账户名称 */
    private String name;

    /** 金额 */
    private double money;

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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
