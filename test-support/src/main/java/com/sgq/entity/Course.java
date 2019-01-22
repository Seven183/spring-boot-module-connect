package com.sgq.entity;

/**
 * @author siguiqiang
 * @create 2019-1-22
 */
public class Course {

    public int id;
    public String course;
    public int gread;

    public Course(int id, String course, int gread) {
        this.id = id;
        this.course = course;
        this.gread = gread;
    }

    public Course(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getGread() {
        return gread;
    }

    public void setGread(int gread) {
        this.gread = gread;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course='" + course + '\'' +
                ", gread=" + gread +
                '}';
    }
}
