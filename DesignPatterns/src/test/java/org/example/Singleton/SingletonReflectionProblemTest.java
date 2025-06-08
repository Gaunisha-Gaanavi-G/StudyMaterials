package org.example.Singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflectionProblemTest {

    @Test
    public void test() throws NoSuchMethodException {
        SingletonReflectionProblem instance1 = SingletonReflectionProblem.getInstance();
        SingletonReflectionProblem instance2 = null;

        Constructor<SingletonReflectionProblem> constructor1 = SingletonReflectionProblem.class.getDeclaredConstructor();
        constructor1.setAccessible(true);
        try {
            instance2=constructor1.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    @Test
    public void singletonEnumTest() {
        SingletonReflectionProblem instance1 = SingletonReflectionProblem.getInstance();
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum.getName());
        singletonEnum.setName("gauni");
        System.out.println(singletonEnum.getName());
    }
}
