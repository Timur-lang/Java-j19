package bybellhard.j19.lessons.lesson8.checkedExceptions;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Entity {

    public Entity getNewinstanse() throws
            ClassNotFoundException,
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {
        Class<?> aClass =
                Class.forName("bybellhard.j19.lessons.lesson8.checkedExceptions.Entity");
        Constructor<?> constructor = aClass.getConstructor();

        return (Entity) constructor.newInstance();
    }


    public int getTemp() {
        return (int) (Math.random() * 25);

    }
}
