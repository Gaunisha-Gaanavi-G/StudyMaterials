package org.example.Singleton;

import java.io.Serializable;

public class SingletonSerializable implements Serializable {
    private static SingletonSerializable instance;

    private SingletonSerializable() {

    }

    public static SingletonSerializable getInstance() {

        if (instance == null) {
            instance = new SingletonSerializable();
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
