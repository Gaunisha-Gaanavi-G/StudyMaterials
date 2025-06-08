package org.example.Singleton;

import org.junit.Test;

import java.io.*;
import java.nio.file.Files;

public class SingletonSerializableTest {
    @Test
    public void test() throws IOException, ClassNotFoundException {
        SingletonSerializable instance1 = SingletonSerializable.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(new File("./src/main/resources/singleton.ser").toPath()));
        oos.writeObject(instance1);

        SingletonSerializable instance2 = null;
        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(new File("./src/main/resources/singleton.ser").toPath()));
        instance2 = (SingletonSerializable) ois.readObject(); //new object not the same object.

        System.out.println(instance1 == instance2);//this will return false for Serialization, since new object is created
    }
}
