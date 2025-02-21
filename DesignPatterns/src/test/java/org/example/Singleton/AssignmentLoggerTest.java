package org.example.Singleton;

import org.junit.Test;

public class AssignmentLoggerTest {
    @Test
    public void test() {
        AssignmentLogger assignmentLogger = AssignmentLogger.getInstance();
        assignmentLogger.log("hello");

        AssignmentLogger assignmentLogger2 = AssignmentLogger.getInstance();
        assignmentLogger2.log("hello22");

        assignmentLogger2.log(String.valueOf(assignmentLogger2==assignmentLogger));
    }
}
