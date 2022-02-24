package Homework;

public class InfoInput {
    String name;
    String email;
    String phone;
    String streetAddress;
    String city;
    String state;
    int zip;

    public InfoInput(String inputName, String inputEmail, String inputPhone, String inputAddress, String inputCity, String inputState, int inputZip) {
        name = inputName;
        email = inputEmail;
        phone = inputPhone;
        streetAddress = inputAddress;
        city = inputCity;
        state = inputState;
        zip = inputZip;

        System.out.println("Name:" + name);
        System.out.println("Email:" + email);
        System.out.println("Phone:" + phone);
        System.out.println("Address:" + streetAddress + ",");
        System.out.print(city + ",");
        System.out.print(state + ",");
        System.out.println(zip + ".");
        System.out.println("\n");


    }

}
