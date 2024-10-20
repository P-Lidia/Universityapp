package ru.plidia.university.entity;

public class Student implements Comeable, Learnable {

    private String name;
    private int group;
    private String faculty;
    private Professor professor;
    private University university;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return this.group;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculry() {
        return this.faculty;
    }

    @Override
    public String come() {
        return "К 8:30 утра ";
    }

    @Override
    public String learn() {
        return "В университете я изучаю разные предметы:";
    }
}
