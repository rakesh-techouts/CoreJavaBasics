package javabasics.cj4.inheritance;


interface Printable {
    void print();
    void show();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing document...");
    }
    public void show() {
        System.out.println("Showing document...");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();

        Printable doc1 = new Document();
        doc1.print();
        doc1.show();

        Showable doc2 = new Document();
        //doc2.print();  it does not works because it works on reference of object
        doc2.show();
    }
}
