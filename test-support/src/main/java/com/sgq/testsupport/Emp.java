package com.sgq.testsupport;

/**
 * @author siguiqiang
 * @create 2019-1-17
 */
public class Emp {

    public int    id;
    public String name;
    public int age;

    public Emp(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Emp(){
        super();
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
