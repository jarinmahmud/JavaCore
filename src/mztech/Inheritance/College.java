package mztech.Inheritance;

public class College extends HighSchool {
    public static void uni() {
        /*String uniGradDate = "I graduated from undergrad in 2016 with a Bachelors Degree in Computer Science from Hunter";
        System.out.println(uniGradDate);*/
        double[] uniGPA = {3.0, 3.2, 3.5, 3.4};
        for (int i = 0; i < uniGPA.length; i++) ;
        String[] uniGPAYears = {"My GPA was " + uniGPA[0] + " in my freshman year", "My GPA was " + uniGPA[1] + " in my sophomore year",
                "My GPA was " + uniGPA[2] + " in my junior year", "My GPA was " + uniGPA[3] + " in my senior year"};
        for (int i = 0; i < uniGPAYears.length; i++)
            System.out.println(uniGPAYears[i]);
    }

    public void GradDate() {
        System.out.println("I graduated from undergrad in 2016 with a Bachelors Degree in Computer Science from Hunter");
    }
}