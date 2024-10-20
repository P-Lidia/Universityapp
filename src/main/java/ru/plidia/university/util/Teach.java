package ru.plidia.university.util;

import ru.plidia.university.entity.Teachable;

public class Teach {
    public void teachInUniversity(Teachable teachable) {
        String str = teachable.teach();
        System.out.println(str);
    }
}