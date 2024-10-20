package ru.plidia.university.entity;

public class Professor implements Comeable, Teachable {

    private String name;
    private String surname;
    private Student student;
    private University university;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String come() {
        return "К 8:00 утра ";
    }

    @Override
    public String teach() {
        return "В университете я преподаю:";
    }


}
