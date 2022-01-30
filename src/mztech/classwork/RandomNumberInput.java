package mztech.classwork;

import java.util.Scanner;

public class RandomNumberInput {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the starting number of the range: ");
        int rsnum = sc.nextInt();// takes input
        System.out.print("Input the ending number of the range: ");
        int renum = sc.nextInt();// takes input
        int random_num = rsnum + (int) (Math.random() * ((renum - rsnum) + 1));//generates random number
        System.out.println(random_num);
    }
}
