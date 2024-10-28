package ru.plidia.university.entity;


public class University {

    private String universityName;
    private Professor professor;
    private Student student;

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void beginning() {
        System.out.println("Здравствуйте, давайте немного узнаем о нашем прекрасном университете " + getUniversityName() + "!");
        System.out.println("Сначала о себе немного расскажет наш студент - " + student.getName() + ", а далее наш профессор - " + professor.getSurname() + " " + professor.getName() + ":");
    }
}
