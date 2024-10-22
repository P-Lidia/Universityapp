package ru.plidia.university._main;

import ru.plidia.university.entity.Professor;
import ru.plidia.university.entity.Student;
import ru.plidia.university.entity.University;
import ru.plidia.university.util.ProfessorWork;
import ru.plidia.university.util.StudentStudy;
import ru.plidia.university.util.UniversityAction;

public class _Main {
    public static void main(String[] args) {
        University university = new University();
        Professor professor = new Professor("Василий Петрович", "Васильцов", university);
        Student student = new Student("Алексей", 304, "технологии машиностроения", professor, university);
        university.setUniversityName("МГТУ им. Н.Э. Баумана");
        university.setProfessor(professor);
        university.setStudent(student);
        professor.setStudent(student);
        UniversityAction action = new UniversityAction();
        university.beginning();
        action.comeToUniversity(student);
        action.learnInUniversity(student);
        StudentStudy.learnMath(student);
        StudentStudy.learnPhysics(student);
        System.out.println("---------------------------------------------");
        action.comeToUniversity(professor);
        action.teachInUniversity(professor);
        ProfessorWork.teachMechanics(professor);
        ProfessorWork.teachPhysics(professor);
    }
}
