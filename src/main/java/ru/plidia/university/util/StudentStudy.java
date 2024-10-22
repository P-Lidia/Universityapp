package ru.plidia.university.util;

import ru.plidia.university.entity.Learnable;

public class StudentStudy {
        public static void learnMath(Learnable learnable) {
        String math = learnable.learn();
        System.out.println("в понедельник и четверг у меня 2 пары математики;");
    }

    public static void learnPhysics(Learnable learnable) {
        String physics = learnable.learn();
        System.out.println("в среду и пятницу я изучаю физику.");
    }
}

