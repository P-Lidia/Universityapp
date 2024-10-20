package ru.plidia.university._main;

import ru.plidia.university.entity.Professor;
import ru.plidia.university.entity.Student;
import ru.plidia.university.entity.University;
import ru.plidia.university.util.*;

public class _Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Student student = new Student();
        University university = new University();
        Come come = new Come();
        Learn learn = new Learn();
        Teach teach = new Teach();

        come.comeToUniversity(student);
        learn.learnInUniversity(student);
        StudentStudy.learnMath(student);
        StudentStudy.learnPhysics(student);

        come.comeToUniversity(professor);
        teach.teachInUniversity(professor);
        ProfessorWork.teachMechanics(professor);
        ProfessorWork.teachPhysics(professor);
    }
}
