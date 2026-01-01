package javabasics.cj4.inheritance;


class Helloo {
    public void display() {
        System.out.println("This is Hello Display");
    }

    Helloo() {
        System.out.println("This Hello Constructor");
    }
}

class World extends Helloo {
    World() {
        System.out.println("This World Constructor");
    }

    public void display() {
        super.display();
        System.out.println("This is World Display");
    }
}

public class MultiLevelInheritanceEx {
    public static void main(String[] args) {
        World w = new World();
        w.display();
    }
}
