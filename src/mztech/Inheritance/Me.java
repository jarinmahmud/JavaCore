package mztech.Inheritance;

import java.util.Scanner;

public class Me extends College {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Me mySchoolHistory = new Me();
        MiddleSchool msGrad = new MiddleSchool();
        MiddleSchool hsGrad = new HighSchool();
        MiddleSchool uniGrad = new College();
        try {
            System.out.println("Which school record would you like to see: Middle School, High School, or College: ");
            String schoolHistory = input.nextLine();
            if (schoolHistory.equals("Middle School")) {
                msGrad.GradDate();
                mySchoolHistory.mS();
            } else if (schoolHistory.equals("High School")) {
                hsGrad.GradDate();
                mySchoolHistory.hS();
            } else if (schoolHistory.equals("College")) {
                uniGrad.GradDate();
                mySchoolHistory.uni();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}