package ru.plidia.university.util;

import ru.plidia.university.entity.Learnable;

public class Learn {
    public void learnInUniversity(Learnable learnable) {
        String str = learnable.learn();
        System.out.println(str);
    }
}

