package Homework;

public class InfoInput {
    String name;
    String email;
    String phone;
    String address;

    public InfoInput(String inputName, String inputEmail, String inputPhone, String inputAddress) {
        name = inputName;
        email = inputEmail;
        phone = inputPhone;
        address = inputAddress;

        System.out.println("Name:" + name);
        System.out.println("Email:" + email);
        System.out.println("Phone:" + phone);
        System.out.println("Address:" + address);
        System.out.println("\n");


    }

}
