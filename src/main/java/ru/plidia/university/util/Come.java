package ru.plidia.university.util;

import ru.plidia.university.entity.Comeable;

public class Come {
    public void comeToUniversity(Comeable comeable) {
        String str = comeable.come();
        System.out.println(str + "я прихожу в университет.");
    }
}