package org.lesson1.tester;

public class TesterDemo {
    public static void main(String[] args) throws Exception {
        TestRunner runner = new TestRunner();
        runner.run(MyTest.class);
    }
}
