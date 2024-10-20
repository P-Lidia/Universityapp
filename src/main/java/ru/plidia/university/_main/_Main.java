package ru.plidia.university._main;

import ru.plidia.university.entity.Professor;
import ru.plidia.university.entity.Student;
import ru.plidia.university.entity.University;
import ru.plidia.university.util.*;

public class _Main {
    public static void main(String[] args) {
        University university = new University("МГТУ им. Н.Э. Баумана");
        Professor professor = new Professor("Василий Петрович", "Васильцов", university);
        Student student = new Student("Алексей", 304, "технологии машиностроения", professor, university);
        Come come = new Come();
        Learn learn = new Learn();
        Teach teach = new Teach();
        come.comeToUniversity(student);
        learn.learnInUniversity(student);
        StudentStudy.learnMath(student);
        StudentStudy.learnPhysics(student);
        System.out.println("---------------------------------------------");
        come.comeToUniversity(professor);
        teach.teachInUniversity(professor);
        ProfessorWork.teachMechanics(professor);
        ProfessorWork.teachPhysics(professor);
    }
}
