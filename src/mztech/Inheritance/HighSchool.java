package mztech.Inheritance;

public class HighSchool extends MiddleSchool {
    public static void hS() {
        //String hsGradDate = "I graduated from High School in 2012";
        //System.out.println(hsGradDate);
        double[] hsGPA = {3.3, 3.2, 3.8, 3.4};
        for (int i = 0; i < hsGPA.length; i++) {
        }
        String[] hsGPAYears = {"My GPA was " + hsGPA[0] + " in my freshman year", "My GPA was " + hsGPA[1] + " in my sophomore year",
                "My GPA was " + hsGPA[2] + " in my junior year", "My GPA was " + hsGPA[3] + " in my senior year"};
        for (int i = 0; i < hsGPAYears.length; i++) {
            System.out.println(hsGPAYears[i]);
        }
        System.out.println("I won the following awards in High School: ");
        String[] awardsWon = {"Math Competition, 2010", "Chess Tournament, 2010", "Captain of the Handball Team, 2011",
                "PSAL Tournament, 2011", "PSAL Champion, 2011", "Valedictorian, 2012", "High School Basketball Tournament, 2012, " +
                "High School Basketball Championship, 2012 "};
        for (int i = 0; i < awardsWon.length; i++) {
            System.out.println(awardsWon[i]);
        }

    }

    public void GradDate() {
        System.out.println("I graduated from High School in 2012");
    }
}