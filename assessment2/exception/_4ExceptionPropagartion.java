package javabasics.assessment2.exception;

public class _4ExceptionPropagartion {
    static void show() {
        display();
    }

    static void display() {
        System.out.print(10 / 0);
    }

    public static void main(String[] args) {
        //show();
        try {
            show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
java.lang.ArithmeticException: / by zero
	at javabasics.assessment2._4ExceptionPropagartion.display(_4ExceptionPropagartion.java:8)
	at javabasics.assessment2._4ExceptionPropagartion.show(_4ExceptionPropagartion.java:5)
	at javabasics.assessment2._4ExceptionPropagartion.main(_4ExceptionPropagartion.java:13)

        it says the path of Exception occurrence to Handled
        JVM calls -->main()-->show()-->display()
        in display method ArithmeticException but it not handled their so it throws to its called methods
        then show search for relevant catch method or handling of Exception no handled their
        so it throws to main in main the Exception is handled

        this is called ExceptionPropagation

if main method not Handled the Exception the JVM will
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at javabasics.assessment2._4ExceptionPropagartion.display(_4ExceptionPropagartion.java:8)
	at javabasics.assessment2._4ExceptionPropagartion.show(_4ExceptionPropagartion.java:5)
	at javabasics.assessment2._4ExceptionPropagartion.main(_4ExceptionPropagartion.java:12)
 */