package org.example.Singleton;

public class SingletonReflectionProblem {
    private static SingletonReflectionProblem instance;

    private SingletonReflectionProblem() {

    }

    public static SingletonReflectionProblem getInstance() {

        if (instance == null) {
            instance = new SingletonReflectionProblem();
        }
        return instance;
    }
}
