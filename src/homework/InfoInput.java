package homework;

public class InfoInput {
    String name, email, street, city, state;
    long phone;
    int zip;

    public InfoInput(String inputName, String inputEmail, long inputPhone, String inputStreet, String inputCity, String inputState, int inputZip) {
        name = inputName;
        email = inputEmail;
        phone = inputPhone;
        street = inputStreet;
        city = inputCity;
        state = inputState;
        zip = inputZip;

        System.out.println("Name:" + name);
        System.out.println("Email:" + email);
        System.out.println("Phone:" + phone);
        System.out.println("Address:");
        System.out.println(street + ",");
        System.out.println(city + "," + state + " " + zip + "." + "\n");
    }

}
