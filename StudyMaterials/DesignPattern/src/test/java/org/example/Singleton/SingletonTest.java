package src.test.java.org.example.Singleton;



import org.example.Singleton.Singleton;
import org.junit.jupiter.api.Test;

public class SingletonTest{
    @Test
    public void test(){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
