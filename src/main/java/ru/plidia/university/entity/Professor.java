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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setStudent(Student student) {
        this.student = student;
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
