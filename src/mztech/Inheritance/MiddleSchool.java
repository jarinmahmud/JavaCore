package mztech.Inheritance;

public class MiddleSchool {
    public static void mS() {
        //String msGradDate = "I graduated from Middle School in 2008";
        //System.out.println(msGradDate);
        double[] msGPA = {3.5, 3.6, 3.7};
        for (int i = 0; i < msGPA.length; i++) {
        }
        String[] msGPAYears = {"My GPA was " + msGPA[0] + " in the 6th grade", "My GPA was " + msGPA[1] + " in the 7th grade",
                "My GPA was " + msGPA[2] + " in the 8th grade"};
        for (int i = 0; i < msGPAYears.length; i++) {
            System.out.println(msGPAYears[i]);
        }
        System.out.println("I won the following awards in Middle School: ");
        String[] awardsWon = {"Student of the Year", "The Spelling Bee Regionals in 2006",
                "Captain of the Handball Team, 2007", "PSAL Champions, 2007"};
        for (String s : awardsWon) {
            System.out.println(s);
        }

    }

    public void GradDate() {
        System.out.println("I graduated from Middle School in 2008");
    }
}
