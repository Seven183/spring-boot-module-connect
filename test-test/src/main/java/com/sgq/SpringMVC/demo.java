package com.sgq.SpringMVC;

/**
 * @author siguiqiang
 * @create 2019-1-23
 */
public class demo {
    public int id;
    public String name;

    public demo(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
