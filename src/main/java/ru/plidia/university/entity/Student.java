package ru.plidia.university.entity;

public class Student implements Comeable, Learnable {

    private String name;
    private int group;
    private String faculty;
    private Professor professor;
    private University university;

    public Student(String name, int group,
                   String faculty,
                   Professor professor,
                   University university) {
        this.name = name;
        this.group = group;
        this.faculty = faculty;
        this.professor = professor;
        this.university = university;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public void setFaculty(String Faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
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
        return "К 8:30 утра ";
    }

    @Override
    public String learn() {
        return "В университете я изучаю разные предметы:";
    }

    private void introduce() {
        System.out.println("Привет! Меня зовут " + name + ". Я учусь в " + university.getUniversityName() + ", в группе №" + group + ", факультет - " + faculty + ".");
        System.out.println("Мой любимый профессор - " + professor.getSurname() + " " + professor.getName());
    }
}
