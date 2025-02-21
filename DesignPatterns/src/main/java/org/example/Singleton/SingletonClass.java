package org.example.Singleton;

public class SingletonClass {
    private static SingletonClass instance;
    //1.  Eager initialisation - only use if you know for sure that the object will be used, otherwise it is a waste
    // private static SingletonClass instance = new SingletonClass();

    //2. Static block - only use if you know for sure that the object will be used, otherwise it is a waste
    //    static{
    //        instance = new SingletonClass();
    //    }
    private SingletonClass() {

    }

    //    Thread safe 1 synchronized block
    public static SingletonClass getInstance() {
        //Lazy initialisation
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }

//    Thread safe 2 synchronized keyword
//    public static synchronized SingletonClass getInstance() {
//        //Lazy initialisation
//
//        if (instance == null) {
//            instance = new SingletonClass();
//        }
//        return instance;
//    }
}
