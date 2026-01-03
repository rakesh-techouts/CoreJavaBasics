package javabasics.assignment1;

class Rama{
    private String name;
    private int year;
    private float avg;

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Rama r= new Rama();
        r.setName("Bejjenki Rakesh");
        r.setYear(2003);
        r.setAvg(99.98f);

        System.out.println("Details: ");
        System.out.println("Name: "+r.getName()); //not accessed by r.name
        System.out.println("Year: "+r.getYear());//not accessed by r.year
        System.out.println("Average: "+r.getAvg());// not accessed by r.avg
    }
}
