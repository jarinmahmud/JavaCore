package homework;

public class ParentClass {
    static String firstName = "Jarin";
    static String lastName = "Mahmud"; //why static? why does niot work without static?

    public static void printFirstName() {
        System.out.println(firstName);
    }

    public void favoriteFood() {
        System.out.println("Parent's favorite food is Sushi.");
    }


}
