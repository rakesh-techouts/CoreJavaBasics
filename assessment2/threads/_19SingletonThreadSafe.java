package javabasics.assessment2.threads;

class Ramo {
    int a;
    private static volatile Ramo instance;
    private Ramo(int a) {
        this.a = a;
    }
    public static Ramo getInstance(int a) {
        if(instance==null){
            synchronized (Remo.class){
                instance = new Ramo(a);
            }
        }
        return instance;
    }
}


class Demo {
    private Demo(){

    }
    private static class DemoInstance {
        private static final Demo INSTANCE = new Demo();
    }
    public static Demo getInstance() {
        return DemoInstance.INSTANCE;
    }
    public void display() {
        System.out.println("This is Display method in Demo");
    }
}


public class _19SingletonThreadSafe {
    static void main() {
        //Demo obj = new Demo(); not possible constructor is private
        Demo obj = Demo.getInstance();
        obj.display();


        //Ramo r = new Ramo(); not possible constructor is private
        Ramo r= Ramo.getInstance(10);
        System.out.println(r.a);//10

        Ramo rr = Ramo.getInstance(20);
        System.out.println(rr.a);//10

        Ramo rrr = Ramo.getInstance(30);
        System.out.println(rrr.a);//10
    }
}
