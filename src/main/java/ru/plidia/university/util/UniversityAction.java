package ru.plidia.university.util;

import ru.plidia.university.entity.Comeable;
import ru.plidia.university.entity.Learnable;
import ru.plidia.university.entity.Teachable;

public class UniversityAction {
    public void comeToUniversity(Comeable comeable) {
        String str = comeable.come();
        System.out.println(str + "я прихожу в университет.");
    }

    public void learnInUniversity(Learnable learnable) {
        String str = learnable.learn();
        System.out.println(str);
    }

    public void teachInUniversity(Teachable teachable) {
        String str = teachable.teach();
        System.out.println(str);
    }
}