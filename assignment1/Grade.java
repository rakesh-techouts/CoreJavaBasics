package javabasics.assignment1;

import java.util.Scanner;

public class Grade {
    static void gradeByElseIF(float avg) {
        String grade = null;
        if (avg <= 100 && avg > 90) grade = "OutStanding";
        else if (avg <= 90 && avg > 80) grade = "A+";
        else if (avg <= 80 && avg > 70) grade = "A";
        else if (avg <= 70 && avg > 60) grade = "B+";
        else if (avg <= 60 && avg > 50) grade = "B";
        else if (avg <= 50 && avg > 40) grade = "C";
        else grade = "fail";
        System.out.println("Grade: " + grade);
    }
    static void gradeBySwitch(float avg) {
        String grade = null;
        int a=(int)avg/10;
        switch(a){
            case 10,9 -> grade="Outstanding";
            case 8 -> grade = "A+";
            case 7 -> grade = "A";
            case 6 -> grade = "B+";
            case 5 -> grade = "B";
            case 4 -> grade = "C";
            case 3,2,1,0 -> grade="fail";
        }
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three subjects marks separated by spaces(Out of 100): ");
        float m1 = sc.nextFloat();
        float m2 = sc.nextFloat();
        float m3 = sc.nextFloat();
        float avg = (m1 + m2 + m3) / 3;
        gradeByElseIF(avg);
        gradeBySwitch(avg);
    }
}
