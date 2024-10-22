package ru.plidia.university.entity;

public class University {

    private String universityName;
    private Professor professor;
    private Student student;

    public University(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Student getStudent() {
        return student;
    }
}
