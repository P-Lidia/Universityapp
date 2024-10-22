package ru.plidia.university.util;

import ru.plidia.university.entity.Learnable;
import ru.plidia.university.entity.Teachable;

public class ProfessorWork {
    public static void teachMechanics(Teachable teachable) {
        String physics = teachable.teach();
        System.out.println("в понедельник и четверг я преподаю механику и робототехнику;");
    }

    public static void teachPhysics(Teachable teachable) {
        String physics = teachable.teach();
        System.out.println("в среду и пятницу я преподаю физику.");
    }
}