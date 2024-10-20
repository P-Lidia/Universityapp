package ru.plidia.university.entity;

public class Professor implements Comeable, Teachable {

    private String name;
    private String surname;
    private University university;

    public Professor(String name, String surname, University university) {
        this.name = name;
        this.surname = surname;
        this.university = university;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public University getUniversity() {
        return this.university;
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
    }
}
