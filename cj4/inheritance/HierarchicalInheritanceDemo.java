package javabasics.cj4.inheritance;


class Bike {
    void ride() {
        System.out.println("This bike is on ride");
    }
}

class Pulser extends Bike {
    void pulserSounds() {
        System.out.println("Pusler Sounds");
    }
}

class Bullet extends Bike {
    void bulletShout() {
        System.out.println("Bullet Shouts");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Pulser p = new Pulser();
        p.pulserSounds();
        p.ride();

        Bullet b = new Bullet();
        b.bulletShout();
        b.ride();
    }
}
