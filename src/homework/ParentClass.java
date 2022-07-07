package homework;

public class ParentClass {
    static String firstName = "Jarin";
    static String lastName = "Mahmud"; //why static? why does not work without static?
    //for creating instance
    // we dont want to have another first name, for that we need to static the variable
    //it is nit class level, outside main method

    public static void printFirstName() {
        System.out.println(firstName);
    }

    public void favoriteFood() {
        System.out.println("Parent's favorite food is Sushi.");
    }


}
