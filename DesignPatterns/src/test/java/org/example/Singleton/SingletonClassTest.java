package org.example.Singleton;

import org.junit.Test;

public class SingletonClassTest {
    @Test
    public void test() {
        SingletonClass instance1 = SingletonClass.getInstance();
        SingletonClass instance2 = SingletonClass.getInstance();
        System.out.println(instance1 == instance2);
    }
}
