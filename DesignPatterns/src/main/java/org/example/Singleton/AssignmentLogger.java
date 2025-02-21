package org.example.Singleton;

public class AssignmentLogger {
    private static AssignmentLogger instance = null;

    private AssignmentLogger() {}

    public static synchronized AssignmentLogger getInstance() {
        if(instance==null)  {
            instance=new AssignmentLogger();
            return instance;
        };
        return instance;
    }

    public void log(String msg) {
        System.out.println(msg);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
