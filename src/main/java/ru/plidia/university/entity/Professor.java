package ru.plidia.university.entity;

public class Professor implements Comeable, Teachable {

    private String name;
    private String surname;
    private University university;
    private Student student;

    public Professor(String name, String surname, University university) {
        this.name = name;
        this.surname = surname;
        this.university = university;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public University getUniversity() {
        return university;
    }

    @Override
    public String come() {
        introduce();
        return "К 8:00 утра ";
    }

    @Override
    public String teach() {
        return "В университете я читаю лекции по нескольким предметам:";
    }

    private void introduce() {
        System.out.println("Здравствуйте. Меня зовут " + surname + " " + name + ". Я работаю в " + university.getUniversityName() + ".");
        System.out.println(student.getName() + " из группы " + student.getGroup() + " - мой лучший студент");
    }
}
